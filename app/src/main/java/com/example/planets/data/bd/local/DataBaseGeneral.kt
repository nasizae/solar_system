package com.example.planets.data.bd.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.planets.data.model.ForecastGeneralModel

@Database(entities = [ForecastGeneralModel::class], version = 1)
abstract class DataBaseGeneral:RoomDatabase() {
    abstract fun forecastGeneralDao(): DaoGeneral
}