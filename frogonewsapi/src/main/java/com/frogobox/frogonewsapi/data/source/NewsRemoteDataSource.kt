package com.frogobox.frogonewsapi.data.source

import android.content.Context

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * consumable-code-news-api
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogonewsapi.data.source
 *
 */
object NewsRemoteDataSource : NewsDataSource {

    private val newsApiService = NewsApiService

    override fun usingChuckInterceptor(context: Context) {
        newsApiService.usingChuckInterceptor(context)
    }

}