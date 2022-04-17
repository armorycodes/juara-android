package com.frogobox.app.source

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.sdk.source.FrogoRepository


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

class AppRepository(
    private val remoteDataSource: AppRemoteDataSource,
    private val localDataSource: AppLocalDataSource
) : FrogoRepository(remoteDataSource, localDataSource), AppDataSource {

    override fun getApiNewsTopHeadline(
        category: String?,
        callback: ConsumeApiResponse<ArticleResponse>
    ) {
        remoteDataSource.getApiNewsTopHeadline(category, callback)
    }
}