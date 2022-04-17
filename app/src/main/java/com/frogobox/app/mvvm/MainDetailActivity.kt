package com.frogobox.app.mvvm

import android.os.Bundle
import com.frogobox.app.databinding.ActivityMainDetailBinding
import com.frogobox.coreapi.news.model.Article
import com.frogobox.sdk.ext.glideLoad
import com.frogobox.sdk.view.FrogoActivity

class MainDetailActivity : FrogoActivity<ActivityMainDetailBinding>() {

    companion object {
        const val EXTRA_DATA = "com.frogobox.app.mvvm.MainDetailActivity.extra_data"
    }

    override fun setupViewBinding(): ActivityMainDetailBinding {
        return ActivityMainDetailBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {}


    override fun setupOnCreate(savedInstanceState: Bundle?) {
        setupDetailActivity("Detail Berita")

        val extraArticle = frogoGetExtraData<Article>(EXTRA_DATA)
        binding.apply {
            tvTitle.text = extraArticle.title
            tvSource.text = extraArticle.source?.name ?: ""
            tvContent.text = extraArticle.description
            ivUrl.glideLoad(extraArticle.urlToImage)
        }
    }

}