# consumable-code-news-api By AmirIsBack
- v1.0.4 - Development
- Stable version

# About This Project
Eliminates the method of retrieving json data using retrofit repeatedly. so this project has a set of functions to retrieve data without the need for fetching data using the retrofit of the API

# Special From This Project
Simple code and reusable data

# Documentation The News API
https://newsapi.org/

# Screenshoot Apps
<span align="center"><img width="200px" height="360px" src="docs/image/ss_main.png"></span>
<span align="center"><img width="200px" height="360px" src="docs/image/ss_chuck_1.png"></span>
<span align="center"><img width="200px" height="360px" src="docs/image/ss_chuck_2.png"></span>

# Version Release
This Is Latest Release

    $version_release = 1.0.5

What's New??

    * update build.gradle *
    * fixing CLEARTEXT security policy issue *

# How To Use This Project
<h3>Step 1. Add the JitPack repository to your build file</h3>

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
<h3>Step 2. Add the dependency</h3>

	dependencies {
	        // library consumable code news api
            implementation 'com.github.amirisback:consumable-code-news-api:1.0.5'
	}
	
<h3>Step 3. Declaration ConsumeNewsApi</h3>

	val consumeNewsApi = ConsumeNewsApi(NewsUrl.NEWS_API_KEY) // Your API_KEY
    consumeNewsApi.usingChuckInterceptor(this) // Using Chuck Interceptor
    consumeNewsApi.getTopHeadline( // Adding Base Parameter on main function
        null, 
        null,
        CATEGORY_HEALTH,
        COUNTRY_ID,
        null,
        null,
        object : NewsResultCallback<ArticleResponse> {
            override fun getResultData(data: ArticleResponse) {
                // Your Ui or data
            }

            override fun failedResult(statusCode: Int, errorMessage: String?) {
                // Your failed to do
            }

            override fun onShowProgress() {
                // Your Progress Show
            }

            override fun onHideProgress() {
                // Your Progress Hide
            }

        })
	

# Contant Value Category

    object NewsConstant {
    
        const val CATEGORY_BUSINESS = "business"
        const val CATEGORY_ENTERTAIMENT = "entertainment"
        const val CATEGORY_GENERAL = "general"
        const val CATEGORY_HEALTH = "health"
        const val CATEGORY_SCIENCE = "science"
        const val CATEGORY_SPORTS = "sports"
        const val CATEGORY_TECHNOLOGY = "technology"
    
    }

# Function Main From This Project
    // Switch For Using Chuck Interceptor
    fun usingChuckInterceptor(context: Context)

    // Get Top Headline
    fun getTopHeadline(
        q: String?,
        sources: String?,
        category: String?,
        country: String?,
        pageSize: Int?,
        page: Int?,
        callback: NewsResultCallback<ArticleResponse>
    )

    // Get Everythings
    fun getEverythings(
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
    )

    // Get Sources
    fun getSources(
        language: String,
        country: String,
        category: String,
        callback: NewsResultCallback<SourceResponse>
    )

# Fecthing Data Library
- Retrofit
- RxJava
- OkHttp
- Chuck Interceptor

# Android Library Version (build.gradle)
- ext.kotlin_version = '1.3.72'
- classpath 'com.android.tools.build:gradle:3.6.3'
- compileSdkVersion 29
- buildToolsVersion "29.0.3"
- minSdkVersion 21

# Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

# Attention !!!
Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account
- If you like this library, please help me / you can donate to buy patreon services