package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.fragment.app.viewModels


class GameViewModel: ViewModel() {

    init {
        Log.d("Game Fragment", "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("Game Fragment", "GameViewModel destroyed")
    }

    private var score = 0
    private var currentWordCount = 0
    private var _currentScrambledWord = "test"
    val currentScrambledWord: String
        get() = _currentScrambledWord
//
}