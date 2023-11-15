package com.jaredlee.boardgamehelper.Database

import android.app.Application

class BoardGameHelperApplication : Application() {
    init {
        instance = this
    }

    companion object {
        private var instance: Application? = null

        fun getInstance(): Application {
            return instance!!
        }
    }
}