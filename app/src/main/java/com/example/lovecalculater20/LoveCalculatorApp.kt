@file:Suppress("unused")
package com.example.lovecalculater20

import android.app.Application
import androidx.databinding.ktx.BuildConfig
import timber.log.Timber

class LoveCalculatorApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}