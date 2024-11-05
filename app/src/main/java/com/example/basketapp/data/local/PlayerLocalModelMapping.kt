package com.example.basketapp.data.local

import com.example.basketapp.data.model.Player

fun Player.toLocal()=
    PlayerEntity(
        id = this.id,
        name = this.name,
        surname = this.surname,
        age = this.age,
        height = this.height,
        wingspan = this.wingspan,
        weight = this.weight,
        position = this.position,
        rings = this.rings
    )


fun List<Player>.toLocal():List<PlayerEntity>{
    return this.map{ p -> p.toLocal()}
}

fun PlayerEntity.toExternal()=
    Player(
        id = this.id,
        name = this.name,
        surname = this.surname,
        age = this.age,
        height = this.height,
        wingspan = this.wingspan,
        weight = this.weight,
        position = this.position,
        rings = this.rings
    )


fun List<PlayerEntity>.toExternal():List<Player> = map(PlayerEntity::toExternal)