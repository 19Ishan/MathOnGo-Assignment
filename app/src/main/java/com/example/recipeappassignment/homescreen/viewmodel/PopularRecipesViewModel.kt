package com.example.recipeappassignment.homescreen.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeappassignment.homescreen.usecase.IGetPopularRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PopularRecipesViewModel @Inject constructor(
    useCase: IGetPopularRecipesUseCase
) : ViewModel() {
    init {
        viewModelScope.launch {
            val a = useCase()
            Log.d("IA", a)
        }
    }
}