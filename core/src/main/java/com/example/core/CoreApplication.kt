package com.example.core

import android.app.Application
import android.util.Log
import javax.inject.Inject

open class CoreApplication : Application() {

    @Inject
    lateinit var someString: String

    override fun onCreate() {
        super.onCreate()
        Log.d("TEST", "onCreate: $someString")
    }
}