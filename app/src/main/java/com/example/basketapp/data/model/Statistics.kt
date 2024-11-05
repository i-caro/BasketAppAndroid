package com.example.basketapp.data.model

data class Statistics(
    val totalRebounds: Int,
    val totalAssists: Int,
    val totalPoints: Int,
    val totalSteals: Int,
    val reboundsPerGame: Double,
    val assistsPerGame: Double,
    val pointsPerGame: Double,
    val stealsPerGame: Double,
    val gamesPlayed: Int
)
