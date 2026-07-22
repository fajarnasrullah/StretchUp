package com.fajarnasrullah.stretchup.core.common.logger

interface Logger {

    fun d(message: String)

    fun e(throwable: Throwable)

    fun i(message: String)
}