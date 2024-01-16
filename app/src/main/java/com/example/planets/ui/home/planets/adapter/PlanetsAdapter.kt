package com.example.planets.ui.home.planets.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.planets.data.model.PlanetsModel
import com.example.planets.databinding.ItemPlanetsBinding

class PlanetsAdapter(private val list:ArrayList<PlanetsModel>,private val onClick:(planetModel:PlanetsModel,possition:Int)->Unit) : Adapter<PlanetsAdapter.PlanetsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetsHolder {
        return PlanetsHolder(
            ItemPlanetsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: PlanetsHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class PlanetsHolder(private val binding: ItemPlanetsBinding) : ViewHolder(binding.root) {
        fun bind(planetsModel: PlanetsModel) {
            with(binding){
                tvNamePlanets.text=planetsModel.name
                Glide.with(imgPlanets).load(planetsModel.img).into(imgPlanets)
                itemView.setOnClickListener {
                    onClick(planetsModel,adapterPosition)
                }
            }
        }
    }
}