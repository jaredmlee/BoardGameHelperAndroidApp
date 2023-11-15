package com.jaredlee.boardgamehelper.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class GameItem(
    @PrimaryKey(autoGenerate = true) var id: Long,
    @ColumnInfo var gameName: String,
    @ColumnInfo var numPlayers: String,
    @ColumnInfo var gameTime: String

)