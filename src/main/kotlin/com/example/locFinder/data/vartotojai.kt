package com.example.locFinder.data

import jakarta.persistence.Entity
import jakarta.persistence.Id
@Entity
class vartotojai (
    @Id
    var id: Int = 0,
    var mac: String = "",
    var sensorius: String = "",
    var stiprumas: Int = 0,
    ) {
    constructor() : this(0, "", "", 0)
}