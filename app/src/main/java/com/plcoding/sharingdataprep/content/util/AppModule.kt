package com.plcoding.sharingdataprep.content.util

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        return context.getSharedPreferences("session_prefs", MODE_PRIVATE)
    }

    @Provides
    @Singleton
    fun provideSessionCache(sharedPreferences: SharedPreferences): SessionCache {
        return SessionCacheImpl(sharedPreferences)
    }
}