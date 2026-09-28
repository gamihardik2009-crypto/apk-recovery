package com.example.bulksmsscheduler.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.bulksmsscheduler.model.Client
import kotlinx.coroutines.flow.Flow

/**
 * RECOVERED client DAO ("ClientDao" - original class name was obfuscated).
 *
 * Every statement below was lifted from the original APK:
 *  - `SELECT * FROM clients ORDER BY orderIndex ASC`   (live list shown in the UI)
 *  - `SELECT * FROM clients`                           (engine startup snapshot)
 *  - `SELECT COUNT(*) FROM clients`                    ("Total Clients" tile)
 *  - `SELECT * FROM clients WHERE id = ?`              (worker, per schedule)
 *  - `DELETE FROM clients WHERE id IN (...)`           (bulk delete)
 *  - `DELETE FROM clients WHERE source = ?`            ("Clear Imported Clients")
 *  - `INSERT OR REPLACE INTO clients (...)`            (Room insert adapter)
 */
@Dao
interface ClientDao {

    @Query("SELECT * FROM clients ORDER BY orderIndex ASC")
    fun observeAllClients(): Flow<List<Client>>

    @Query("SELECT * FROM clients")
    suspend fun getAllClients(): List<Client>

    @Query("SELECT * FROM clients WHERE active = 1 ORDER BY orderIndex ASC")
    suspend fun getActiveClients(): List<Client>

    @Query("SELECT COUNT(*) FROM clients")
    suspend fun getClientCount(): Int

    @Query("SELECT * FROM clients WHERE id = :id")
    suspend fun getClientById(id: String): Client?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClient(client: Client)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClients(clients: List<Client>)

    @Update
    suspend fun updateClient(client: Client)

    @Delete
    suspend fun deleteClient(client: Client)

    @Query("DELETE FROM clients WHERE id IN (:ids)")
    suspend fun deleteClientsByIds(ids: List<String>)

    @Query("DELETE FROM clients WHERE source = :source")
    suspend fun deleteClientsBySource(source: String)

    @Query("DELETE FROM clients")
    suspend fun deleteAllClients()
}
