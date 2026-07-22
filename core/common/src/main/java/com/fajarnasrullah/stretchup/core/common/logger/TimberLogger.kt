package com.fajarnasrullah.stretchup.core.common.logger

import timber.log.Timber
import javax.inject.Inject

class TimberLogger @Inject constructor() : Logger {

    override fun d(message: String) {
        Timber.d(message)
    }

    override fun e(throwable: Throwable) {
        Timber.e(throwable)
    }

    override fun i(message: String) {
        Timber.i(message)
    }
}