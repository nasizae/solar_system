package com.example.planets.ui.home.stars.infostars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.planets.R
import com.example.planets.databinding.FragmentInfoStarsBinding
import com.example.planets.ui.home.stars.infostars.adapter.ViewPagerStarsAdapter
import com.google.android.material.tabs.TabLayoutMediator

class InfoStarsFragment : Fragment() {
    private lateinit var binding: FragmentInfoStarsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoStarsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tab = binding.tabLayout
        val viewPager = binding.viewPager
        val adapter = ViewPagerStarsAdapter(requireActivity().supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tab, viewPager) { tabLayout, posotion ->
            when (posotion) {
                0 -> tabLayout.text = "Info"
                1 -> tabLayout.text = "Love"
                2 -> tabLayout.text = "General"
            }
        }.attach()
        val position = arguments?.getInt("position")
        getInfoPosition(position)
        val bundle=Bundle()
        if (position!=null) {
            bundle.putInt("position", position)
            adapter.setArguments(bundle)
        }
        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
    private fun getInfoPosition(position: Int?) {
        if (position == 0) {
            initVesy()
        } else if (position == 1) {
            initScorpion()
        } else if (position == 2) {
            initOven()
        } else if (position == 3) {
            initVodoley()
        } else if (position == 4) {
            initTelec()
        } else if (position == 5) {
            initBliznecy()
        } else if (position == 6) {
            initDeva()
        } else if (position == 7) {
            initFish()
        } else if (position == 8) {
            initKozerog()
        } else if (position == 9) {
            initRak()
        } else if (position == 10) {
            initLion()
        } else if (position == 11) {
            initStrelec()
        }


    }

    private fun initStrelec() {
        binding.tvNameStars.text = "Стрелец"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1120x630/d535a8566a427d33.jpeg")
            .into(binding.imgStars)    }

    private fun initLion() {
        binding.tvNameStars.text = "Лев"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1200x675/83b3f239a3126de1.jpeg?version=1")
            .into(binding.imgStars)    }

    private fun initRak() {
        binding.tvNameStars.text = "Рак"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1200x675/d8c2dd13d96f9b49.jpeg?version=1")
            .into(binding.imgStars)    }

    private fun initKozerog() {
        binding.tvNameStars.text = "Козерог"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1200x675/ff8677734c9fa2a1.jpeg?version=2")
            .into(binding.imgStars)    }

    private fun initFish() {
        binding.tvNameStars.text = "Рыбы"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1120x630/cd6e23b3ae914d73.jpeg")
            .into(binding.imgStars)    }

    private fun initDeva() {
        binding.tvNameStars.text = "Дева"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1200x675/586062432b8aa164.jpeg?version=1")
            .into(binding.imgStars)
    }

    private fun initBliznecy() {
        binding.tvNameStars.text = "Близнецы"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1120x630/359378f6417b8477.jpeg")
            .into(binding.imgStars)
    }

    private fun initTelec() {
        binding.tvNameStars.text = "Телец"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1200x675/20880df1d87f0bcf.jpeg?version=2")
            .into(binding.imgStars)
    }

    private fun initVodoley() {
        binding.tvNameStars.text = "Водолей"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1120x630/4bd1a07f1458c034.jpeg")
            .into(binding.imgStars)
    }

    private fun initOven() {
        binding.tvNameStars.text = "Овен"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1120x630/ef66688939c3e442.jpeg")
            .into(binding.imgStars)
    }

    private fun initScorpion() {
        binding.tvNameStars.text = "Скорпион"
        Glide.with(binding.imgStars)
            .load("https://sunlight.net/wiki/wp-content/uploads/2020/12/talisman_skorpion_4.jpg")
            .into(binding.imgStars)
    }

    private fun initVesy() {
        binding.tvNameStars.text = "Весы"
        Glide.with(binding.imgStars)
            .load("https://cdn.nur.kz/images/1120x630/418bef7dc4d1f568.jpeg").into(binding.imgStars)
    }
}