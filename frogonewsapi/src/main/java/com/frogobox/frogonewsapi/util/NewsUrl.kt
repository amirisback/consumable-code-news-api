package com.frogobox.frogonewsapi.util

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
 * com.frogobox.frogonewsapi.util
 *
 */
object NewsUrl {

    const val NEWS_BASE_URL = "https://newsapi.org/"
    const val NEWS_API_KEY = "84d090d0537548ee8ac77620217b1b52"

    const val NEWS_BASE_PATH = "v2/"

    const val NEWS_PATH_TOP_HEADLINE = "top-headlines"
    const val NEWS_PATH_EVERYTHING = "everything"
    const val NEWS_PATH_SOURCES = "sources"

    const val NEWS_URL_TOP_HEADLINE = "$NEWS_BASE_PATH$NEWS_PATH_TOP_HEADLINE"
    const val NEWS_URL_EVERYTHING = "$NEWS_BASE_PATH$NEWS_PATH_EVERYTHING"
    const val NEWS_URL_SOURCES = "$NEWS_BASE_PATH$NEWS_PATH_SOURCES"
}