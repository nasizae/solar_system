package com.example.planets.ui.home.stars.infostars.general

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.planets.data.model.ForecastGeneralModel
import com.example.planets.databinding.ItemInfoLoveGeneralBinding

class ForecastGeneralAdapter(private val onClick:(forecastGeneralModel:ForecastGeneralModel)->Unit) : Adapter<ForecastGeneralAdapter.ForecastGeneralHolder>() {

    private val list = ArrayList<ForecastGeneralModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun addForecast(forecast: List<ForecastGeneralModel>) {
        notifyItemChanged(list.size)
        list.clear()
        list.addAll(forecast)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastGeneralHolder {
        return ForecastGeneralHolder(
            ItemInfoLoveGeneralBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ForecastGeneralHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class ForecastGeneralHolder(private val binding: ItemInfoLoveGeneralBinding) :
        ViewHolder(binding.root) {
        fun bind(forecastGeneralModel: ForecastGeneralModel) {
            with(binding) {
                tvDay.text = forecastGeneralModel.day
                tvMonth.text = forecastGeneralModel.month
                tvDesc.text = forecastGeneralModel.desc
            }
            itemView.setOnClickListener {
                onClick(forecastGeneralModel)
            }
        }
    }
}