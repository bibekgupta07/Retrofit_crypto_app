package com.bibekgupta.cryptocurrencyapp.domain.repository

import com.bibekgupta.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.bibekgupta.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}