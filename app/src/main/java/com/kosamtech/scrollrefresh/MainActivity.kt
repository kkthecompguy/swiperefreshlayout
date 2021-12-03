package com.kosamtech.scrollrefresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kosamtech.scrollrefresh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var bottomNavigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        drawerLayout = binding.drawerLayout
        bottomNavigationView = binding.bottomNavigationView

        setSupportActionBar(binding.toolbar)

        val navController: NavController = this.findNavController(R.id.mainNavHostFragment)
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(binding.navView, navController)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

        bottomNavigationView.setupWithNavController(navController)

//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if(destination.id == R.id.starter_fragment) {
//
//                bottomNavigationView.visibility = View.GONE
//                drawerLayout.visibility = View.GONE
//            } else {
//
//                bottomNavigationView.visibility = View.VISIBLE
//            }
//        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.mainNavHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}