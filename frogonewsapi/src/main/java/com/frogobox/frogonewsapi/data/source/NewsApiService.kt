package com.frogobox.frogonewsapi.data.source

import android.content.Context
import com.frogobox.frogonewsapi.data.response.ArticleResponse
import com.frogobox.frogonewsapi.util.NewsConstant
import com.frogobox.frogonewsapi.util.NewsUrl
import com.readystatesoftware.chuck.ChuckInterceptor
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

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
interface NewsApiService {

    // Get Top Headline From Country
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineByCountry(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_COUNTRY) country: String
    ): Observable<ArticleResponse>

    // Get Top Headline From Country and Category
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineByCountry(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_COUNTRY) country: String,
        @Query(NewsConstant.QUERY_CATEGORY) category: String
    ): Observable<ArticleResponse>

    // Get Top Headline From Source
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineBySource(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_SOURCES) sources: String
    ): Observable<ArticleResponse>

    // Get Top Headline From Source and Category
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineBySource(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_SOURCES) sources: String,
        @Query(NewsConstant.QUERY_CATEGORY) category: String
    ): Observable<ArticleResponse>

    // Get Top Headline From q
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineByQ(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_Q) q: String
    ): Observable<ArticleResponse>

    // Get Top Headline From q
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineByQ(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_Q) q: String,
        @Query(NewsConstant.QUERY_CATEGORY) category: String
    ): Observable<ArticleResponse>

    // Get Top Headline From Category
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadlineByCategory(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_CATEGORY) category: String
    ): Observable<ArticleResponse>

    // Get Top Headline
    @GET(NewsUrl.NEWS_URL_TOP_HEADLINE)
    fun getTopHeadline(
        @Query(NewsConstant.QUERY_API_KEY) apiKey: String,
        @Query(NewsConstant.QUERY_Q) q: String?,
        @Query(NewsConstant.QUERY_SOURCES) sources: String?,
        @Query(NewsConstant.QUERY_CATEGORY) category: String?,
        @Query(NewsConstant.QUERY_COUNTRY) country: String?
    ): Observable<ArticleResponse>


    companion object Factory {

        private var isUsingChuckInterceptor = false
        private lateinit var context: Context

        fun usingChuckInterceptor(context: Context) {
            isUsingChuckInterceptor = true
            this.context = context
        }

        val getApiService: NewsApiService by lazy {
            val mLoggingInterceptor = HttpLoggingInterceptor()
            mLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

            val mClient = if (isUsingChuckInterceptor) {
                OkHttpClient.Builder()
                    .addInterceptor(mLoggingInterceptor)
                    .addInterceptor(ChuckInterceptor(context))
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            } else {
                OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .build()
            }

            val mRetrofit = Retrofit.Builder()
                .baseUrl(NewsUrl.NEWS_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(mClient)
                .build()

            mRetrofit.create(NewsApiService::class.java)
        }
    }

}