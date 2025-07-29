package com.example.amphibians.data

import com.example.amphibians.model.Amphibian
import com.example.amphibians.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibiansRepository (private val amphibiansApiService: AmphibiansApiService) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}

class FakeData : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> {
        return listOf(
            Amphibian("test", "test", "test", ""),
            Amphibian("test", "test", "test", "")
        )
    }
}