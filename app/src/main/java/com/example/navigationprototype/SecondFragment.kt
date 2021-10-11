package com.example.navigationprototype

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationprototype.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater,R.layout.fragment_second,container,false)
        binding.raj.setOnClickListener { view : View ->
            view.findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment(33))
            //view.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
        return binding.root
    }

}