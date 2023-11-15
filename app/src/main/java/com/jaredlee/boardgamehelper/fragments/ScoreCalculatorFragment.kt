package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentScoreCalculatorBinding


class ScoreCalculatorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentScoreCalculatorBinding.inflate(inflater, container, false)
        binding.scoreHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_scoreCalculatorFragment_to_homeFragment)
        }
        binding.catanGo.setOnClickListener {
            findNavController().navigate(R.id.action_scoreCalculatorFragment_to_catanScoreCalculatorFragment)
        }
        binding.genericGo.setOnClickListener {
            findNavController().navigate(R.id.action_scoreCalculatorFragment_to_genericScoreCalculatorFragment)
        }
        binding.ScytheGo.setOnClickListener {
            findNavController().navigate(R.id.action_scoreCalculatorFragment_to_scytheScoreFragment)
        }
        return binding.root
    }
}