package com.example.planets.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.planets.databinding.FragmentHomeBinding
import com.example.planets.ui.home.planets.viewpageradapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewPager()
    }
    private fun initViewPager() {
    val tab=binding.tabLayout
        val viewPager=binding.viewPager
        val adapter=ViewPagerAdapter(requireActivity().supportFragmentManager,lifecycle)
        viewPager.adapter=adapter

        TabLayoutMediator(tab,viewPager){tabitem,possition ->
            when(possition){
                0->tabitem.text="Planets"
                1->tabitem.text="Stars"
            }

        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}