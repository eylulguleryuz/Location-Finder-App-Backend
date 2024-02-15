package com.example.locFinder

import com.example.locFinder.data.matavimai
import com.example.locFinder.data.stiprumai
import com.example.locFinder.data.vartotojai
import com.example.locFinder.repositories.MeasurementRepository
import com.example.locFinder.repositories.StrengthRepository
import com.example.locFinder.repositories.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DatabaseController internal constructor(
    measurementRepository: MeasurementRepository,
    strengthRepository: StrengthRepository,
    userRepository: UserRepository
    ) {
        private val measurementRepository: MeasurementRepository = measurementRepository
        private val strengthRepository: StrengthRepository = strengthRepository
        private val userRepository: UserRepository = userRepository

        @GetMapping("/measurements")
        fun GetMeasurements(): List<matavimai> {
            return measurementRepository.findAll()
        }
        @GetMapping("/strengths")
        fun GetStrengths(): List<stiprumai> {
            return strengthRepository.findAll()
        }
        @GetMapping("/users")
        fun GetUsers(): List<vartotojai> {
            return userRepository.findAll()
        }

    }