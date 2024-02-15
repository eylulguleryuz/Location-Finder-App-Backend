package com.example.locFinder.repositories

import com.example.locFinder.data.matavimai
import org.springframework.data.jpa.repository.JpaRepository


interface MeasurementRepository : JpaRepository<matavimai, Long>

