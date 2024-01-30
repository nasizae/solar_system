package com.example.planets.ui.home.stars.infostars.love

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.planets.data.model.ForecastGeneralModel
import com.example.planets.data.model.ForecastLoveModel
import com.example.planets.databinding.ItemInfoLoveGeneralBinding

class LoveAdapter (private val onclick:(forecastLove:ForecastLoveModel)->Unit): Adapter<LoveAdapter.LoveHolder>() {
    private val list = ArrayList<ForecastLoveModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun addForecast(forecast: List<ForecastLoveModel>) {
        notifyItemChanged(list.size)
        list.clear()
        list.addAll(forecast)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LoveHolder {
        return LoveHolder(
            ItemInfoLoveGeneralBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: LoveHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class LoveHolder(private val binding: ItemInfoLoveGeneralBinding) :
        ViewHolder(binding.root) {
        fun bind(forecastLoveModel: ForecastLoveModel) {
            with(binding) {
                tvDay.text = forecastLoveModel.day
                tvDesc.text = forecastLoveModel.desc
                tvMonth.text = forecastLoveModel.month
            }
            itemView.setOnClickListener {
                onclick(forecastLoveModel)
            }
        }
    }
}