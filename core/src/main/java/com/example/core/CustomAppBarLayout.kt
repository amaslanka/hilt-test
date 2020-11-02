package com.example.core

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.appbar.AppBarLayout

class CustomAppBarLayout : AppBarLayout {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}