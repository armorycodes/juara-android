package com.frogobox.app.source

import com.frogobox.coreapi.ConsumeApiResponse
import com.frogobox.coreapi.news.response.ArticleResponse
import com.frogobox.coresdk.source.ICoreDataSource


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

interface AppDataSource : ICoreDataSource {

    fun getApiNewsTopHeadline(category: String?, callback: ConsumeApiResponse<ArticleResponse>)

}