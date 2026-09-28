package com.example.bulksmsscheduler.model

/**
 * RECOVERED: `HomeStatsData(sent, failed, pending)` - the dashboard counters,
 * produced by the single aggregate query in the schedule DAO:
 * ```
 * SELECT COUNT(CASE WHEN status = 'SENT'   AND scheduledDate BETWEEN ? AND ? THEN 1 END) as sent,
 *        COUNT(CASE WHEN status = 'FAILED' AND scheduledDate BETWEEN ? AND ? THEN 1 END) as failed,
 *        COUNT(CASE WHEN status = 'PENDING' AND scheduledDate BETWEEN ? AND ? THEN 1 END) as pending
 * FROM schedules
 * ```
 */
data class HomeStatsData(
    val sent: Int = 0,
    val failed: Int = 0,
    val pending: Int = 0,
)
