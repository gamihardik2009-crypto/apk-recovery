package com.example.bulksmsscheduler.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RewriteQueriesToDropUnusedColumns
import androidx.room.RoomWarnings
import androidx.room.Transaction
import androidx.room.Update
import com.example.bulksmsscheduler.model.HomeStatsData
import com.example.bulksmsscheduler.model.Schedule
import com.example.bulksmsscheduler.model.ScheduleStatus
import com.example.bulksmsscheduler.model.ScheduleWithClient
import kotlinx.coroutines.flow.Flow

/**
 * RECOVERED schedule DAO ("ScheduleDao" - original class name was obfuscated).
 *
 * All SQL below is verbatim from the original APK, including the whitespace of
 * the multi-line statements (the recovery kept the same semantics, not the same
 * string).
 */
@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedules")
    fun observeAllSchedules(): Flow<List<Schedule>>

    @Query("SELECT * FROM schedules ORDER BY scheduledDate ASC, scheduledTime ASC")
    suspend fun getAllSchedules(): List<Schedule>

    @Query("SELECT * FROM schedules WHERE id = :id")
    suspend fun getScheduleById(id: String): Schedule?

    @Query("SELECT * FROM schedules WHERE status = :status ORDER BY scheduledDate ASC, scheduledTime ASC")
    fun observeSchedulesByStatus(status: ScheduleStatus): Flow<List<Schedule>>

    /**
     * RECOVERED (used by [com.example.bulksmsscheduler.utils.SmsWorker] to pick
     * the batch to send right now): every PENDING schedule that is due.
     */
    @Query(
        """
        SELECT * FROM schedules 
        WHERE status = 'PENDING' 
        AND (scheduledDate < :today OR (scheduledDate = :today AND SUBSTR(scheduledTime, 1, 5) <= SUBSTR(:nowTime, 1, 5)))
        ORDER BY scheduledDate ASC, scheduledTime ASC
    """,
    )
    suspend fun getDuePendingSchedules(today: String, nowTime: String): List<Schedule>

    /**
     * RECOVERED (used when the worker reschedules itself): the next PENDING
     * schedule that is still in the future.
     */
    @Query(
        """
        SELECT * FROM schedules 
        WHERE status = 'PENDING' 
        AND (scheduledDate > :today OR (scheduledDate = :today AND SUBSTR(scheduledTime, 1, 5) > SUBSTR(:nowTime, 1, 5)))
        ORDER BY scheduledDate ASC, scheduledTime ASC
        LIMIT 1
    """,
    )
    suspend fun getNextPendingSchedule(today: String, nowTime: String): Schedule?

    /**
     * Gets the earliest pending schedule in the database regardless of time.
     */
    @Query(
        """
        SELECT * FROM schedules 
        WHERE status = 'PENDING' 
        ORDER BY scheduledDate ASC, scheduledTime ASC
        LIMIT 1
    """,
    )
    suspend fun getFirstPendingSchedule(): Schedule?

    /** RECOVERED: the "recent activity" list on the dashboard. */
    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE status IN ('SENT', 'FAILED')
        ORDER BY scheduledDate DESC, scheduledTime DESC
        LIMIT 10
    """,
    )
    fun observeRecentSchedulesWithClient(): Flow<List<ScheduleWithClient>>

    /** Recent activity list (SENT or FAILED) from the past week (>= sinceDate). */
    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE status IN ('SENT', 'FAILED') AND scheduledDate >= :sinceDate
        ORDER BY scheduledDate DESC, scheduledTime DESC
    """,
    )
    fun observeRecentSchedulesPastWeek(sinceDate: String): Flow<List<ScheduleWithClient>>

    /** RECOVERED: scheduled-message search (query text + optional status filter). */
    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE (:query = '' OR clients.name LIKE '%' || :query || '%' OR clients.phone LIKE '%' || :query || '%')
        AND (:status IS NULL OR schedules.status = :status)
        ORDER BY scheduledDate ASC, scheduledTime ASC
    """,
    )
    fun searchSchedulesWithClient(query: String, status: ScheduleStatus?): Flow<List<ScheduleWithClient>>

    /** RECOVERED: dashboard counters over a date range. */
    @Query(
        """
        SELECT
            COUNT(CASE WHEN status = 'SENT' AND scheduledDate BETWEEN :from AND :to THEN 1 END) as sent,
            COUNT(CASE WHEN status = 'FAILED' AND scheduledDate BETWEEN :from AND :to THEN 1 END) as failed,
            COUNT(CASE WHEN status = 'PENDING' AND scheduledDate BETWEEN :from AND :to THEN 1 END) as pending
        FROM schedules
    """,
    )
    fun observeStatsBetween(from: String, to: String): Flow<HomeStatsData>

    @Query(
        """
        SELECT
            COUNT(CASE WHEN status = 'SENT' AND scheduledDate >= :from AND scheduledDate <= :to THEN 1 END) as sent,
            COUNT(CASE WHEN status = 'FAILED' AND scheduledDate >= :from AND scheduledDate <= :to THEN 1 END) as failed,
            COUNT(CASE WHEN status = 'PENDING' THEN 1 END) as pending
        FROM schedules
    """,
    )
    fun observeCurrentWeekStats(from: String, to: String): Flow<HomeStatsData>

    /** All-time counters (same shape, no date filter). */
    @Query(
        """
        SELECT
            COUNT(CASE WHEN status = 'SENT' THEN 1 END) as sent,
            COUNT(CASE WHEN status = 'FAILED' THEN 1 END) as failed,
            COUNT(CASE WHEN status = 'PENDING' THEN 1 END) as pending
        FROM schedules
    """,
    )
    fun observeStats(): Flow<HomeStatsData>

    @Query("SELECT COUNT(*) FROM schedules")
    suspend fun getScheduleCount(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchedule(schedule: Schedule)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchedules(schedules: List<Schedule>)

    @Update
    suspend fun updateSchedule(schedule: Schedule)

    @Delete
    suspend fun deleteSchedule(schedule: Schedule)

    @Query("DELETE FROM schedules WHERE id = :id")
    suspend fun deleteScheduleById(id: String)

    /**
     * RECOVERED: `DELETE FROM schedules WHERE status = 'PENDING'`
     * ("Clear history and start from client 1" / restart the plan).
     */
    @Query("DELETE FROM schedules WHERE status = 'PENDING'")
    suspend fun deletePendingSchedules()

    @Query("DELETE FROM schedules WHERE status = 'PENDING' AND scheduledDate > :date")
    suspend fun deletePendingSchedulesAfter(date: String)

    @Query("DELETE FROM schedules WHERE status = 'PENDING' AND scheduledDate >= :fromDate")
    suspend fun deletePendingSchedulesFrom(fromDate: String)

    @Query("SELECT COUNT(*) FROM schedules WHERE clientId = :clientId AND scheduledDate >= :monday AND scheduledDate <= :sunday")
    suspend fun getSchedulesCountForClientInWeek(clientId: String, monday: String, sunday: String): Int

    @Query("SELECT * FROM schedules WHERE scheduledDate >= :monday AND scheduledDate <= :sunday ORDER BY scheduledDate DESC, scheduledTime DESC LIMIT 1")
    suspend fun getLastScheduledInWeek(monday: String, sunday: String): Schedule?

    @Query("SELECT clientId, COUNT(*) as count FROM schedules WHERE scheduledDate <= :untilDate GROUP BY clientId")
    suspend fun getTemplatePointersUpToDate(untilDate: String): List<ClientSentCount>

    @Query("DELETE FROM schedules WHERE status IN ('PENDING', 'FAILED')")
    suspend fun deleteNonSentSchedules()

    @Query("DELETE FROM schedules WHERE scheduledDate < :mondayDate AND status IN ('SENT', 'FAILED')")
    suspend fun deleteHistoryBefore(mondayDate: String)

    @Query("DELETE FROM schedules WHERE scheduledDate < :date")
    suspend fun deleteSchedulesBefore(date: String)

    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE status = 'SENT' AND scheduledDate >= :monday AND scheduledDate <= :sunday
        ORDER BY scheduledDate DESC, scheduledTime DESC
    """,
    )
    suspend fun getSentSchedulesForWeek(monday: String, sunday: String): List<ScheduleWithClient>

    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE status = 'FAILED' AND scheduledDate >= :monday AND scheduledDate <= :sunday
        ORDER BY scheduledDate DESC, scheduledTime DESC
    """,
    )
    suspend fun getFailedSchedulesForWeek(monday: String, sunday: String): List<ScheduleWithClient>

    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE (status = 'FAILED' OR retryCount > 0) AND scheduledDate >= :monday AND scheduledDate <= :sunday
        ORDER BY scheduledDate DESC, scheduledTime DESC
    """,
    )
    suspend fun getFailedAndRescheduledSchedulesForWeek(monday: String, sunday: String): List<ScheduleWithClient>

    @Query("DELETE FROM schedules")
    suspend fun deleteAllSchedules()

    /**
     * RECOVERED behaviour of the UI warning:
     * "? This will also remove any pending messages for this client."
     */
    @Query("DELETE FROM schedules WHERE clientId = :clientId AND status = 'PENDING'")
    suspend fun deletePendingSchedulesForClient(clientId: String)

    @Query("DELETE FROM schedules WHERE clientId = :clientId")
    suspend fun deleteSchedulesForClient(clientId: String)

    @Transaction
    @Suppress(RoomWarnings.QUERY_MISMATCH)
    @RewriteQueriesToDropUnusedColumns
    @Query(
        """
        SELECT * FROM schedules 
        INNER JOIN clients ON schedules.clientId = clients.id
        WHERE schedules.clientId = :clientId
        ORDER BY scheduledDate ASC, scheduledTime ASC
    """,
    )
    suspend fun getSchedulesForClient(clientId: String): List<ScheduleWithClient>

    /**
     * RECOVERED: the date/time of the last scheduled message, used by the
     * "Add to End of Plan" action to continue a plan exactly where it stopped.
     */
    @Query("SELECT * FROM schedules ORDER BY scheduledDate DESC, scheduledTime DESC LIMIT 1")
    suspend fun getLastScheduled(): Schedule?

    @Query("SELECT * FROM schedules WHERE status = 'SENT' ORDER BY scheduledDate DESC, scheduledTime DESC LIMIT 1")
    suspend fun getLastSentSchedule(): Schedule?


    /** RECOVERED: `SELECT * FROM schedules WHERE scheduledDate < ?` */
    @Query("SELECT * FROM schedules WHERE scheduledDate < :date")
    suspend fun getSchedulesBefore(date: String): List<Schedule>

    @Query("SELECT clientId, COUNT(*) as count FROM schedules WHERE status = 'SENT' GROUP BY clientId")
    suspend fun getSentCountsPerClient(): List<ClientSentCount>
}

data class ClientSentCount(
    val clientId: String,
    val count: Int,
)
