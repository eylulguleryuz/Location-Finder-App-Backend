package com.example.locFinder.repositories

import com.example.locFinder.data.matavimai
import com.example.locFinder.data.stiprumai
import com.example.locFinder.data.vartotojai
import org.springframework.data.jpa.repository.JpaRepository


interface StrengthRepository : JpaRepository<stiprumai, Long>

