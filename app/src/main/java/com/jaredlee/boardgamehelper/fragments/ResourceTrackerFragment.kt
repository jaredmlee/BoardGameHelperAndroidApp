package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentResourceTrackerBinding

class ResourceTrackerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentResourceTrackerBinding.inflate(inflater, container, false)
        binding.ResourceHome.setOnClickListener {
            findNavController().navigate(R.id.action_resourceTrackerFragment_to_homeFragment)
        }
        return binding.root
    }
}