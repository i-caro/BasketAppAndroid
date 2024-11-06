package com.example.basketapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TeamDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(team: TeamEntity)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(teams: List<TeamEntity>)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(vararg team: TeamEntity)
    @Update
    suspend fun update(team: TeamEntity)

    //suspend fun delete(team: TeamEntity)

    @Query("SELECT * FROM team")
    suspend fun readAll():List<TeamEntity>
    @Query("SELECT * FROM team")
    fun observeAll(): Flow<List<TeamEntity>>
}