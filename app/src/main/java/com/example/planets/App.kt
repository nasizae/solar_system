package com.example.planets

import android.app.Application
import androidx.room.Room
import com.example.planets.data.bd.local.DataBaseGeneral
import com.example.planets.data.bd.local.DataBaseLove

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        dataBaseGeneral = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral1 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral1"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral2 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral2"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral3 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral3"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral4 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral4"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral5 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral5"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral6 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral6"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral7 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral7"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral8 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral8"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral9 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral9"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral10 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral10"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseGeneral11 = Room.databaseBuilder(
            applicationContext, DataBaseGeneral::class.java, "databasegeneral11"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()

        dataBaseLove = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove1 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee1"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove2 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee2"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove3 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee3"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove4 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee4"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove5 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee5"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove6 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee6"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove7 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee7"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove8 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee8"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove9 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee9"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove10 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee10"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        dataBaseLove11 = Room.databaseBuilder(
            applicationContext, DataBaseLove::class.java, "databaselovee11"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()

    }

    companion object {
        lateinit var dataBaseGeneral: DataBaseGeneral
        lateinit var dataBaseGeneral1: DataBaseGeneral
        lateinit var dataBaseGeneral2: DataBaseGeneral
        lateinit var dataBaseGeneral3: DataBaseGeneral
        lateinit var dataBaseGeneral4: DataBaseGeneral
        lateinit var dataBaseGeneral5: DataBaseGeneral
        lateinit var dataBaseGeneral6: DataBaseGeneral
        lateinit var dataBaseGeneral7: DataBaseGeneral
        lateinit var dataBaseGeneral8: DataBaseGeneral
        lateinit var dataBaseGeneral9: DataBaseGeneral
        lateinit var dataBaseGeneral10: DataBaseGeneral
        lateinit var dataBaseGeneral11: DataBaseGeneral

        lateinit var dataBaseLove: DataBaseLove
        lateinit var dataBaseLove1: DataBaseLove
        lateinit var dataBaseLove2: DataBaseLove
        lateinit var dataBaseLove3: DataBaseLove
        lateinit var dataBaseLove4: DataBaseLove
        lateinit var dataBaseLove5: DataBaseLove
        lateinit var dataBaseLove6: DataBaseLove
        lateinit var dataBaseLove7: DataBaseLove
        lateinit var dataBaseLove8: DataBaseLove
        lateinit var dataBaseLove9: DataBaseLove
        lateinit var dataBaseLove10: DataBaseLove
        lateinit var dataBaseLove11: DataBaseLove

    }
}