package com.example.basketapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface PlayerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(player: PlayerEntity)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(players: List<PlayerEntity>)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create(vararg player: PlayerEntity)
    @Update
    suspend fun update(player: PlayerEntity)

    suspend fun delete(player: PlayerEntity)

    @Query("SELECT * FROM player")
    suspend fun readAll():List<PlayerEntity>
    @Query("SELECT * FROM player")
    suspend fun observeAll(): Flow<List<PlayerEntity>>
}