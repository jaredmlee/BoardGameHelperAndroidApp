package com.jaredlee.boardgamehelper.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jaredlee.boardgamehelper.data.GameItem
import kotlinx.coroutines.launch
import com.jaredlee.boardgamehelper.Database.TodosRepository

class CreateGameViewModel: ViewModel() {
    val done = MutableLiveData(false)
    fun createGame(gameName: String, numPlayers: String, gameTime: String){
        viewModelScope.launch {
            val game  = GameItem(0,gameName,numPlayers, gameTime)
            TodosRepository.createGame(game)
            done.value = true
        }
    }
}