package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentCatanScoreCalculatorBinding

class CatanScoreCalculatorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCatanScoreCalculatorBinding.inflate(inflater, container, false)
        binding.catanHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_catanScoreCalculatorFragment_to_homeFragment)
        }
        binding.catanBackButton.setOnClickListener {
            findNavController().navigate(R.id.action_catanScoreCalculatorFragment_to_scoreCalculatorFragment)
        }
        return binding.root
    }
}