package com.bibekgupta.cryptocurrencyapp.domain.usecase.get_coins

import com.bibekgupta.cryptocurrencyapp.common.Resource
import com.bibekgupta.cryptocurrencyapp.data.remote.dto.toCoin
import com.bibekgupta.cryptocurrencyapp.domain.model.Coin
import com.bibekgupta.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))

        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))

        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}