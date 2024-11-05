package com.example.basketapp.di

import android.annotation.SuppressLint
import android.content.Context
import androidx.room.Room
import com.example.basketapp.data.local.AppDatabase
import com.example.basketapp.data.local.PlayerDao
import com.example.basketapp.data.local.TeamDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @SuppressLint("SuspiciousIndentation")
    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext context: Context):AppDatabase{
        val database = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app-db"
        )
        return database.build()
    }

    @Provides
    fun providePlayerDao(AppDatabase: AppDatabase):PlayerDao = AppDatabase.playerDao()
    fun provideTeamDao(AppDatabase: AppDatabase):TeamDao = AppDatabase.teamDao()
}