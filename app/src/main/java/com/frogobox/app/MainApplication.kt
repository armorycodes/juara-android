package com.frogobox.app

import com.frogobox.app.di.repositoryModule
import com.frogobox.app.di.viewModelModule
import com.frogobox.sdk.FrogoApplication
import org.koin.core.KoinApplication


/*
 * Created by faisalamir on 17/04/22
 * JuaraAndroid
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

class MainApplication : FrogoApplication() {

    override fun setupKoinModule(koinApplication: KoinApplication) {
        koinApplication.modules(listOf(repositoryModule, viewModelModule))
    }

    override fun setupOnCreate() {

    }

}
