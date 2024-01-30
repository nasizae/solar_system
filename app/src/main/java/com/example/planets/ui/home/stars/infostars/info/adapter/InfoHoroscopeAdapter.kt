package com.example.planets.ui.home.stars.infostars.info.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.planets.data.model.InfoHoroscopeModel
import com.example.planets.databinding.ItemInfoHoroscopeBinding

class InfoHoroscopeAdapter(private val list: ArrayList<InfoHoroscopeModel>) :
    Adapter<InfoHoroscopeAdapter.InfoHoroscopeHolder>() {
    

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoHoroscopeHolder {
        return InfoHoroscopeHolder(
            ItemInfoHoroscopeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: InfoHoroscopeHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class InfoHoroscopeHolder(private val binding: ItemInfoHoroscopeBinding) :
        ViewHolder(binding.root) {
        fun bind(infoHoroscopeModel: InfoHoroscopeModel) {
            binding.tvTitle.text = infoHoroscopeModel.title
            binding.tvDesc.text = infoHoroscopeModel.desc
        }
    }
}