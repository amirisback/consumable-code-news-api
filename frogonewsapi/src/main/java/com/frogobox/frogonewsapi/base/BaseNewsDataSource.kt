package com.frogobox.frogonewsapi.base

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
 * com.frogobox.frogonewsapi.base
 *
 */
interface BaseNewsDataSource {

    interface ResponseCallback<T> {

        // If success fetching data from API
        fun onSuccess(data: T)

        // If failed fetching data from API
        fun onFailed(statusCode: Int, errorMessage: String? = "")

        // Do on subscribe
        fun onShowProgress()

        // Do on Terminate
        fun onHideProgress()
    }

}