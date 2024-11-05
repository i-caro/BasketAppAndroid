package com.example.basketapp.data.repository

import com.example.basketapp.data.model.Team

interface TeamRepository {
    suspend fun getTeams():List<Team>
    suspend fun addTeam(team:Team)
}