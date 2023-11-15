package com.jaredlee.boardgamehelper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jaredlee.boardgamehelper.data.Player
import com.jaredlee.boardgamehelper.databinding.ScytheScorePlayerBinding


class ScytheScoreAdapter(private val players: ArrayList<Player>,private val onClick: (Player) -> Unit = {}): RecyclerView.Adapter<ScytheScoreAdapter.ViewHolder>() {
    class ViewHolder(val binding: ScytheScorePlayerBinding): RecyclerView.ViewHolder(binding.root)
    override fun getItemCount(): Int {
        return players.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ScytheScorePlayerBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val member = players[position]
        holder.binding.name.setText(member.player)
        holder.binding.root.setOnClickListener() {
            onClick(member)
        }
    }
}