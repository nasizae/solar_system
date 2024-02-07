package com.example.planets.data.bd.pref

import android.content.Context
import android.content.Context.MODE_PRIVATE
import java.net.URI

class Pref(private val context: Context) {

    private val pref = context.getSharedPreferences(PREF_NAME, MODE_PRIVATE)

    fun isOnBoardingShow(): Boolean {
        return pref.getBoolean(SHOWED_KEY, false)
    }

    fun onOnBoardingShowed() {
        pref.edit().putBoolean(SHOWED_KEY, true).apply()
    }
    fun saveImage(uri: String){
        pref.edit().putString(SAVE_IMAGE,uri).apply()

    }
    fun getImg():String?{
        return pref.getString(SAVE_IMAGE,null)
    }

    companion object {
        const val PREF_NAME = "pref_name"
        const val SHOWED_KEY = "seen_key"
        const val SAVE_IMAGE="save_image"
    }
}