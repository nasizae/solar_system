package com.example.planets.data.bd.local

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.planets.data.model.ForecastLoveModel

@Database (entities = [ForecastLoveModel::class], version = 1)
abstract class DataBaseLove:RoomDatabase() {
    abstract fun loveDao():DaoLove
}