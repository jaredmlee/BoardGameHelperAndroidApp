package com.jaredlee.boardgamehelper.Database

import androidx.room.Room
import com.jaredlee.boardgamehelper.data.GameItem


object TodosRepository {
    private val db: AppDataBase;
    private var cacheInitialized = false;
    private val GameCache = mutableListOf<GameItem>()
    init {
        db = Room.databaseBuilder(
            BoardGameHelperApplication.getInstance(),
            AppDataBase::class.java,
            "game-database"
        ).build()
    }

    suspend fun createGame(game: GameItem) {
        game.id = db.getGameDao().createGameItem(game)
        GameCache.add(game)
    }

    suspend fun getAllGames(): List<GameItem> {
        if (!cacheInitialized) {
            GameCache.addAll(db.getGameDao().getAllGames())
            cacheInitialized = true
        }
        return GameCache
    }

    suspend fun update(game: GameItem) {
        db.getGameDao().updateGame(game)
        GameCache[GameCache.indexOfFirst {
            it.id == game.id
        }] = game
    }

}