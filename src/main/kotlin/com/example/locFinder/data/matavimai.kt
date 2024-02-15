package com.example.locFinder.data

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class matavimai(
    @Id
    var matavimas: Int = 0,
    var x: Int = 0,
    var y: Int = 0,
    var atstumas: Float = 0.0F
) {
    constructor() : this(0, 0, 0, 0.0F)
}