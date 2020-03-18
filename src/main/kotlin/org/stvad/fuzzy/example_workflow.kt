package org.stvad.fuzzy

import org.stvad.fuzzy.alfred.AlfredResult
import org.stvad.fuzzy.extlib.alfy

fun main() {
    val isAwesome = "${alfy.input} Is Awesome"
    alfy.output(listOf(AlfredResult(isAwesome, arg = isAwesome)))
}
