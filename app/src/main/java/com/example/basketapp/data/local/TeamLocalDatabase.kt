package com.example.basketapp.data.local

import com.example.basketapp.data.model.Team
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class TeamLocalDatabase
@Inject constructor(
    private val dao: TeamDao
):TeamLocalDataSource {

    override suspend fun insert(teams: List<Team>) {
        dao.create(teams.toLocal())
    }

    override suspend fun readAll(): List<Team> {
        return dao.readAll().toExternal()
    }

    override suspend fun observeALl(): Flow<List<Team>> {
        return dao.observeAll().map { localTeams ->
            localTeams.toExternal()
        }
    }
}