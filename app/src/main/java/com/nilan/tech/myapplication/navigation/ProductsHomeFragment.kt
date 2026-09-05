package com.nilan.tech.myapplication.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.FragmentProductsHomeBinding


class ProductsHomeFragment : Fragment() { // https://dribbble.com/shots/25304102-Ecommerce-App

    lateinit var binding: FragmentProductsHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductsHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = listOf(
            "Page 1",
            "Page 2",
            "Page 3"
        )


        binding.viewpagerBanner.adapter = ViewPagerAdapter(items)

        TabLayoutMediator(
            binding.tabLayout,
            binding.viewpagerBanner
        ) { _, _ ->
            // Nothing needed
        }.attach()

        binding.categoriesRV.adapter = RecyclerAdapter(listOf(
            "Mobile",
            "Headphone",
            "Tablets",
            "Laptop",
            "Speakers",
            "More"
        ))
    }
}