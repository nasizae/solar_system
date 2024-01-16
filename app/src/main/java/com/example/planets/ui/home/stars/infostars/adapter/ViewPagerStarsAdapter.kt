package com.example.planets.ui.home.stars.infostars.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.planets.ui.home.stars.infostars.general.GeneralFragment
import com.example.planets.ui.home.stars.infostars.info.InfoFragment
import com.example.planets.ui.home.stars.infostars.love.LoveFragment

class ViewPagerStarsAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private var fragmentArgs: Bundle?=null
    fun setArguments(args: Bundle){
        fragmentArgs=args
    }

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
    return when (position) {
            0 -> {val fragment=InfoFragment()
                fragment.arguments=fragmentArgs
                fragment
            }
            1 -> {
                val fragment = LoveFragment()
                fragment.arguments = fragmentArgs
                fragment
            }
            2 -> {val fragment=GeneralFragment()
                fragment.arguments=fragmentArgs
                fragment }
        else ->InfoFragment()
        }

    }
}
