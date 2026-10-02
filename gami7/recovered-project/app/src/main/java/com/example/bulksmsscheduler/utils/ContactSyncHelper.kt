package com.example.bulksmsscheduler.utils

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.provider.ContactsContract
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.bulksmsscheduler.data.AppDatabase
import com.example.bulksmsscheduler.model.ClientPhones
import com.example.bulksmsscheduler.model.DeviceContact
import com.example.bulksmsscheduler.repository.SmsRepository

/**
 * Reads the device contact list and hands the *newly added* contacts to
 * [SmsRepository.syncDeviceContacts], which performs the deduplicated,
 * serialized insert and refreshes the plan once.
 *
 * The helper itself is intentionally stateless: all duplicate protection lives
 * in the repository so every caller (startup, `ContentObserver`, WorkManager)
 * goes through the same lock and cannot create duplicate clients.
 */
object ContactSyncHelper {
    private const val TAG = "ContactSyncHelper"

    suspend fun syncContacts(context: Context) {
        try {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_CONTACTS)
                != PackageManager.PERMISSION_GRANTED
            ) {
                Log.w(TAG, "READ_CONTACTS permission not granted.")
                return
            }

            val deviceContacts = loadDeviceContacts(context)
            if (deviceContacts.isEmpty()) return

            val repository = SmsRepository(AppDatabase.getInstance(context), context)
            val added = repository.syncDeviceContacts(deviceContacts)

            if (added.isNotEmpty()) {
                NotificationUtils.showNewContactsNotification(context, added.map { it.name })
                Log.i(TAG, "Auto-added ${added.size} new contact(s) and refreshed the plan.")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error syncing contacts", e)
        }
    }

    private fun loadDeviceContacts(context: Context): List<DeviceContact> {
        val contacts = mutableListOf<DeviceContact>()
        val seenPhones = mutableSetOf<String>()
        val contentResolver = context.contentResolver

        try {
            val cursor = contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                arrayOf(
                    ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,
                    ContactsContract.CommonDataKinds.Phone.NUMBER
                ),
                null,
                null,
                "${ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME} ASC"
            )

            cursor?.use {
                val nameIndex = it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME)
                val numberIndex = it.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER)

                while (it.moveToNext()) {
                    val rawName = if (nameIndex >= 0) it.getString(nameIndex) else null
                    val name = rawName?.takeIf { n -> n.isNotBlank() } ?: "Unknown"
                    val rawNumber = if (numberIndex >= 0) it.getString(numberIndex) else null
                    val cleanPhone = rawNumber?.let { n -> ClientPhones.normalize(n) } ?: ""

                    if (cleanPhone.isNotBlank() && seenPhones.add(cleanPhone)) {
                        contacts.add(DeviceContact(name = name, phone = rawNumber ?: cleanPhone))
                    }
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error querying device contacts", e)
        }
        return contacts
    }
}
