package com.nilan.tech.myapplication.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nilan.tech.myapplication.R


class ProductsHomeFragment : Fragment() { // https://dribbble.com/shots/25304102-Ecommerce-App

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products_home, container, false)
    }

}