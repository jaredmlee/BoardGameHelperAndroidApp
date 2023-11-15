package com.jaredlee.boardgamehelper.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jaredlee.boardgamehelper.data.GameItem

@Database(entities = [GameItem::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun getGameDao(): GameDao
}