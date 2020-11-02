package com.example.core

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class CoreModule {

    @Provides
    @Singleton
    fun provideSomeString() = "Some string"
}
