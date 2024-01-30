package com.example.planets.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ForecastLoveModel(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=null,
    val day:String?=null,
    val month:String?=null,
    val desc:String?=null,
)
