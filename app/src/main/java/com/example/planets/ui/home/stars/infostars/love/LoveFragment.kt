package com.example.planets.ui.home.stars.infostars.love

import android.os.Binder
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.planets.App
import com.example.planets.R
import com.example.planets.data.model.ForecastGeneralModel
import com.example.planets.data.model.ForecastLoveModel
import com.example.planets.databinding.FragmentLoveBinding
import com.example.planets.ui.home.stars.infostars.general.ForecastGeneralAdapter


class LoveFragment : Fragment() {
    private lateinit var binding: FragmentLoveBinding
    val adapter=LoveAdapter(this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentLoveBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val position=arguments?.getInt("position")
        initPosition(position)
        binding.rvLove.adapter=adapter
        val love="love"
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.addInfoFragment,  bundleOf("position" to position,"love" to love))
        }
    }

    private fun initPosition(position: Int?) {
        if (position==0){
           val data= App.dataBaseLove.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==1){
            val data= App.dataBaseLove1.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==2){
            val data= App.dataBaseLove2.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==3){
            val data= App.dataBaseLove3.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==4){
            val data= App.dataBaseLove4.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==5){
            val data= App.dataBaseLove5.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==6){
            val data= App.dataBaseLove6.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==7){
            val data= App.dataBaseLove7.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==8){
            val data= App.dataBaseLove8.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==9){
            val data= App.dataBaseLove9.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==10){
            val data= App.dataBaseLove10.loveDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==11){
            val data= App.dataBaseLove11.loveDao().getAll()
            adapter.addForecast(data)
        }
    }
    private fun onClick(forecastLoveModel: ForecastLoveModel) {
        App.dataBaseLove.loveDao().deleteLove(forecastLoveModel)
    }
}
