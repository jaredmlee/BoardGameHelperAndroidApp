package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentCalculatedScytheBinding


class CalculatedScytheFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCalculatedScytheBinding.inflate(inflater, container, false)
        binding.calculatedScytheButton.setOnClickListener {
            findNavController().navigate(R.id.action_calculatedScytheFragment_to_homeFragment)
        }
        return binding.root
    }
}