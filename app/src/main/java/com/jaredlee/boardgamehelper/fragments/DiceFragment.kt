package com.jaredlee.boardgamehelper.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jaredlee.boardgamehelper.R
import com.jaredlee.boardgamehelper.databinding.FragmentDiceBinding
import com.jaredlee.boardgamehelper.viewModels.DiceViewModel

class DiceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDiceBinding.inflate(inflater, container, false)
        val viewModel = DiceViewModel()
        var numD6 = 0;
        var numD8 = 0;
        var numD10 = 0;
        var numD20 = 0;
        binding.DiceHomeButton.setOnClickListener {
            findNavController().navigate(R.id.action_diceFragment_to_homeFragment)
        }
        binding.add6.setOnClickListener{
            if (numD6==0){
                binding.D6one.visibility = View.VISIBLE
                numD6++
            }
            else if (numD6==1){
                binding.D6two.visibility = View.VISIBLE
                numD6++
            }
            else if (numD6==2){
                binding.D6three.visibility = View.VISIBLE
                numD6++
            }
            else if (numD6==3){
                binding.D6four.visibility = View.VISIBLE
                numD6++
            }
            else if (numD6==4){
                binding.D6five.visibility = View.VISIBLE
                numD6++
            }
            else if (numD6==5){
                binding.D6six.visibility = View.VISIBLE
                numD6++
            }
        }
        binding.add8.setOnClickListener {
            if (numD8==0){
                binding.D8one.visibility = View.VISIBLE
                numD8++
            }
            else if (numD8==1){
                binding.D8two.visibility = View.VISIBLE
                numD8++
            }
            else if (numD8==2){
                binding.D8three.visibility = View.VISIBLE
                numD8++
            }
            else if (numD8==3){
                binding.D8four.visibility = View.VISIBLE
                numD8++
            }
            else if (numD8==4){
                binding.D8five.visibility = View.VISIBLE
                numD8++
            }
            else if (numD8==5){
                binding.D8six.visibility = View.VISIBLE
                numD8++
            }
        }
        binding.addD10.setOnClickListener {
            if (numD10==0){
                binding.D10one.visibility = View.VISIBLE
                numD10++
            }
            else if (numD10==1){
                binding.D10two.visibility = View.VISIBLE
                numD10++
            }
            else if (numD10==2){
                binding.D10three.visibility = View.VISIBLE
                numD10++
            }
            else if (numD10==3){
                binding.D10four.visibility = View.VISIBLE
                numD10++
            }
            else if (numD10==4){
                binding.D10five.visibility = View.VISIBLE
                numD10++
            }
            else if (numD10==5){
                binding.D10six.visibility = View.VISIBLE
                numD10++
            }
        }
        binding.add20.setOnClickListener {
            if (numD20==0){
                binding.D20one.visibility = View.VISIBLE
                numD20++
            }
            else if (numD20==1){
                binding.D20two.visibility = View.VISIBLE
                numD20++
            }
            else if (numD20==2){
                binding.D20three.visibility = View.VISIBLE
                numD20++
            }
            else if (numD20==3){
                binding.D20four.visibility = View.VISIBLE
                numD20++
            }
            else if (numD20==4){
                binding.D20five.visibility = View.VISIBLE
                numD20++
            }
            else if (numD20==5){
                binding.D20six.visibility = View.VISIBLE
                numD20++
            }
        }
        binding.delete6.setOnClickListener {
            if (numD6==1){
                binding.D6one.visibility = View.INVISIBLE
                numD6--
            }
            else if (numD6==2){
                binding.D6two.visibility = View.INVISIBLE
                numD6--
            }
            else if (numD6==3){
                binding.D6three.visibility = View.INVISIBLE
                numD6--
            }
            else if (numD6==4){
                binding.D6four.visibility = View.INVISIBLE
                numD6--
            }
            else if (numD6==5){
                binding.D6five.visibility = View.INVISIBLE
                numD6--
            }
            else if (numD6==6){
                binding.D6six.visibility = View.INVISIBLE
                numD6--
            }
        }
        binding.delete8.setOnClickListener {
            if (numD8==1){
                binding.D8one.visibility = View.INVISIBLE
                numD8--
            }
            else if (numD8==2){
                binding.D8two.visibility = View.INVISIBLE
                numD8--
            }
            else if (numD8==3){
                binding.D8three.visibility = View.INVISIBLE
                numD8--
            }
            else if (numD8==4){
                binding.D8four.visibility = View.INVISIBLE
                numD8--
            }
            else if (numD8==5){
                binding.D8five.visibility = View.INVISIBLE
                numD8--
            }
            else if (numD8==6){
                binding.D8six.visibility = View.INVISIBLE
                numD8--
            }
        }
        binding.delete10.setOnClickListener {
            if (numD10==1){
                binding.D10one.visibility = View.INVISIBLE
                numD10--
            }
            else if (numD10==2){
                binding.D10two.visibility = View.INVISIBLE
                numD10--
            }
            else if (numD10==3){
                binding.D10three.visibility = View.INVISIBLE
                numD10--
            }
            else if (numD10==4){
                binding.D10four.visibility = View.INVISIBLE
                numD10--
            }
            else if (numD10==5){
                binding.D10five.visibility = View.INVISIBLE
                numD10--
            }
            else if (numD10==6) {
                binding.D10six.visibility = View.INVISIBLE
                numD10--
            }
        }
        binding.delete20.setOnClickListener {
            if (numD20==1){
                binding.D20one.visibility = View.INVISIBLE
                numD20--
            }
            else if (numD20==2){
                binding.D20two.visibility = View.INVISIBLE
                numD20--
            }
            else if (numD20==3){
                binding.D20three.visibility = View.INVISIBLE
                numD20--
            }
            else if (numD20==4){
                binding.D20four.visibility = View.INVISIBLE
                numD20--
            }
            else if (numD20==5){
                binding.D20five.visibility = View.INVISIBLE
                numD20--
            }
            else if (numD20==6){
                binding.D20six.visibility = View.INVISIBLE
                numD20--
            }
        }
        binding.rollButton.setOnClickListener {
            binding.D6one.text = viewModel.rollD6().toString()
            binding.D6two.text = viewModel.rollD6().toString()
            binding.D6three.text = viewModel.rollD6().toString()
            binding.D6four.text = viewModel.rollD6().toString()
            binding.D6five.text = viewModel.rollD6().toString()
            binding.D6six.text = viewModel.rollD6().toString()
            binding.D8one.text = viewModel.rollD8().toString()
            binding.D8two.text = viewModel.rollD8().toString()
            binding.D8three.text = viewModel.rollD8().toString()
            binding.D8four.text = viewModel.rollD8().toString()
            binding.D8five.text = viewModel.rollD8().toString()
            binding.D8six.text = viewModel.rollD8().toString()
            binding.D10one.text = viewModel.rollD10().toString()
            binding.D10two.text = viewModel.rollD10().toString()
            binding.D10three.text = viewModel.rollD10().toString()
            binding.D10four.text = viewModel.rollD10().toString()
            binding.D10five.text = viewModel.rollD10().toString()
            binding.D10six.text = viewModel.rollD10().toString()
            binding.D20one.text = viewModel.rollD20().toString()
            binding.D20two.text = viewModel.rollD20().toString()
            binding.D20three.text = viewModel.rollD20().toString()
            binding.D20four.text = viewModel.rollD20().toString()
            binding.D20five.text = viewModel.rollD20().toString()
            binding.D20six.text = viewModel.rollD20().toString()
        }
        return binding.root
    }
}