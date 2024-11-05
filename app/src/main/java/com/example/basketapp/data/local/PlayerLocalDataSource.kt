package com.example.basketapp.data.local

import com.example.basketapp.data.model.Player
import kotlinx.coroutines.flow.Flow

interface PlayerLocalDataSource {
    suspend fun insert(players:List<Player>)
    suspend fun readAll():List<Player>
    suspend fun observeALl(): Flow<List<Player>>
}