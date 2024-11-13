package com.bibekgupta.cryptocurrencyapp.presentation.coin_list


import com.bibekgupta.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
