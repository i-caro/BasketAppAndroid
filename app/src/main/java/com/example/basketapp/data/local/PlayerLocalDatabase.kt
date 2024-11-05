package com.example.basketapp.data.local

import com.example.basketapp.data.model.Player
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PlayerLocalDatabase
@Inject constructor(
    private val dao: PlayerDao
):PlayerLocalDataSource {

    override suspend fun insert(players: List<Player>) {
        dao.create(players.toLocal())
    }

    override suspend fun readAll(): List<Player> {
        return dao.readAll().toExternal()
    }

    override suspend fun observeALl(): Flow<List<Player>> {
        return dao.observeAll().map { localPlayers ->
            localPlayers.toExternal()
        }
    }
}