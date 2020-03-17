package com.frogobox.frogonewsapi

import android.content.Context
import com.frogobox.frogonewsapi.callback.NewsResultCallback
import com.frogobox.frogonewsapi.data.response.ArticleResponse
import com.frogobox.frogonewsapi.data.response.SourceResponse
import com.frogobox.frogonewsapi.data.source.NewsDataSource
import com.frogobox.frogonewsapi.data.source.NewsRemoteDataSource
import com.frogobox.frogonewsapi.data.source.NewsRepository

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
 * com.frogobox.frogonewsapi
 *
 */
class ConsumeNewsApi(private val apiKey: String) : ConsumeNewsApiView {

    private val newsRepository = NewsRepository(NewsRemoteDataSource)

    override fun usingChuckInterceptor(context: Context) {
        newsRepository.usingChuckInterceptor(context)
    }

    override fun getTopHeadline(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadline(
            apiKey,
            q,
            sources,
            category,
            country,
            pageSize,
            page,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }

            })
    }

    override fun getEverythings(
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
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getEverythings(
            apiKey,
            q,
            from,
            to,
            qInTitle,
            sources,
            domains,
            excludeDomains,
            language,
            sortBy,
            pageSize,
            page,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse>{
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            }
        )
    }

    override fun getSources(
        language: String,
        country: String,
        category: String,
        callback: NewsResultCallback<SourceResponse>
    ) {
        newsRepository.getSources(
            apiKey,
            language,
            country,
            category,
            object : NewsDataSource.GetRemoteCallback<SourceResponse> {
                override fun onSuccess(data: SourceResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }

                override fun onShowProgress() {
                    callback.onShowProgress()
                }

                override fun onHideProgress() {
                    callback.onHideProgress()
                }
            })
    }
}