package com.frogobox.frogonewsapi

import android.content.Context
import com.frogobox.frogonewsapi.callback.NewsResultCallback
import com.frogobox.frogonewsapi.data.response.ArticleResponse
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

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineByCountry(
            apiKey,
            country,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineByCountry(
            apiKey,
            country,
            category,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineBySource(
            apiKey,
            sources,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineBySource(
            apiKey,
            sources,
            category,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineByQ(
            apiKey,
            q,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineByQ(
            apiKey,
            q,
            category,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadlineByCategory(
        apiKey: String,
        category: String,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadlineByCategory(
            apiKey,
            category,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }

    override fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        callback: NewsResultCallback<ArticleResponse>
    ) {
        newsRepository.getTopHeadline(
            apiKey,
            q,
            sources,
            category,
            country,
            object : NewsDataSource.GetRemoteCallback<ArticleResponse> {
                override fun onSuccess(data: ArticleResponse) {
                    callback.getResultData(data)
                }

                override fun onFailed(statusCode: Int, errorMessage: String?) {
                    callback.failedResult(statusCode, errorMessage)
                }
            })
    }
}