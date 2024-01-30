package com.example.planets.data.bd.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.planets.data.model.ForecastGeneralModel

@Dao
interface DaoGeneral{

    @Query("SELECT * FROM forecastgeneralmodel ORDER BY id")
    fun getAll():List<ForecastGeneralModel>
    @Query("SELECT * FROM ForecastGeneralModel WHERE id=:forecatsId")
    fun getById(forecatsId:Int):List<ForecastGeneralModel>
    @Insert()
    fun insertGeneral(forecastGeneralModel: ForecastGeneralModel)

    @Delete
    fun delete(forecastGeneralModel: ForecastGeneralModel)
}