package com.nilan.tech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nilan.tech.myapplication.databinding.FragmentAboutBinding
import com.nilan.tech.myapplication.databinding.FragmentHomeBinding

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentAboutBinding = FragmentAboutBinding.inflate(inflater, container, false)


        binding.aboutTxt.setOnClickListener {
//            findNavController().navigate(R.id.action_aboutFragment_to_settingsFragment)
            findNavController().navigate(AboutFragmentDirections.actionAboutFragmentToSettingsFragment("Dev Mode", true))
        }

        return binding.root
    }

}