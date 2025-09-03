/*
 * Tencent is pleased to support the open source community by making ovCompose available.
 * Copyright (C) 2025 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.skiko

import org.jetbrains.skia.Canvas
import org.jetbrains.skia.PixelGeometry

/**
 * Generic layer for Skiko rendering.
 */
actual open class SkiaLayer {
    /**
     * Current graphics API used for rendering.
     */
    actual var renderApi: GraphicsApi
        get() = TODO("Not yet implemented")
        set(value) {}

    /**
     * Current content scale.
     */
    actual val contentScale: Float
        get() = TODO("Not yet implemented")

    /**
     * Pixel geometry corresponding to graphics device which renders this layer
     */
    actual val pixelGeometry: PixelGeometry
        get() = TODO("Not yet implemented")

    /**
     * If rendering is full screen.
     */
    actual var fullscreen: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    /**
     * If transparency is enabled.
     */
    actual var transparency: Boolean
        get() = TODO("Not yet implemented")
        set(value) {}

    /**
     * Underlying platform component.
     */
    actual val component: Any?
        get() = TODO("Not yet implemented")

    /**
     * Current view used for rendering.
     */
    actual var skikoView: SkikoView?
        get() = TODO("Not yet implemented")
        set(value) {}

    /**
     * Attach this SkikoView to platform container.
     * Actual type of attach container is platform-specific.
     */
    actual fun attachTo(container: Any) {
    }

    /**
     * Detach this SkikoView from platform container.
     */
    actual fun detach() {
    }

    /**
     * Force redraw.
     */
    actual fun needRedraw() {
    }

    /**
     * Drawing function.
     */
    internal actual fun draw(canvas: Canvas) {
    }

}