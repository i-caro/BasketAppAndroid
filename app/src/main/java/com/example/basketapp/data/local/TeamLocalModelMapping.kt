package com.example.basketapp.data.local

import com.example.basketapp.data.model.Team

fun Team.toLocal()=
    TeamEntity(
        id = this.id,
        name = this.name,
        coach = this.coach,
        city = this.city

    )


fun List<Team>.toLocal():List<TeamEntity>{
    return this.map{ p -> p.toLocal()}
}

fun TeamEntity.toExternal()=
    Team(
        id = this.id,
        name = this.name,
        coach = this.coach,
        city = this.city
    )


fun List<TeamEntity>.toExternal():List<Team> = map(TeamEntity::toExternal)