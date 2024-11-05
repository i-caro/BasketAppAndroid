package com.example.basketapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "player")
data class PlayerEntity (
    @PrimaryKey val id: String,
    val name: String,
    val surname: String,
    val age: Int,
    val height: Double,
    val wingspan: Double,
    val weight: Double,
    val position: String,
    val rings: Int
)