package com.frogobox.app.di

import com.frogobox.api.meal.ConsumeTheMealDbApi
import com.frogobox.api.movie.ConsumeMovieApi
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.app.source.AppLocalDataSource
import com.frogobox.app.source.AppRemoteDataSource
import com.frogobox.app.source.AppRepository
import com.frogobox.coreapi.meal.MealUrl
import com.frogobox.coreapi.movie.MovieUrl
import com.frogobox.coreapi.news.NewsUrl
import com.frogobox.sdk.preference.FrogoPreference
import com.frogobox.sdk.util.AppExecutors
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


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

val repositoryModule = module {

    single {
        FrogoPreference(androidContext(), "JuaraAndroid")
    }

    single {
        AppLocalDataSource(AppExecutors(), get())
    }

    single {
        ConsumeNewsApi(NewsUrl.API_KEY)
    }

    single {
        ConsumeMovieApi(MovieUrl.API_KEY)
    }

    single {
        ConsumeTheMealDbApi(MealUrl.API_KEY)
    }

    single {
        AppRemoteDataSource(androidContext(), get(), get(), get())
    }

    single {
        AppRepository(get(), get())
    }

}