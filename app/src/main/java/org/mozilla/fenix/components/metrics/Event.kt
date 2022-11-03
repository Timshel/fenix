/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fenix.components.metrics

sealed class Event {

    // Interaction events with extras

    sealed class Search

    internal open val extras: Map<*, String>?
        get() = null

    /**
     * Events related to growth campaigns.
     */
    sealed class GrowthData(val tokenName: String) : Event() {
        /**
         * Event recording whether Firefox has been set as the default browser.
         */
        object SetAsDefault : GrowthData("xgpcgt")
    }
}
