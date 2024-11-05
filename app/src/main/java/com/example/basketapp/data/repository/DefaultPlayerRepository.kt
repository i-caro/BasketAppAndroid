package com.example.basketapp.data.repository

import com.example.basketapp.data.local.PlayerLocalDataSource
import com.example.basketapp.data.model.Player
import com.example.basketapp.data.remote.PlayerRemoteDataSource
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DefaultPlayerRepository
@Inject constructor(
    private val localDataSource: PlayerLocalDataSource,
    private val remoteDataSource: PlayerRemoteDataSource
) : PlayerRepository {

    override suspend fun getPLayers(): List<Player> {
        val players = remoteDataSource.readAll()
        return players
    }

    override suspend fun addPlayer(player: Player) {
        remoteDataSource.insert(player)
    }

    private fun refreshLocal(){
        runBlocking {
            val playerRemote = remoteDataSource.readAll()
            localDataSource.insert(playerRemote)
        }
    }
}