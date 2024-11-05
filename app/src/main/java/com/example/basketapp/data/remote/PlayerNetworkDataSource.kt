package com.example.basketapp.data.remote

import com.example.basketapp.data.model.Player
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlayerNetworkDataSource
@Inject constructor(
    private val strapi: ApiService
): PlayerRemoteDataSource{
    override suspend fun insertSome(players: List<Player>) {
        TODO("Not yet implemented")
    }

    override suspend fun insert(player: Player) {
        TODO("Not yet implemented")
    }

    override suspend fun readAll(): List<Player> {
        val players = strapi.readPlayers()
        return players
    }

    override suspend fun readOne(id: Int): Player{
        val player = strapi.readOnePlayer(id)
        return player
    }

    override suspend fun observeALl(): Flow<List<Player>> {
        TODO("Not yet implemented")
    }

}