package com.example.planets

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.planets.data.bd.pref.Pref
import com.example.planets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val pref : Pref by lazy {
        Pref(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        if(!pref.isOnBoardingShow()){
            navController.navigate(R.id.onboardingFragment)
        }

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_profile
            )
        )
        supportActionBar?.hide()
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        val fragmentWithoutButtonNav = setOf(
            R.id.onboardingFragment,
            R.id.registrationFragment,
            R.id.authorizationFragment
        )
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (fragmentWithoutButtonNav.contains(destination.id)) {
                navView.isVisible = false
            } else {
                navView.isVisible = true
            }
        }
    }
}