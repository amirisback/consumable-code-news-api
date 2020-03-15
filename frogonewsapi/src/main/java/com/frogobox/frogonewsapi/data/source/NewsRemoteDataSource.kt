package com.frogobox.frogonewsapi.data.source

import android.content.Context
import com.frogobox.frogonewsapi.data.response.ArticleResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

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
        newsApiService.getApiService
            .getTopHeadlineByCountry(apiKey, country)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadlineByCountry(
        apiKey: String,
        country: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadlineByCountry(apiKey, country, category)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadlineBySource(apiKey, sources)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadlineBySource(
        apiKey: String,
        sources: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadlineBySource(apiKey, sources, category)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadlineByQ(apiKey, q)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadlineByQ(
        apiKey: String,
        q: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadlineByQ(apiKey, q, category)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadlineByCategory(
        apiKey: String,
        category: String,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadlineByCategory(apiKey, category)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }

    override fun getTopHeadline(
        apiKey: String,
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        callback: NewsDataSource.GetRemoteCallback<ArticleResponse>
    ) {
        newsApiService.getApiService
            .getTopHeadline(apiKey, q, sources, category, country)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : NewsApiCallback<ArticleResponse>() {
                override fun onSuccess(model: ArticleResponse) {
                    callback.onSuccess(model)
                }

                override fun onFailure(code: Int, errorMessage: String) {
                    callback.onFailed(code, errorMessage)
                }

                override fun onFinish() {}
            })
    }
}