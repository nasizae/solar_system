package com.example.planets.ui.home.planets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.planets.R
import com.example.planets.data.model.PlanetsModel
import com.example.planets.databinding.FragmentPlanetsBinding
import com.example.planets.ui.home.planets.adapter.PlanetsAdapter

class PlanetsFragment : Fragment() {
    private lateinit var binding: FragmentPlanetsBinding
    private lateinit var list:ArrayList<PlanetsModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlanetsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        val adapter=PlanetsAdapter(list,this::OnItemClick)
        binding.rvPlanets.adapter=adapter
    }

    private fun OnItemClick(possition: Int) {

    }

    private fun initData() {
         list = ArrayList()
        list.add(
            PlanetsModel(
                "Меркурий",
                "https://cdnn21.img.ria.ru/images/153170/59/1531705918_0:3:1036:586_600x0_80_0_0_efcad45f6af0e494cd576c18de62f1ac.jpg"
            )
        )
        list.add(
            PlanetsModel(
                "Венера",
                "https://hi-news.ru/wp-content/uploads/2016/07/planeta_venera_map.jpg"
            )
        )
        list.add(
            PlanetsModel(
                "Земля",
                "https://spacegid.com/wp-content/uploads/2016/01/Zemlya.jpg"
            )
        )
        list.add(
            PlanetsModel(
                "Марс",
                "https://hi-news.ru/wp-content/uploads/2020/02/mars_salt_one_one.jpg"
            )
        )
        list.add(PlanetsModel("Юпитер", "https://kor.ill.in.ua/m/1260x900/2029690.jpg"))
        list.add(
            PlanetsModel(
                "Сатурн",
                "https://hi-news.ru/wp-content/uploads/2023/05/saturn_satellite_new_1-650x426.jpg"
            )
        )
        list.add(
            PlanetsModel(
                "Уран",
                "https://wp-s.ru/wallpapers/0/13/332858327907979/fantasticheskaya-poverxnost-planety-uran.jpg"
            )
        )
        list.add(
            PlanetsModel(
                "Нептун",
                "https://epizodsspace.airbase.ru/bibl/v_s/2005/7/01.jpg"
            )
        )
    }
}