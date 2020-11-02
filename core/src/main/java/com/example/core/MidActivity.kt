package com.example.core

import android.os.Bundle
import android.util.Log
import com.google.android.material.appbar.AppBarLayout
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
abstract class MidActivity : BaseActivity() {

    @Inject
    lateinit var otherString: String

    var appBar: AppBarLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findAppBar()
        Log.d("TEST", "MidActivity onCreate: $otherString")
    }

    private fun findAppBar() {
        appBar = findViewById(R.id.fragment_container_view_tag)
    }
}