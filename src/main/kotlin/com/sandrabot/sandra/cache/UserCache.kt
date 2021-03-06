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

package com.sandrabot.sandra.cache

import com.beust.klaxon.JsonObject
import com.sandrabot.sandra.Sandra
import com.sandrabot.sandra.constants.RedisPrefix
import com.sandrabot.sandra.entities.EntityCache
import com.sandrabot.sandra.entities.SandraUser

class UserCache(private val sandra: Sandra) : EntityCache<SandraUser>(sandra, RedisPrefix.USER) {

    override fun createEntity(key: Long, data: JsonObject): SandraUser {
        return SandraUser(sandra, key, data)
    }

}
