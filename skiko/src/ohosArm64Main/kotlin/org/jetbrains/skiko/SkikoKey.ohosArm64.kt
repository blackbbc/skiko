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

actual enum class SkikoKey(val value: Int) {
    KEY_UNKNOWN(-1),
    KEY_A(2017),
    KEY_S(2035),
    KEY_D(2020),
    KEY_F(2022),
    KEY_H(2024),
    KEY_G(2023),
    KEY_Z(2042),
    KEY_X(2040),
    KEY_C(2019),
    KEY_V(2038),
    KEY_B(2018),
    KEY_Q(2033),
    KEY_W(2039),
    KEY_E(2021),
    KEY_R(2034),
    KEY_Y(2041),
    KEY_T(2036),
    KEY_U(2037),
    KEY_I(2025),
    KEY_P(2032),
    KEY_L(2028),
    KEY_J(2026),
    KEY_K(2027),
    KEY_N(2030),
    KEY_M(2029),
    KEY_O(2031),
    KEY_1(2001),
    KEY_2(2002),
    KEY_3(2003),
    KEY_4(2004),
    KEY_5(2005),
    KEY_6(2006),
    KEY_7(2007),
    KEY_8(2008),
    KEY_9(2009),
    KEY_0(2000),
    KEY_CLOSE_BRACKET(2060),
    KEY_OPEN_BRACKET(2059),
    KEY_QUOTE(2063),
    KEY_SEMICOLON(2062),
    KEY_SLASH(2064),
    KEY_COMMA(2043),
    KEY_BACKSLASH(2061),
    KEY_PERIOD(2044),
    KEY_BACK_QUOTE(2056),
    KEY_EQUALS(2058),
    KEY_MINUS(2057),
    KEY_ENTER(2054),
    KEY_ESCAPE(2070),
    KEY_TAB(2049),
    KEY_BACKSPACE(2055),
    KEY_SPACE(2050),
    KEY_CAPSLOCK(2074),
    KEY_LEFT_META(2076),
    KEY_LEFT_SHIFT(2047),
    KEY_LEFT_ALT(2045),
    KEY_LEFT_CONTROL(2072),
    KEY_RIGHT_META(2077),
    KEY_RIGHT_SHIFT(2048),
    KEY_RIGHT_ALT(2046),
    KEY_RIGHT_CONTROL(2073),
    KEY_MENU(2067),
    KEY_UP(2012),
    KEY_DOWN(2013),
    KEY_LEFT(2014),
    KEY_RIGHT(2015),
    KEY_F1(2090),
    KEY_F2(2091),
    KEY_F3(2092),
    KEY_F4(2093),
    KEY_F5(2094),
    KEY_F6(2095),
    KEY_F7(2096),
    KEY_F8(2097),
    KEY_F9(2098),
    KEY_F10(2099),
    KEY_F11(2100),
    KEY_F12(2101),
    KEY_PRINTSCEEN(2079),
    KEY_SCROLL_LOCK(2075),
    KEY_PAUSE(2080),
    KEY_INSERT(2083),
    KEY_HOME(2081),
    KEY_PGUP(2068),
    KEY_DELETE(2071),
    KEY_END(2082),
    KEY_PGDOWN(2069),
    KEY_NUM_LOCK(2102),
    KEY_NUMPAD_0(2103),
    KEY_NUMPAD_1(2104),
    KEY_NUMPAD_2(2105),
    KEY_NUMPAD_3(2106),
    KEY_NUMPAD_4(2107),
    KEY_NUMPAD_5(2108),
    KEY_NUMPAD_6(2109),
    KEY_NUMPAD_7(2110),
    KEY_NUMPAD_8(2111),
    KEY_NUMPAD_9(2112),
    KEY_NUMPAD_ENTER(2119),
    KEY_NUMPAD_ADD(2116),
    KEY_NUMPAD_SUBTRACT(2115),
    KEY_NUMPAD_MULTIPLY(2114),
    KEY_NUMPAD_DIVIDE(2113),
    KEY_NUMPAD_DECIMAL(2117);

    actual val platformKeyCode get() = value

    companion object {
        fun valueOf(value: Int): SkikoKey {
            if (value > Int.MAX_VALUE) {
                error("OHOS SkikoKey, valueOf value = $value > Int.MAX_VALUE")
            }
            val key = SkikoKey.values().firstOrNull { it.value == value }
            return key ?: SkikoKey.KEY_UNKNOWN
        }
    }
}