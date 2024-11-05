package com.example.basketapp.data.repository

import com.example.basketapp.data.model.Player

interface PlayerRepository {
    suspend fun getPLayers():List<Player>
    suspend fun addPlayer(player:Player)
}