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

internal actual fun URIHandler_openUri(uri: String) {
    PlatformProxy.uriProxy?.openUri(uri)
}

internal actual fun ClipboardManager_setText(text: String) {
    PlatformProxy.clipboardProxy?.setText(text)
}

internal actual fun ClipboardManager_getText(): String? = PlatformProxy.clipboardProxy?.getText()

internal actual fun ClipboardManager_hasText(): Boolean =
    PlatformProxy.clipboardProxy?.hasText() ?: false

/**
 * Sets cursor for the platform component.
 */
internal actual fun CursorManager_setCursor(component: Any, cursor: Cursor) {
    PlatformProxy.cursorProxy?.setCursor(component, cursor)
}

/**
 * Gets current cursor for the platform component, or null if not defined or known.
 */
internal actual fun CursorManager_getCursor(component: Any): Cursor? =
    PlatformProxy.cursorProxy?.getCursor(component)