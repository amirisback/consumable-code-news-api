package com.frogobox.frogonewsapi.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * NewsApi
 * Copyright (C) 15/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogonewsapi.data.model
 *
 */
data class Source(

    @SerializedName("id")
    var id: String? = null,

    @SerializedName("name")
    var name: String? = null,

    @SerializedName("id")
    var description: String? = null,

    @SerializedName("id")
    var url: String? = null,

    @SerializedName("id")
    var category: String? = null,

    @SerializedName("id")
    var language: String? = null,

    @SerializedName("id")
    var country: String? = null

)