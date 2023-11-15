package com.jaredlee.boardgamehelper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaredlee.boardgamehelper.data.GameItem
import com.jaredlee.boardgamehelper.data.Player
import com.jaredlee.boardgamehelper.databinding.GameItemBinding
import com.jaredlee.boardgamehelper.databinding.ScytheScorePlayerBinding


class GameAdapter(private val games: ArrayList<GameItem>,private val onClick: (GameItem) -> Unit = {}): RecyclerView.Adapter<GameAdapter.ViewHolder>() {
    class ViewHolder(val binding: GameItemBinding): RecyclerView.ViewHolder(binding.root)
    override fun getItemCount(): Int {
        return games.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GameItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val member = games[position]
        holder.binding.gameNameText.setText(member.gameName)
        holder.binding.numPlayersText.setText(member.numPlayers)
        holder.binding.playTimeText.setText(member.gameTime)

        holder.binding.root.setOnClickListener() {
            onClick(member)
        }
    }
}