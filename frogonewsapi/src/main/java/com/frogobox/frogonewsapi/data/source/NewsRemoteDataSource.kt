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
object NewsRemoteDataSource : NewsDataSource {

    private val newsApiService = NewsApiService

    override fun usingChuckInterceptor(context: Context) {
        newsApiService.usingChuckInterceptor(context)
    }

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadlineByCategory(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }

    override fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        TODO("Not yet implemented")
    }
}