package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.ScytheScoreAdapter
import com.jaredlee.boardgamehelper.data.Player
import com.jaredlee.boardgamehelper.databinding.FragmentScytheScoreBinding
import com.jaredlee.boardgamehelper.databinding.ScytheScorePlayerBinding
import com.jaredlee.boardgamehelper.viewModels.ScytheScoreViewModel

class ScytheScoreFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentScytheScoreBinding.inflate(inflater, container, false)
        val binding2 = ScytheScorePlayerBinding.inflate(inflater,container,false)
        val viewModel = ScytheScoreViewModel()
        val playerList = ArrayList<Player>()
        binding.scytheHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_scytheScoreFragment_to_homeFragment)
        }
        binding.scytheBackButton.setOnClickListener {
            findNavController().navigate(R.id.action_scytheScoreFragment_to_scoreCalculatorFragment)
        }
        binding.addPlayerButton.setOnClickListener {
            viewModel.addPlayer(playerList)
            binding.recyclerView.adapter = ScytheScoreAdapter(playerList)
            binding.recyclerView.layoutManager = LinearLayoutManager(context)
        }
        binding.calculateButton.setOnClickListener {
            findNavController().navigate(R.id.action_scytheScoreFragment_to_calculatedScytheFragment)
        }
        return binding.root
    }
}