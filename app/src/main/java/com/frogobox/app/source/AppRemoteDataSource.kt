package com.frogobox.app.source

import android.app.Application
import android.content.Context
import com.frogobox.api.meal.ConsumeTheMealDbApi
import com.frogobox.api.movie.ConsumeMovieApi
import com.frogobox.api.news.ConsumeNewsApi
import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.NewsConstant
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.sdk.source.FrogoRemoteDataSource


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

class AppRemoteDataSource(
    private val context: Context,
    private val apiNews: ConsumeNewsApi,
    private val apiMovie: ConsumeMovieApi,
    private val apiMeal: ConsumeTheMealDbApi
) : FrogoRemoteDataSource(), AppDataSource {

    override fun getApiNewsTopHeadline(
        category: String?,
        callback: ConsumeApiResponse<ArticleResponse>
    ) {
        apiNews.apply {
            usingChuckInterceptor(context)
            getTopHeadline(
                null,
                null,
                category,
                NewsConstant.COUNTRY_ID,
                null,
                null,
                callback
            )
        }
    }
}