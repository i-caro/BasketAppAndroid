package com.example.basketapp.data.repository

import com.example.basketapp.data.local.TeamLocalDataSource
import com.example.basketapp.data.model.Team
import com.example.basketapp.data.remote.TeamRemoteDataSource
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DefaultTeamRepository
@Inject constructor(
    private val localDataSource: TeamLocalDataSource,
    private val remoteDataSource: TeamRemoteDataSource
) : TeamRepository {

    override suspend fun getTeams(): List<Team> {
        val teams = remoteDataSource.readAll()
        return teams
    }

    override suspend fun addTeam(team: Team) {
        remoteDataSource.insert(team)
    }

    private fun refreshLocal(){
        runBlocking {
            val teamRemote = remoteDataSource.readAll()
            localDataSource.insert(teamRemote)
        }
    }
}