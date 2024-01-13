package com.example.planets.ui.home.planets.viewpageradapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.planets.ui.home.planets.PlanetsFragment
import com.example.planets.ui.home.stars.StarsFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PlanetsFragment()
            1 -> StarsFragment()
            else -> PlanetsFragment()
        }
    }
}