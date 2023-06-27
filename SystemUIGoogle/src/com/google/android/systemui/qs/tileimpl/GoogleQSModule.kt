/*
 * Copyright (C) 2022 The PixelExperience Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.systemui.qs.tileimpl;

import com.android.systemui.qs.tileimpl.QSTileImpl

import com.google.android.systemui.qs.tiles.BatterySaverTileGoogle
import com.google.android.systemui.qs.tiles.ReverseChargingTile

// Pixeldust qs tiles
import com.pixeldust.android.systemui.qs.tiles.AODTile
import com.pixeldust.android.systemui.qs.tiles.CaffeineTile
import com.pixeldust.android.systemui.qs.tiles.DataSwitchTile
import com.pixeldust.android.systemui.qs.tiles.FlashlightStrengthTile
import com.pixeldust.android.systemui.qs.tiles.LocaleTile
import com.pixeldust.android.systemui.qs.tiles.ScreenshotTile
import com.pixeldust.android.systemui.qs.tiles.SyncTile
import com.pixeldust.android.systemui.qs.tiles.VpnTile

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface GoogleQSModule {

    /** Inject ReverseChargingTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(ReverseChargingTile.TILE_SPEC)
    fun bindReverseChargingTile(reverseChargingTile: ReverseChargingTile): QSTileImpl<*>

    /** Inject BatterySaverTileGoogle into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(BatterySaverTileGoogle.TILE_SPEC)
    fun bindBatterySaverTileGoogle(batterySaverTileGoogle: BatterySaverTileGoogle): QSTileImpl<*>

    /** Inject AODTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(AODTile.TILE_SPEC)
    fun bindAODTile(aodTile: AODTile): QSTileImpl<*>

    /** Inject CaffeineTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(CaffeineTile.TILE_SPEC)
    fun bindCaffeineTile(caffeineTile: CaffeineTile): QSTileImpl<*>

    /** Inject DataSwitchTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(DataSwitchTile.TILE_SPEC)
    fun bindDataSwitchTile(dataSwitchTile: DataSwitchTile): QSTileImpl<*>

    /** Inject FlashlightStrengthTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(FlashlightStrengthTile.TILE_SPEC)
    fun bindFlashlightStrengthTile(flashlightStrengthTile: FlashlightStrengthTile): QSTileImpl<*>

    /** Inject LocaleTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(LocaleTile.TILE_SPEC)
    fun bindLocaleTile(localeTile: LocaleTile): QSTileImpl<*>

    /** Inject ScreenshotTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(ScreenshotTile.TILE_SPEC)
    fun bindScreenshotTile(screenshotTile: ScreenshotTile): QSTileImpl<*>

    /** Inject SyncTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(SyncTile.TILE_SPEC)
    fun bindSyncTile(syncTile: SyncTile): QSTileImpl<*>

    /** Inject VpnTile into tileMap in QSModule */
    @Binds
    @IntoMap
    @StringKey(VpnTile.TILE_SPEC)
    fun bindVpnTile(vpnTile: VpnTile): QSTileImpl<*>
}
