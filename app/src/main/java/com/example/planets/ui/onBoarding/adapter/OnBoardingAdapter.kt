package com.example.planets.ui.onBoarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.planets.data.model.OnBoardingModel
import com.example.planets.databinding.ItemOnboardingBinding

class OnBoardingAdapter(private val onClick: () -> Unit) :
    Adapter<OnBoardingAdapter.OnBoardingHolder>() {

    private val list = arrayListOf(
        OnBoardingModel(
            "Добро пожаловать в \"Открытие Вселенной\"!",
            "Приветствуем вас в увлекательном мире изучения Солнечной системы. " +
                    "Это приложение создано, чтобы предоставить вам захватывающий опыт путешествия по" +
                    " космосу и погружения в тайны нашей галактики.",
            "https://miro.medium.com/v2/resize:fit:1200/1*FNXxV1vq6v8eG2pIJYdsiw.png"
        ),
        OnBoardingModel(
            "Исследование Планет",
            "Выберите любую планету из Солнечной системы и начните свое иследование и путешествие. ",
            "https://kartinki.pics/uploads/posts/2022-12/thumbs/1670338072_7-kartinkin-net-p-planeti-dlya-detei-kartinki-instagram-7.png"
        ),
        OnBoardingModel(
            "Интерфейс",
            "Удобный интерфейс который поможет окунуться в мир галактики",
            "https://cdn.icon-icons.com/icons2/3512/PNG/512/apps_ui_interaction_icon_221025.png"
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingHolder {
        return OnBoardingHolder(
            ItemOnboardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: OnBoardingHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class OnBoardingHolder(private var binding: ItemOnboardingBinding) :
        ViewHolder(binding.root) {
        fun bind(onBoardingModel: OnBoardingModel) {
            with(binding) {
                tvTitle.text = onBoardingModel.title
                tvDesc.text = onBoardingModel.desc
                Glide.with(imgOnBoarding).load(onBoardingModel.image).into(imgOnBoarding)
                btnNext.isVisible = adapterPosition == list.lastIndex
                btnNext.setOnClickListener {
                    onClick()
                }
                skip.setOnClickListener {
                    onClick()
                }
            }
        }
    }

}