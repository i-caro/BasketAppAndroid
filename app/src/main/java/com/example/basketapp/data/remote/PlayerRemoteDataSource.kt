package com.example.basketapp.data.remote

import com.example.basketapp.data.model.Player
import kotlinx.coroutines.flow.Flow

interface PlayerRemoteDataSource {
    suspend fun insertSome(players:List<Player>)
    suspend fun insert(player: Player)
    suspend fun readAll():List<Player>
    suspend fun readOne(id: Int):Player
    suspend fun observeALl(): Flow<List<Player>>
}