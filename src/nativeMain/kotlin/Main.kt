@file:OptIn(ExperimentalNativeApi::class)

package org.example

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.experimental.ExperimentalNativeApi


fun main() {
    println("Hello, Kotlin/Native!")


    val platform = Platform.osFamily
    println("Running on: $platform")

    val currentDateTime = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    val dayOfWeek = currentDateTime.dayOfWeek.name
    println("Current time: $currentDateTime")
    println("Day of the week: $dayOfWeek")

    // Generate a beep sound
    print('\u0007') // ASCII bell character
}