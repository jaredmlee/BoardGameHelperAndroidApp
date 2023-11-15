package com.jaredlee.boardgamehelper.viewModels

import androidx.lifecycle.ViewModel

class DiceViewModel: ViewModel() {
    fun rollD6(): Int{
        return (1..6).random()
    }
    fun rollD8(): Int{
        return (1..8).random()
    }
    fun rollD10(): Int{
        return (1..10).random()
    }
    fun rollD20(): Int{
        return (1..20).random()
    }
}