package com.example.bulksmsscheduler.model

/**
 * Lifecycle of a single queued SMS.
 *
 * RECOVERED: original enum order and names are exactly `SENT, FAILED, PENDING`
 * (read from the recovered `R1.c` enum initialiser: SENT=ordinal 0, FAILED=1,
 * PENDING=2).  The enum is persisted as TEXT, so the ordinal must not change.
 */
enum class ScheduleStatus {
    SENT,
    FAILED,
    PENDING,
}
