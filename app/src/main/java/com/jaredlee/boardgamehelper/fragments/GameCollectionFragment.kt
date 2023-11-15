package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaredlee.boardgamehelper.GameAdapter
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentGameCollectionBinding
import com.jaredlee.boardgamehelper.viewModels.GameCollectionViewModel

class GameCollectionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGameCollectionBinding.inflate(inflater, container, false)
        val viewModel = GameCollectionViewModel()
        binding.randomGameButton.setOnClickListener {
            binding.randomGameText.text = viewModel.randGame()
        }
        binding.homeCollectionbutton.setOnClickListener {
            findNavController().navigate(R.id.action_gameCollectionFragment_to_homeFragment)
        }
        binding.recylclerView.adapter = GameAdapter(viewModel.games)
        binding.recylclerView.layoutManager = LinearLayoutManager(context)

        binding.addGameButton.setOnClickListener {
            findNavController().navigate(R.id.action_gameCollectionFragment_to_addGameFragment)
        }

        return binding.root
    }
}