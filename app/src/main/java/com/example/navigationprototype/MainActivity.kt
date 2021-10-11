package com.example.navigationprototype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.navigationprototype.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var drawerLayout : DrawerLayout
    lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)

        drawerLayout = binding.drawerLayout
        val navController = findNavController(R.id.myNavigation)
        appBarConfiguration = AppBarConfiguration(navController.graph , drawerLayout)
        NavigationUI.setupActionBarWithNavController(this , navController , drawerLayout)
        NavigationUI.setupWithNavController(binding.navView , navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.myNavigation)
        return NavigationUI.navigateUp(navController , drawerLayout)
    }
}