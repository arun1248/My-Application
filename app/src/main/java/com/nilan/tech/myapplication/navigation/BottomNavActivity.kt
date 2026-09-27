package com.nilan.tech.myapplication.navigation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.ActivityBottomNavBinding

class BottomNavActivity : AppCompatActivity() {
    val list = listOf(
        Product("Earbuds", R.drawable.earbuds),
        Product("Glass", R.drawable.glass),
        Product("Cream", R.drawable.cream),
        Product("Sent", R.drawable.scent),
        Product("Shoe", R.drawable.shoe),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bottom_nav)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<BottomNavigationView>(R.id.bottomNav).setupWithNavController(findNavController(R.id.bottomNavHost))



    }
}