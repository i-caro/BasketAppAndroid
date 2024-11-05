package com.example.basketapp.data.remote

import com.example.basketapp.data.model.Player
import com.example.basketapp.data.model.Team
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("")
    suspend fun readPlayers():List<Player>

    @GET("")
    suspend fun readTeams():List<Team>

    @GET("")
    suspend fun readOnePlayer(@Path("id") id:Int): Player

    @GET("")
    suspend fun readOneTeam(@Path("id") id:Int): Team
}