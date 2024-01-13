package com.example.planets.ui.home.stars.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.planets.data.model.StarsModel
import com.example.planets.databinding.ItemStarsBinding

class StarsAdapter(
    private val list: ArrayList<StarsModel>,
    private val onClick: (position: Int) -> Unit
) : Adapter<StarsAdapter.StarsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarsHolder {
        return StarsHolder(
            ItemStarsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: StarsHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class StarsHolder(private val binding: ItemStarsBinding) : ViewHolder(binding.root) {
        fun bind(starsModel: StarsModel) {
            with(binding) {
                tvNameStars.text = starsModel.name
                Glide.with(imgStars).load(starsModel.img).into(imgStars)
                itemView.setOnClickListener {
                    onClick(adapterPosition)
                }
            }
        }
    }
}