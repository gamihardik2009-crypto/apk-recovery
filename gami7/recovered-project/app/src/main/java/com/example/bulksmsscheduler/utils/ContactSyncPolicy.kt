package com.example.bulksmsscheduler.utils

import com.example.bulksmsscheduler.model.ClientPhones

/**
 * Pure decision logic for the automatic contact sync.
 *
 * Extracted from the repository so the "only add genuinely new contacts"
 * behaviour can be unit-tested without a database or an Android device.
 */
object ContactSyncPolicy {

    const val INITIALIZED_SENTINEL = "__SYNC_INITIALIZED__"

    data class Decision(
        /** Normalized phones that must be added to the client list. */
        val phonesToAdd: List<String>,
        /** Normalized phones that were not known before and must be recorded as seen. */
        val newlyKnownPhones: List<String>,
    )

    /**
     * @param devicePhones         phones currently on the device (any format)
     * @param existingClientPhones normalized phones already in the client list
     * @param knownPhones          normalized phones the app has already synced before
     */
    fun decide(
        devicePhones: List<String>,
        existingClientPhones: Set<String>,
        knownPhones: Set<String>,
    ): Decision {
        val isFirstSync = INITIALIZED_SENTINEL !in knownPhones
        val phonesToAdd = mutableListOf<String>()
        val newlyKnownPhones = mutableListOf<String>()
        val known = knownPhones.toMutableSet()
        val existing = existingClientPhones.toMutableSet()
        val seenThisPass = mutableSetOf<String>()

        if (isFirstSync) {
            // Initial baseline pass: mark all existing device contacts and the sentinel as known
            // so we do NOT dump the user's existing address book into the client list.
            newlyKnownPhones.add(INITIALIZED_SENTINEL)
            for (raw in devicePhones) {
                val normalized = ClientPhones.normalize(raw)
                if (normalized.isNotEmpty() && seenThisPass.add(normalized)) {
                    newlyKnownPhones.add(normalized)
                }
            }
            return Decision(phonesToAdd = emptyList(), newlyKnownPhones = newlyKnownPhones)
        }

        for (raw in devicePhones) {
            val normalized = ClientPhones.normalize(raw)
            if (normalized.isEmpty() || normalized == INITIALIZED_SENTINEL || !seenThisPass.add(normalized)) continue

            val wasKnownBefore = normalized in known
            if (!wasKnownBefore) {
                known.add(normalized)
                newlyKnownPhones.add(normalized)
            }

            // Already one of our clients -> nothing to add.
            if (normalized in existing) continue

            // Only brand-new contacts added after initial setup are auto-added.
            if (wasKnownBefore) continue

            phonesToAdd.add(normalized)
            existing.add(normalized)
        }

        return Decision(phonesToAdd = phonesToAdd, newlyKnownPhones = newlyKnownPhones)
    }
}
