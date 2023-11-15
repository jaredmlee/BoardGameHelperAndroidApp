package com.jaredlee.boardgamehelper.Database

import androidx.room.*
import com.jaredlee.boardgamehelper.data.GameItem

@Dao
interface GameDao {
    @Query("SELECT * FROM gameitem")
    suspend fun getAllGames(): List<GameItem>

    @Insert
    suspend fun createGameItem(gameItem: GameItem): Long

    @Update
    suspend fun updateGame(gameItem: GameItem)

}