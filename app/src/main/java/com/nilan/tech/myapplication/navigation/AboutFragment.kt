package com.nilan.tech.myapplication.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nilan.tech.myapplication.navigation.AboutFragmentDirections
import com.nilan.tech.myapplication.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentAboutBinding = FragmentAboutBinding.inflate(inflater, container, false)


        binding.aboutTxt.setOnClickListener {
//            findNavController().navigate(R.id.action_aboutFragment_to_settingsFragment)
            findNavController().navigate(
                AboutFragmentDirections.actionAboutFragmentToSettingsFragment(
                    settingName = UserSettings("Dev Mode"),
                    settingEnabled = true
                )
            )
        }

        return binding.root
    }

}