package com.bibekgupta.cryptocurrencyapp.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.launchIn
import com.bibekgupta.cryptocurrencyapp.common.Resource
import kotlinx.coroutines.flow.onEach
import com.bibekgupta.cryptocurrencyapp.domain.usecase.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
): ViewModel(){

    private val _state = mutableStateOf<CoinListState>(CoinListState())
    val state: State<CoinListState> = _state

    init{
        getCoins()
    }


    private fun getCoins() {
        getCoinsUseCase().onEach {result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = CoinListState(coins = result.data ?: emptyList())

                }
                is Resource.Error -> {
                    _state.value = CoinListState(
                        error = result.message ?: "An unexpected error occured"
                    )

                }
                is Resource.Loading -> {
                    _state.value = CoinListState(isLoading = true)

                }
            }
        }.launchIn(viewModelScope)
    }

}