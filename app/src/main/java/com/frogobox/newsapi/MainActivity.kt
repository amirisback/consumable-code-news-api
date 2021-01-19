package com.frogobox.newsapi

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.frogobox.frogonewsapi.ConsumeNewsApi
import com.frogobox.frogonewsapi.callback.NewsResultCallback
import com.frogobox.frogonewsapi.data.model.Article
import com.frogobox.frogonewsapi.data.response.ArticleResponse
import com.frogobox.frogonewsapi.util.NewsConstant.CATEGORY_HEALTH
import com.frogobox.frogonewsapi.util.NewsConstant.COUNTRY_ID
import com.frogobox.frogonewsapi.util.NewsUrl
import com.frogobox.recycler.boilerplate.viewrclass.FrogoViewAdapterCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNewsApi()
    }

    private fun setupNewsApi() {
        val consumeNewsApi = ConsumeNewsApi(NewsUrl.NEWS_API_KEY) // Your API_KEY
        consumeNewsApi.usingChuckInterceptor(this)
        consumeNewsApi.getTopHeadline(
            null,
            null,
            CATEGORY_HEALTH,
            COUNTRY_ID,
            null,
            null,
            object : NewsResultCallback<ArticleResponse> {
                override fun getResultData(data: ArticleResponse) {
                    // Your Ui or data
                    data.articles?.let { setupFrogoRecyclerView(it) }
                }

                override fun failedResult(statusCode: Int, errorMessage: String?) {
                    // Your failed to do
                }

                override fun onShowProgress() {
                    // Your Progress Show
                    runOnUiThread {
                        progressView.visibility = View.VISIBLE
                    }
                }

                override fun onHideProgress() {
                    // Your Progress Hide
                    runOnUiThread {
                        progressView.visibility = View.GONE
                    }
                }

            })
    }

    private fun setupFrogoRecyclerView(data: List<Article>) {
        frogorecyclerview.injector<Article>()
            .addData(data)
            .addCustomView(R.layout.frogo_rv_list_type_6)
            .addEmptyView(null)
            .addCallback(object : FrogoViewAdapterCallback<Article> {
                override fun onItemClicked(data: Article) {}

                override fun onItemLongClicked(data: Article) {}

                override fun setupInitComponent(view: View, data: Article) {
                    val tvTitle = view.findViewById<TextView>(R.id.frogo_rv_list_type_6_tv_title)
                    val tvSubtitle = view.findViewById<TextView>(R.id.frogo_rv_list_type_6_tv_subtitle)
                    val tvDesc = view.findViewById<TextView>(R.id.frogo_rv_list_type_6_tv_desc)
                    val ivPoster = view.findViewById<ImageView>(R.id.frogo_rv_list_type_6_frogo_dummy_content_description)

                    tvTitle.text = data.title ?: "No Data"
                    tvSubtitle.text = data.author ?: "No Data"
                    tvDesc.text = data.description
                    Glide.with(view.context).load(data.urlToImage).into(ivPoster)
                }
            })
            .createLayoutLinearVertical(false)
            .build()
    }

}
