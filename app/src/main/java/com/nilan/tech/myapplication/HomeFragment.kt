package com.nilan.tech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nilan.tech.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)

        val binding: FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)


        binding.aboutBtn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAboutFragment())
        }

        binding.settingsBtn.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSettingsFragment("dark mode", true))
//            findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
        }

        return binding.root
    }

}