package com.example.basketapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "team")
data class TeamEntity (
    @PrimaryKey val id: String,
    val name: String,
    val coach: String,
    val city: String
)