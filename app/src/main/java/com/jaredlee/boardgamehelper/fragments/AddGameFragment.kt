package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.databinding.FragmentAddGameBinding
import com.jaredlee.boardgamehelper.viewModels.CreateGameViewModel

class AddGameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentAddGameBinding.inflate(inflater, container, false);
        val viewModel = CreateGameViewModel()
        viewModel.done.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigateUp()
            }
        }
        binding.saveButton.setOnClickListener {
            viewModel.createGame(binding.gameName.text.toString(),binding.numPlayers.text.toString(),binding.timeToPlay.text.toString())
        }
        return binding.root
    }
}