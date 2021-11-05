/*
 * Copyright (c) 2021 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.app.ui.robot

import androidx.test.espresso.Espresso
import com.adevinta.android.barista.interaction.BaristaClickInteractions
import im.vector.app.R

class NewRoomRobot {

    fun createNewRoom(block: CreateNewRoomRobot.() -> Unit) {
        BaristaClickInteractions.clickOn(R.string.create_new_room)
        val createNewRoomRobot = CreateNewRoomRobot()
        block(createNewRoomRobot)
        if (!createNewRoomRobot.createdRoom) {
            Espresso.pressBack()
        }
    }
}