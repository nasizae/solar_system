package com.example.planets.ui.home.planets.infoPlanets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.planets.R
import com.example.planets.databinding.FragmentInfoPlanetsBinding

class InfoPlanetsFragment : Fragment() {

    private lateinit var binding: FragmentInfoPlanetsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentInfoPlanetsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}