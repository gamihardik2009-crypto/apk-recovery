package com.gami.termux.util

import android.content.Context
import android.net.Uri
import android.provider.ContactsContract

object ContactHelper {
    fun getContactName(context: Context, phoneNumber: String): String {
        val uri = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(phoneNumber))
        val projection = arrayOf(ContactsContract.PhoneLookup.DISPLAY_NAME)
        
        return try {
            context.contentResolver.query(uri, projection, null, null, null)?.use { cursor ->
                if (cursor.moveToFirst()) {
                    cursor.getString(0)
                } else {
                    "Unknown"
                }
            } ?: "Unknown"
        } catch (e: Exception) {
            "Unknown"
        }
    }
}