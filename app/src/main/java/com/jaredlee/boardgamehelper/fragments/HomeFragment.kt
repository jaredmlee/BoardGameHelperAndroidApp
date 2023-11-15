package com.jaredlee.boardgamehelper.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentHomeBinding
import com.jaredlee.boardgamehelper.viewModels.GameCollectionViewModel


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.scoreCalculatorButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_scoreCalculatorFragment)
        }
        binding.ResourceTrackerButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_resourceTrackerFragment)
        }
        binding.diceButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_diceFragment)
        }
        binding.counterButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_counterFragment)
        }
        binding.gameCollectionButton.setOnClickListener {
            //this seems like the wrong thing to do, but its the only way i could figure out to get
            // the db stuff loaded before the fragment was rendered
            val vm  = GameCollectionViewModel()
            vm.done.observe(viewLifecycleOwner) {
                if (it) {
                    findNavController().navigate(R.id.action_homeFragment_to_gameCollectionFragment)
                }
            }
        }
        return binding.root
    }
}