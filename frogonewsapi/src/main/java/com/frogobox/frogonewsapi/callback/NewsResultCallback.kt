package com.frogobox.frogonewsapi.callback

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
 * com.frogobox.frogonewsapi.callback
 *
 */
interface NewsResultCallback<T> {

    // Getting Data From API
    fun getResultData(data: T)

    // Failed Meesage
    fun failedResult(statusCode: Int, errorMessage: String?)

    // Do on subscribe
    fun onShowProgress()

    // Do on Terminate
    fun onHideProgress()

}