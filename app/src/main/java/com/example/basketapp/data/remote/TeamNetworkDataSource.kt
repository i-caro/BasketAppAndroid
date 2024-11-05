package com.example.basketapp.data.remote

import com.example.basketapp.data.model.Team
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TeamNetworkDataSource
@Inject constructor(
    private val strapi: ApiService
): TeamRemoteDataSource{
    override suspend fun insertSome(teams: List<Team>) {
        TODO("Not yet implemented")
    }

    override suspend fun insert(team: Team) {
        TODO("Not yet implemented")
    }

    override suspend fun readAll(): List<Team> {
        val teams = strapi.readTeams()
        return teams
    }


    override suspend fun readOne(id: Int): Team{
        val team = strapi.readOneTeam(id)
        return team
    }

    override suspend fun observeALl(): Flow<List<Team>> {
        TODO("Not yet implemented")
    }

}