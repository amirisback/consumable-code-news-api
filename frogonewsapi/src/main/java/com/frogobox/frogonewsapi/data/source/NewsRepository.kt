package com.frogobox.frogonewsapi.data.source

import android.content.Context
import com.frogobox.frogonewsapi.data.response.ArticleResponse

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
class NewsRepository(private val remoteDataSource: NewsRemoteDataSource) : NewsDataSource {

    override fun usingChuckInterceptor(context: Context) {
        remoteDataSource.usingChuckInterceptor(context)
    }

    override fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadline(apiKey, q, sources, category, country, callback)
    }
}