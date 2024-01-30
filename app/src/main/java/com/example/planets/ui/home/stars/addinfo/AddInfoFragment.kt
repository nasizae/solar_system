package com.example.planets.ui.home.stars.addinfo

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
import com.example.planets.databinding.FragmentAddInfoBinding

class AddInfoFragment : Fragment() {

    private lateinit var binding: FragmentAddInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val position=arguments?.getInt("position")
        val love=arguments?.getString("love")
        initPosition(position)
        initLove(position,love)
        Log.e("ololo", "onViewCreated: $love", )

    }

    private fun initLove(position: Int?,love:String?) {
        if (position==0&&love=="love"){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }
        }
        else if(position==1&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }
        }
        else if(position==2&&love.equals("love")) {
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }
        }
        else if(position==3&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==4&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==5&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==6&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==7&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==8&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==9&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==10&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
        else if(position==11&&love.equals("love")){
            binding.btnSave.setOnClickListener {
                val data = ForecastLoveModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseLove.loveDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }

    }

    private fun initPosition(position: Int?) {
        if (position==0){
            binding.btnSave.setOnClickListener {
                val data = ForecastGeneralModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseGeneral.forecastGeneralDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }
        }
        else if(position==1){
            binding.btnSave.setOnClickListener {
                val data = ForecastGeneralModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseGeneral1.forecastGeneralDao().insertGeneral(data)
                findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }
        }
            else if(position==2) {
            binding.btnSave.setOnClickListener {
                val data = ForecastGeneralModel(
                    day = binding.etDay.text.toString(),
                    month = binding.etMonth.text.toString(),
                    desc = binding.etDesc.text.toString()
                )
                App.dataBaseGeneral2.forecastGeneralDao().insertGeneral(data)
                findNavController().navigate(
                    R.id.infoStarsFragment,
                    bundleOf("position" to position)
                )

            }
        }
            else if(position==3){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral3.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==4){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral4.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==5){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral5.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==6){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral6.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==7){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral7.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==8){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral8.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==9){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral9.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==10){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral10.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
            else if(position==11){
                binding.btnSave.setOnClickListener {
                    val data = ForecastGeneralModel(
                        day = binding.etDay.text.toString(),
                        month = binding.etMonth.text.toString(),
                        desc = binding.etDesc.text.toString()
                    )
                    App.dataBaseGeneral11.forecastGeneralDao().insertGeneral(data)
                    findNavController().navigate(R.id.infoStarsFragment, bundleOf("position" to position))
            }

        }
    }
}