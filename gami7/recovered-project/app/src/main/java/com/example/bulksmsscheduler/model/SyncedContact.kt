package com.example.bulksmsscheduler.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Remembers every device contact the app has already seen (whether it was
 * imported by the user or auto-added by the sync).
 *
 * This is what makes the automatic contact sync idempotent:
 *  - a contact is only ever added to the client list once, and
 *  - contacts the user later removes from the app are *not* silently re-added,
 *    because the phone is still marked as already synced.
 */
@Entity(tableName = "synced_contacts")
data class SyncedContact(
    /** Digits-only phone number ([ClientPhones.normalize] form). */
    @PrimaryKey val phone: String,
    val name: String = "",
    val syncedAt: Long = System.currentTimeMillis(),
)
