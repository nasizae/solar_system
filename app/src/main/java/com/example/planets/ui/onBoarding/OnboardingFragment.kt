package com.example.planets.ui.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.planets.R
import com.example.planets.data.bd.pref.Pref
import com.example.planets.databinding.FragmentOnboardingBinding
import com.example.planets.ui.onBoarding.adapter.OnBoardingAdapter

class OnboardingFragment : Fragment() {
    private lateinit var binding: FragmentOnboardingBinding
    private  var adapter= OnBoardingAdapter(this::OnClick)
    private val pref : Pref by lazy {
        Pref(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView() {
        binding.viewPager.adapter = adapter
        binding.indicator.setViewPager(binding.viewPager)
    }

    private fun OnClick() {
        pref.onOnBoardingShowed()
        findNavController().navigate(R.id.authorizationFragment)
    }
}