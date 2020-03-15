package com.frogobox.newsapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.frogonewsapi.ConsumeNewsApi
import com.frogobox.frogonewsapi.callback.NewsResultCallback
import com.frogobox.frogonewsapi.data.response.ArticleResponse
import com.frogobox.frogonewsapi.util.NewsUrl

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val consumeNewsApi = ConsumeNewsApi(NewsUrl.NEWS_API_KEY)
        consumeNewsApi.usingChuckInterceptor(this)
        consumeNewsApi.getTopHeadline(
            null,
            null,
            null,
            "id",
            object : NewsResultCallback<ArticleResponse> {
                override fun getResultData(data: ArticleResponse) {

                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {
                    TODO("Not yet implemented")
                }

                override fun onShowProgress() {
                    TODO("Not yet implemented")
                }

                override fun onHideProgress() {
                    TODO("Not yet implemented")
                }
            })


    }
}
