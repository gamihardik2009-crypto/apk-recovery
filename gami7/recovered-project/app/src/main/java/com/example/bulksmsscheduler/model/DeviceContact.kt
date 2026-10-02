package com.example.bulksmsscheduler.model

/**
 * A single contact as read from the device's contact provider.
 *
 * [phone] keeps the raw, formatted value for display; comparisons always go
 * through [ClientPhones.normalize] so "+91 98765 43210" and "9876543210" are
 * treated as the same number.
 */
data class DeviceContact(
    val name: String,
    val phone: String,
)
