package com.example.portfoliopresenter

import android.app.Application
import com.example.portfoliopresenter.data.di.DataModule
import com.example.portfoliopresenter.domain.di.DomainModule
import com.example.portfoliopresenter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}