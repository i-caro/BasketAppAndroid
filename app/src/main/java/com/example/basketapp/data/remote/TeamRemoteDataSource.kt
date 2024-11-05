package com.example.basketapp.data.remote

import com.example.basketapp.data.model.Team
import kotlinx.coroutines.flow.Flow

interface TeamRemoteDataSource {

    suspend fun insertSome(teams:List<Team>)
    suspend fun insert(team: Team)
    suspend fun readAll():List<Team>
    suspend fun readOne(id: Int):Team
    suspend fun observeALl(): Flow<List<Team>>

}