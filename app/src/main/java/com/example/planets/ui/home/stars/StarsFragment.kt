package com.example.planets.ui.home.stars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.planets.R
import com.example.planets.data.model.StarsModel
import com.example.planets.databinding.FragmentStarsBinding
import com.example.planets.ui.home.stars.adapter.StarsAdapter

class StarsFragment : Fragment() {

    private lateinit var binding: FragmentStarsBinding
    private lateinit var list: ArrayList<StarsModel>
    private lateinit var adapter:StarsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStarsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter = StarsAdapter(list, this::OnItemClick)
        binding.rvStars.adapter = adapter
    }

    private fun loadData() {
        list = ArrayList()
        list.add(
            StarsModel(
                "Весы",
                "https://img.freepik.com/premium-vector/constellation-libra-on-starry-night-background_158677-335.jpg"
            )
        )
        list.add(
            StarsModel(
                "Скорпион",
                "https://img.freepik.com/premium-vector/constellation-scorpio-on-starry-night-background_158677-338.jpg"
            )
        )
        list.add(
            StarsModel(
                "Овен",
                "https://kosmosgid.ru/wp-content/uploads/2020/05/Sozvezdie-Oven.jpg"
            )
        )
        list.add(
            StarsModel(
                "Водолей",
                "https://kartin.papik.pro/uploads/posts/2023-06/thumbs/1688108498_kartin-papik-pro-p-kartinki-sozvezdie-vodoleya-na-nebe-14.jpg"
            )
        )
        list.add(
            StarsModel(
                "телец ",
                "https://kartin.papik.pro/uploads/posts/2023-07/thumbs/1688166457_kartin-papik-pro-p-kartinki-sozvezdie-teltsa-na-nebe-27.jpg"
            )
        )
        list.add(
            StarsModel(
                "Близнецы",
                "https://png.pngtree.com/png-clipart/20210413/ourlarge/pngtree-twelve-constellation-png-image_3210447.jpg"
            )
        )
        list.add(
            StarsModel(
                "Дева",
                "https://img.freepik.com/premium-vector/virgo-constellation-in-the-night-sky_606226-468.jpg"
            )
        )
        list.add(
            StarsModel(
                "Рыбы",
                "https://raritetus.cdnvideo.ru/storage/blog/768/zodiac-fishes-003.jpg"
            )
        )
        list.add(
            StarsModel(
                "Козерог",
                "https://img.freepik.com/premium-vector/constellation-capricorn-on-starry-night-background_158677-326.jpg"
            )
        )
        list.add(
            StarsModel(
                "Рак",
                "https://kosmosgid.ru/wp-content/uploads/2019/10/Sozvezdie-Rak.png"
            )
        )
        list.add(
            StarsModel(
                "Лев",
                "https://img.freepik.com/premium-vector/leo-constellation-in-the-night-sky_606226-315.jpg"
            )
        )
        list.add(
            StarsModel(
                "Стрелец",
                "https://img.freepik.com/premium-vector/constellation-sagittarius-on-starry-night-background_158677-340.jpg"
            )
        )
    }


    private fun OnItemClick(position: Int) {
        findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
    }

}