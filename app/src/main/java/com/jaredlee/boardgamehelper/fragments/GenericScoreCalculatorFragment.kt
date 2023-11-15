package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentGenericScoreCalculatorBinding


class GenericScoreCalculatorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGenericScoreCalculatorBinding.inflate(inflater, container, false)
        binding.genericHomeButton.setOnClickListener {
            findNavController().navigate(R.id.generic_to_home)
        }
        binding.genericBackButton.setOnClickListener {
            findNavController().navigate(R.id.generic_to_score)
        }
        return binding.root
    }
}