package com.example.bulksmsscheduler.utils

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Locks down the automatic contact-sync rules:
 *  - the same phone number in different formats is treated as one contact;
 *  - contacts already in the client list are never added twice;
 *  - after the first sync only genuinely new contacts are auto-added;
 *  - a contact the user removed from the app is not silently re-added.
 */
class ContactSyncPolicyTest {

    @Test
    fun `empty known set initializes baseline and adds no clients`() {
        val decision = ContactSyncPolicy.decide(
            devicePhones = listOf("+91 98765 43210", "9123456780"),
            existingClientPhones = emptySet(),
            knownPhones = emptySet(),
        )

        assertTrue(decision.phonesToAdd.isEmpty())
        assertEquals(
            listOf(ContactSyncPolicy.INITIALIZED_SENTINEL, "919876543210", "9123456780"),
            decision.newlyKnownPhones,
        )
    }

    @Test
    fun `contacts already in the client list are skipped`() {
        val decision = ContactSyncPolicy.decide(
            devicePhones = listOf("+91 98765 43210"),
            existingClientPhones = setOf("919876543210"),
            knownPhones = setOf(ContactSyncPolicy.INITIALIZED_SENTINEL),
        )

        assertTrue(decision.phonesToAdd.isEmpty())
    }

    @Test
    fun `duplicate formats in the device list collapse to one phone`() {
        val decision = ContactSyncPolicy.decide(
            devicePhones = listOf("9876543210", "98765 43210", "98765-43210"),
            existingClientPhones = emptySet(),
            knownPhones = setOf(ContactSyncPolicy.INITIALIZED_SENTINEL, "9876543210"),
        )

        assertTrue(decision.phonesToAdd.isEmpty())
    }

    @Test
    fun `only brand new contacts added after setup are auto-added`() {
        val decision = ContactSyncPolicy.decide(
            devicePhones = listOf("9876543210", "9123456780"),
            existingClientPhones = setOf("9876543210"),
            knownPhones = setOf(ContactSyncPolicy.INITIALIZED_SENTINEL, "9876543210"),
        )

        assertEquals(listOf("9123456780"), decision.phonesToAdd)
        assertEquals(listOf("9123456780"), decision.newlyKnownPhones)
    }

    @Test
    fun `previously synced contact removed by the user is not re-added`() {
        val decision = ContactSyncPolicy.decide(
            devicePhones = listOf("9876543210"),
            existingClientPhones = emptySet(),
            knownPhones = setOf(ContactSyncPolicy.INITIALIZED_SENTINEL, "9876543210"),
        )

        assertTrue(decision.phonesToAdd.isEmpty())
        assertTrue(decision.newlyKnownPhones.isEmpty())
    }
}
