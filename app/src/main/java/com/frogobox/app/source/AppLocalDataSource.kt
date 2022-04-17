package com.frogobox.app.source

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.sdk.preference.FrogoPreference
import com.frogobox.sdk.source.FrogoLocalDataSource
import com.frogobox.sdk.util.AppExecutors


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

class AppLocalDataSource(
    private val appExecutors: AppExecutors,
    private val preference: FrogoPreference
) : FrogoLocalDataSource(appExecutors, preference), AppDataSource {

    override fun getApiNewsTopHeadline(
        category: String?,
        callback: ConsumeApiResponse<ArticleResponse>
    ) {

    }
}