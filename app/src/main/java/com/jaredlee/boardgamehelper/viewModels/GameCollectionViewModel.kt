package com.jaredlee.boardgamehelper.viewModels

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jaredlee.boardgamehelper.data.GameItem
import com.jaredlee.boardgamehelper.Database.TodosRepository
import kotlinx.coroutines.launch

class GameCollectionViewModel: ViewModel() {
    val games = ObservableArrayList<GameItem>()
    val done = MutableLiveData(false)
    init{
        loadGames()
    }
    private fun loadGames(){
        viewModelScope.launch {
            val loadedGames = TodosRepository.getAllGames()
            games.addAll(loadedGames)
            done.value = true
        }
    }
    fun randGame(): String{
        if (games.isNotEmpty()) {
            val rand = (0 until games.size).random()
            return games[rand].gameName
        }
        return "There are no\ngames in your collection"
    }

}