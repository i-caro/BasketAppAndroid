package com.example.basketapp.di


import android.content.Context
import androidx.room.Room.databaseBuilder
import com.example.basketapp.data.local.PlayerLocalDataSource
import com.example.basketapp.data.local.PlayerLocalDatabase
import com.example.basketapp.data.remote.PlayerNetworkDataSource
import com.example.basketapp.data.remote.PlayerRemoteDataSource
import com.example.basketapp.data.repository.DefaultPlayerRepository
import com.example.basketapp.data.repository.PlayerRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindPlayerRepository(repository: DefaultPlayerRepository): PlayerRepository

    @Singleton
    @Binds
    abstract fun bindPlayerRemote(remote: PlayerNetworkDataSource): PlayerRemoteDataSource

    @Binds
    @Singleton
    abstract fun bindLocalDataSource(localDataSource: PlayerLocalDatabase): PlayerLocalDataSource
}