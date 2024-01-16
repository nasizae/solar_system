package com.example.planets.ui.home.planets.infoPlanets.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.planets.databinding.ItemsInfoPlanetsBinding

class InfoPlanetsAdapter(private val list: ArrayList<String>) :
    Adapter<InfoPlanetsAdapter.InfoPlanetsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoPlanetsHolder {
        return InfoPlanetsHolder(
            ItemsInfoPlanetsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: InfoPlanetsHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class InfoPlanetsHolder(private val binding: ItemsInfoPlanetsBinding) :
        ViewHolder(binding.root) {
        fun bind(img: String) {
            Glide.with(binding.img).load(img).into(binding.img)
        }
    }
}