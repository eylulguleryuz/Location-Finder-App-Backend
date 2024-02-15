package com.example.locFinder.data

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class stiprumai (
    @Id
    var id: Int = 0,
    var matavimas: Int = 0,
    var sensorius: String = "",
    var stiprumas: Int = 0,
    ) {
    constructor() : this(0, 0, "", 0)
}
