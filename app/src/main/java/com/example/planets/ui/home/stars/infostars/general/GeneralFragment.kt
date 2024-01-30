package com.example.planets.ui.home.stars.infostars.general

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.planets.App
import com.example.planets.R
import com.example.planets.data.model.ForecastGeneralModel
import com.example.planets.databinding.FragmentGeneralBinding

class GeneralFragment : Fragment() {

    private lateinit var binding: FragmentGeneralBinding
    val adapter = ForecastGeneralAdapter(this::OnItenClick)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGeneralBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val position=arguments?.getInt("position")
        initPosition(position)
        binding.rvGeneral.adapter = adapter
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.addInfoFragment, bundleOf("position" to position))
        }
    }

    private fun initPosition(position: Int?) {
        if (position==0){
            val data = App.dataBaseGeneral.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
        else if(position==1){
            val data = App.dataBaseGeneral1.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
          else if(position==2){
            val data = App.dataBaseGeneral2.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
          else if(position==3){
            val data = App.dataBaseGeneral3.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
          else if(position==4){
            val data = App.dataBaseGeneral4.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
          else if(position==5){
            val data = App.dataBaseGeneral5.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
          else if(position==6){

            val data = App.dataBaseGeneral6.forecastGeneralDao().getAll()
            adapter.addForecast(data)
          }
          else if(position==7){
            val data = App.dataBaseGeneral7.forecastGeneralDao().getAll()
            adapter.addForecast(data)

        }
          else if(position==8){
            val data = App.dataBaseGeneral8.forecastGeneralDao().getAll()
            adapter.addForecast(data)

        }
          else if(position==9){
            val data = App.dataBaseGeneral9.forecastGeneralDao().getAll()
            adapter.addForecast(data)

        }
          else if(position==10){
            val data = App.dataBaseGeneral10.forecastGeneralDao().getAll()
            adapter.addForecast(data)

        }
          else if(position==11){
            val data = App.dataBaseGeneral11.forecastGeneralDao().getAll()
            adapter.addForecast(data)
        }
    }

    private fun OnItenClick(forecastGeneralModel: ForecastGeneralModel) {
        App.dataBaseGeneral.forecastGeneralDao().delete(forecastGeneralModel)
    }
}