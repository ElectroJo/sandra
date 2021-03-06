/*
 *    Copyright 2017-2020 Avery Clifton and Logan Devecka
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.sandrabot.sandra.constants

import com.sandrabot.sandra.SandraInfo

object Constants {

    const val APPLICATION_ID = 302915036492333067L

    const val PREFIX = "s."
    const val BETA_PREFIX = "b."
    const val TWITCH = "https://twitch.tv/averen"

    val VERSION = "${SandraInfo.VERSION}_${SandraInfo.COMMIT.substring(0, 8)}"
    val USER_AGENT = "Sandra/$VERSION (+${Website.WEBSITE})"

}
