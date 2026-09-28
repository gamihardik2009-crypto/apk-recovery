package com.example.bulksmsscheduler.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * A reusable SMS body ("template" / "SMS template" in the UI).
 *
 * RECOVERED table definition:
 * ```
 * CREATE TABLE IF NOT EXISTS `templates` (
 *   `id` TEXT NOT NULL, `title` TEXT NOT NULL, `greeting` TEXT NOT NULL,
 *   `message` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `order` INTEGER NOT NULL,
 *   PRIMARY KEY(`id`))
 * ```
 *
 * The planner composes the final text as:
 *   `"$greeting $message"` (greeting omitted when blank)
 * and then replaces the literal `{name}` placeholder with the client name
 * (see [com.example.bulksmsscheduler.utils.SchedulePlanner]).
 */
@Entity(tableName = "templates")
data class MessageTemplate(
    @PrimaryKey val id: String,
    val title: String,
    val greeting: String,
    val message: String,
    val enabled: Boolean = true,
    /** Rotation order. `order` is a SQL keyword, hence the explicit column name. */
    @ColumnInfo(name = "order")
    val order: Int = 0,
)
