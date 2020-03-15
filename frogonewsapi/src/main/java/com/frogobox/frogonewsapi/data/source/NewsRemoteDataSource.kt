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
            .doOnSubscribe { callback.onShowProgress() }
            .doOnTerminate { callback.onHideProgress() }
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