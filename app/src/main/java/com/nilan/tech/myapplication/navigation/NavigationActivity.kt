package com.nilan.tech.myapplication.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.ActivityNavigationBinding

class NavigationActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityNavigationBinding = DataBindingUtil.setContentView(this, R.layout.activity_navigation)
        drawerLayout = binding.drawerLayout

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host)

        NavigationUI.setupActionBarWithNavController(this,navController, drawerLayout)

        NavigationUI.setupWithNavController(binding.navView, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }

}