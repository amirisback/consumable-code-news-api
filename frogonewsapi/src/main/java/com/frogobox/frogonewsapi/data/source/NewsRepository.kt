package com.frogobox.frogonewsapi.data.source

import android.content.Context
import com.frogobox.frogonewsapi.data.response.ArticleResponse
import com.frogobox.frogonewsapi.data.response.SourceResponse

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
        pageSize: Int?,
        page: Int?,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getTopHeadline(apiKey, q, sources, category, country, pageSize, page, callback)
    }

    override fun getEverythings(
        apiKey: String,
        q: String?,
        from: String?,
        to: String?,
        qInTitle: String?,
        sources: String?,
        domains: String?,
        excludeDomains: String?,
        language: String?,
        sortBy: String?,
        pageSize: Int?,
        page: Int?,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        remoteDataSource.getEverythings(apiKey, q, from, to, qInTitle, sources, domains, excludeDomains, language, sortBy, pageSize, page, callback)
    }

    override fun getSources(
        apiKey: String,
        language: String,
        country: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<SourceResponse>
    ) {
        remoteDataSource.getSources(apiKey, language, country, category, callback)
    }
}