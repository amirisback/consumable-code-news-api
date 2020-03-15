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

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineByCountry(apiKey, country, callback)
    }

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineByCountry(apiKey, country, category, callback)
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineBySource(apiKey, sources, callback)
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineBySource(apiKey, sources, category, callback)
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineByQ(apiKey, q, callback)
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineByQ(apiKey, q, category, callback)
    }

    override fun getTopHeadlineByCategory(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadlineByCategory(apiKey, q, category, callback)
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