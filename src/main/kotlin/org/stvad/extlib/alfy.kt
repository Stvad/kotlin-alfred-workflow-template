package org.stvad.extlib

import org.stvad.alfred.AlfredResult

@JsModule("alfy")
external object alfy {
    val input: String
    fun output(items: List<AlfredResult>)
}