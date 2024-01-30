package com.example.planets.data.bd.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.planets.data.model.ForecastGeneralModel
import com.example.planets.data.model.ForecastLoveModel

@Dao
interface DaoLove {
    @Query("SELECT * FROM forecastlovemodel ORDER BY id")
    fun getAll():List<ForecastLoveModel>
    @Query("SELECT * FROM ForecastLoveModel WHERE id=:forecatsId")
    fun getById(forecatsId:Int):List<ForecastLoveModel>
    @Insert()
    fun insertGeneral(forecastLoveModel: ForecastLoveModel)
    @Delete()
    fun deleteLove(forecastLoveModel: ForecastLoveModel)
}