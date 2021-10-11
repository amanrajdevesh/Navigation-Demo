package com.example.navigationprototype

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationprototype.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentThirdBinding>(inflater,R.layout.fragment_third,container,false)
        binding.devesh.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        val args = ThirdFragmentArgs.fromBundle(requireArguments())
        binding.devesh.text = args.number.toString()
        return binding.root
    }

}