package com.example.bulksmsscheduler.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.bulksmsscheduler.model.SyncedContact

/**
 * Tracks which device contacts have already been seen by the auto-sync, so a
 * contact is never added twice and deleted clients are not resurrected.
 */
@Dao
interface SyncedContactDao {

    @Query("SELECT phone FROM synced_contacts")
    suspend fun getAllPhones(): List<String>

    @Query("SELECT COUNT(*) FROM synced_contacts")
    suspend fun getCount(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContacts(contacts: List<SyncedContact>)
}
