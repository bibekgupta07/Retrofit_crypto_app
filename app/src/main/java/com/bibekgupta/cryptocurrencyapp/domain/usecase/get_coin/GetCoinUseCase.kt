package com.bibekgupta.cryptocurrencyapp.domain.usecase.get_coin


import com.bibekgupta.cryptocurrencyapp.common.Resource
import com.bibekgupta.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.bibekgupta.cryptocurrencyapp.domain.model.CoinDetail
import com.bibekgupta.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))

        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))

        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}