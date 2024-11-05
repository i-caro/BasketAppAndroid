package com.example.basketapp.data.local

import com.example.basketapp.data.model.Team
import kotlinx.coroutines.flow.Flow

interface TeamLocalDataSource {

    suspend fun insert(teams:List<Team>)
    suspend fun readAll():List<Team>
    suspend fun observeALl(): Flow<List<Team>>
}