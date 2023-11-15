package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentCounterBinding
import com.jaredlee.boardgamehelper.viewModels.CounterViewModel

class CounterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCounterBinding.inflate(inflater, container, false)
        val viewModel = CounterViewModel()
        binding.counterHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_counterFragment_to_homeFragment)
        }
        binding.addOne.setOnClickListener {
            binding.counterNum.text = viewModel.add1(binding.counterNum.text.toString().toInt()).toString()
        }
        binding.add5.setOnClickListener {
            binding.counterNum.text = viewModel.add5(binding.counterNum.text.toString().toInt()).toString()
        }
        binding.add10.setOnClickListener {
            binding.counterNum.text = viewModel.add10(binding.counterNum.text.toString().toInt()).toString()
        }
        binding.minus1.setOnClickListener {
            binding.counterNum.text = viewModel.sub1(binding.counterNum.text.toString().toInt()).toString()
        }
        binding.minus5.setOnClickListener {
            binding.counterNum.text = viewModel.sub5(binding.counterNum.text.toString().toInt()).toString()
        }
        binding.minus10.setOnClickListener {
            binding.counterNum.text = viewModel.sub10(binding.counterNum.text.toString().toInt()).toString()
        }
        return binding.root
    }
}