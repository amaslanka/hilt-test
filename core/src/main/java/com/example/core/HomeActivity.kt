package com.example.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Singleton

@AndroidEntryPoint
class HomeActivity : MidActivity() {

    @Inject
    lateinit var someClass: SomeClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        someClass.doSomething()
    }
}

@Singleton
class SomeClass @Inject constructor() {
    fun doSomething() {
        Log.d("TEST", "do something")
    }
}