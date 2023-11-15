package com.jaredlee.boardgamehelper.viewModels

import android.view.LayoutInflater
import androidx.lifecycle.ViewModel
import com.jaredlee.boardgamehelper.data.Player
import com.jaredlee.boardgamehelper.databinding.ScytheScorePlayerBinding

class ScytheScoreViewModel: ViewModel() {
    fun addPlayer(list: ArrayList<Player>){
        val newPlayer = Player("Player ${list.size+1}")
        list.add(newPlayer)
    }
    fun calculateScore(name: String, popularity: Int, stars: Int, resources: Int, territories: Int, bonus: Int): Int{
        return 0
    }
}