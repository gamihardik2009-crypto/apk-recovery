package com.example.bulksmsscheduler.ui

import java.util.Locale

/**
 * Hard-coded user-visible strings recovered from the original DEX string pool.
 *
 * Strings put through the Android resource system (e.g. `app_name`, the only
 * entry left in `strings.xml`) live in `R.string.*`.  Everything else in the
 * original app was hard-coded inside the Compose screens, and was recovered
 * from `analysis/raw/ui_strings_candidates.txt` (which was itself filtered out
 * of the full `dex_strings.txt` pool).  Centralising them here keeps the
 * recovered text next to the screens that show it (matching the original code
 * layout) and gives a single, reviewable source for the recovered copy.
 *
 * This is deliberately a small, high-confidence subset: only strings that look
 * like first-party UI labels (not library/exceptions) and that were clearly
 * emitted by `com.example.bulksmsscheduler` code paths.  Strings with clear
 * context are grouped by the screen that used them; the rest sit in `misc`.
 */
object RecoveredStrings {

    // ------------------------------------------------------------- app meta --
    /** Recovered from the manifest label / home screen title. */
    const val APP_TITLE = "Bulk SMS Scheduler"

    /** Shown in the system notification when SmsManager stops the service. */
    const val BATTERY_OPTIMIZATION_WARNING =
        "Android may stop the SMS service to save battery. To ensure scheduled " +
            "messages are sent on time, please disable optimization for Bulk SMS " +
            "Scheduler."

    // ------------------------------------------------------------ dashboard --
    const val AUTOMATION_ENGINE = "Automation Engine"
    const val AUTOMATION_SETUP = "Automation Setup"
    const val AUTOMATION_PICKS_FROM_LIST = "Automation picks from this list"
    const val AUTOMATION_DISABLED = "Automation disabled"
    const val BATTERY_OPTIMIZATION_TITLE = "Battery Optimization"

    /** "New data added, restart the engine" warning (see AppSettings.newDataAdded). */
    const val NEW_DATA_RESTART_ENGINE =
        "You added a new SMS or client. Restart engine to include this data in automation."

    // -------------------------------------------------------------- clients --
    const val CLIENT_MANAGEMENT = "Client Management"
    const val ADD_CLIENT_OPTIONS = "Add Client Options"
    const val IMPORT_CONTACTS = "Import Contacts"
    const val CLEAR_IMPORTED_CLIENTS = "Clear Imported Clients"
    const val CONTINUE_WITH_REMAINING_CLIENTS = "Continue with remaining clients"

    // ---------------------------------------------------------- schedules -----
    const val ADD_TO_END_OF_PLAN = "Add to End of Plan"
    const val RETRY_FAILED_MESSAGES = "Retry Failed Messages"
    const val FAILED_MESSAGES = "Failed Messages"
    const val DELIVERY_FAILED = "Delivery failed"
    const val SCHEDULER_SERVICE = "SMS Scheduler Service"

    // ----------------------------------------------------------- templates ----
    const val USE_NAME_IN_SMS_TEMPLATES = "Use name in SMS templates"
    const val DELETE_TEMPLATE = "Delete Template"

    // -------------------------------------------------------------- misc -------
    const val SKIPPING_SUNDAY = "Skipping Sunday"
    const val NETWORK_CONNECTION_LOST = "Network connection lost"
    const val OUTSIDE_WORK_HOURS = "Outside work hours:"

    // ------------------------------------------------- screen labels (nav) -----
    const val TAB_HOME = "Home"
    const val TAB_CLIENTS = "Clients"
    const val TAB_TEMPLATES = "Templates"
    const val TAB_SCHEDULES = "Schedules"

    // ---------------------------------------------------------- home screen ----
    const val PENDING_THIS_WEEK = "Pending (This Week)"
    const val SEND_ALL_NOW = "Send All Now (Immediate)"
    const val START_FROM_BEGINNING = "Start from Beginning"
    const val RETRY_ALL_FAILED = "Retry All Failed"
    const val FAILED_DELIVERIES = "Failed Deliveries"
    const val RETRY_FAILURE_INFO =
        "Failed messages can be automatically retried every 2 hours or manually triggered."
    const val EMPTY_STATE = "Nothing here yet."

    // --------------------------------------------------------- clients screen -
    const val SEARCH_CLIENTS = "Search clients..."
    const val SEARCH_BY_CLIENT_NAME = "Search by client name..."
    const val SEARCH_CONTACTS = "Search contacts..."
    const val CLEAR_IMPORTED_CLIENTS_LONG =
        "Removes all clients imported from phone contacts (not manual entries)."

    // ------------------------------------------------------- templates screen -
    const val ENABLED_ROTATION_HINT = "Enabled templates rotate through the plan."

    // ------------------------------------------------------ schedules screen ---
    const val SELECT_START_DATE = "Select Start Date"
    const val SELECT_START_TIME = "Select Start Time"
    const val SENDING_INTERVAL = "Sending Interval"
    const val DUE = "Due"

    fun formatTimeToAmPm(timeStr: String): String {
        val trimmed = timeStr.trim()
        if (trimmed.isEmpty()) return timeStr
        if (trimmed.contains("AM", ignoreCase = true) || trimmed.contains("PM", ignoreCase = true)) {
            return trimmed
        }
        val parts = trimmed.split(":")
        if (parts.size >= 2) {
            val hour = parts[0].toIntOrNull() ?: return trimmed
            val minute = parts[1]
            val amPm = if (hour >= 12) "PM" else "AM"
            val hour12 = when {
                hour == 0 -> 12
                hour > 12 -> hour - 12
                else -> hour
            }
            return String.format(Locale.US, "%02d:%s %s", hour12, minute, amPm)
        }
        return trimmed
    }
}