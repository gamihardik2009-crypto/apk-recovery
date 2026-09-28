package com.example.bulksmsscheduler.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.bulksmsscheduler.model.MessageTemplate
import kotlinx.coroutines.flow.Flow

/**
 * RECOVERED template DAO ("TemplateDao" - original class name was obfuscated).
 *
 * Recovered statements:
 *  - `SELECT * FROM templates ORDER BY \`order\` ASC`
 *  - `DELETE FROM templates WHERE id = ?`
 *  - `INSERT OR REPLACE INTO templates (id,title,greeting,message,enabled,order) VALUES (?,?,?,?,?,?)`
 */
@Dao
interface TemplateDao {

    @Query("SELECT * FROM templates ORDER BY `order` ASC")
    fun observeAllTemplates(): Flow<List<MessageTemplate>>

    @Query("SELECT * FROM templates ORDER BY `order` ASC")
    suspend fun getAllTemplates(): List<MessageTemplate>

    @Query("SELECT * FROM templates WHERE enabled = 1 ORDER BY `order` ASC")
    suspend fun getEnabledTemplates(): List<MessageTemplate>

    @Query("SELECT COUNT(*) FROM templates WHERE enabled = 1")
    suspend fun getEnabledTemplateCount(): Int

    @Query("SELECT * FROM templates WHERE id = :id")
    suspend fun getTemplateById(id: String): MessageTemplate?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTemplate(template: MessageTemplate)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTemplates(templates: List<MessageTemplate>)

    @Update
    suspend fun updateTemplate(template: MessageTemplate)

    @Delete
    suspend fun deleteTemplate(template: MessageTemplate)

    @Query("DELETE FROM templates WHERE id = :id")
    suspend fun deleteTemplateById(id: String)

    @Query("DELETE FROM templates")
    suspend fun deleteAllTemplates()

    /** Highest `order` currently stored, used when appending a new template. */
    @Query("SELECT COALESCE(MAX(`order`), -1) FROM templates")
    suspend fun getMaxOrder(): Int
}
