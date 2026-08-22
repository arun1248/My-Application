package com.nilan.tech.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.nilan.tech.myapplication.databinding.FragmentSettingsBinding
import kotlin.getValue

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSettingsBinding = FragmentSettingsBinding.inflate(inflater, container, false)
        val args: SettingsFragmentArgs by navArgs()

        binding.valueTxt.text = "${args.settingName} - ${args.settingEnabled}"
        return binding.root
    }

}