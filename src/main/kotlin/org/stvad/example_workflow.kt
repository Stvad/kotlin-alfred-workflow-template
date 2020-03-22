package org.stvad

import org.stvad.alfred.AlfredResult
import org.stvad.extlib.alfy

fun main() {
    val isAwesome = "${alfy.input} Is Awesome"
    alfy.output(listOf(
        AlfredResult(
            isAwesome,
            arg = isAwesome
        )
    ))
}
