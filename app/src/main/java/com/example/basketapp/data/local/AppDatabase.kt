package com.example.basketapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities =  [PlayerEntity::class,TeamEntity::class],
    version = 3
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun playerDao():PlayerDao
    abstract fun teamDao():TeamDao
}