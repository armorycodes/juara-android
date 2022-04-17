package com.frogobox.app.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.frogobox.app.core.BaseActivity
import com.frogobox.app.databinding.ActivityMainBinding
import com.frogobox.app.databinding.ContentArticleHorizontalBinding
import com.frogobox.app.databinding.ContentArticleVerticalBinding
import com.frogobox.app.databinding.ContentCategoryBinding
import com.frogobox.coreapi.news.NewsConstant
import com.frogobox.coreapi.news.model.Article
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoBindingAdapter
import com.frogobox.recycler.ext.injectorBinding
import com.frogobox.sdk.ext.glideLoad
import com.frogobox.sdk.ext.progressViewHandle
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun setupViewModel() {
        mainViewModel.apply {

            getTopHeadline()
            getTopHeadline(NewsConstant.CATEGORY_HEALTH)
            setupCategory()

            eventShowProgress.observe(this@MainActivity) {
                binding.progressView.progressViewHandle(it)
            }

            eventFailed.observe(this@MainActivity) {
                showToast(it)
            }

            listData.observe(this@MainActivity) {
                setupRvHeader(it)
            }

            listCategory.observe(this@MainActivity) {
                setupRvCategory(it)
            }

            listDataCategory.observe(this@MainActivity) {
                setupRvBody(it)
            }

        }
    }

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupOnCreate(savedInstanceState: Bundle?) {

    }

    private fun setupRvCategory(data: List<String>) {

        val callback = object : IFrogoBindingAdapter<String, ContentCategoryBinding> {
            override fun onItemClicked(
                binding: ContentCategoryBinding,
                data: String,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<String>
            ) {
                binding.tvCategory.text = "category $data"
                mainViewModel.getTopHeadline(data)
            }

            override fun onItemLongClicked(
                binding: ContentCategoryBinding,
                data: String,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<String>
            ) {
            }

            override fun setViewBinding(parent: ViewGroup): ContentCategoryBinding {
                return ContentCategoryBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentCategoryBinding,
                data: String,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<String>
            ) {
                binding.tvCategory.text = data
            }
        }

        binding.rvCategory.injectorBinding<String, ContentCategoryBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearHorizontal(false)
            .build()
    }

    private fun setupRvHeader(data: List<Article>) {

        val callback = object : IFrogoBindingAdapter<Article, ContentArticleHorizontalBinding> {
            override fun onItemClicked(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                frogoStartActivity<MainDetailActivity, Article>(MainDetailActivity.EXTRA_DATA, data)
            }

            override fun onItemLongClicked(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                data.description?.let { showToast(it) }
            }

            override fun setViewBinding(parent: ViewGroup): ContentArticleHorizontalBinding {
                return ContentArticleHorizontalBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentArticleHorizontalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvPublished.text = data.publishedAt
                    tvDescription.text = data.description
                    ivUrl.glideLoad(data.urlToImage)
                }
            }
        }

        binding.rvNewsGeneral.injectorBinding<Article, ContentArticleHorizontalBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearHorizontal(false)
            .build()

    }

    private fun setupRvBody(data: List<Article>) {

        val callback = object : IFrogoBindingAdapter<Article, ContentArticleVerticalBinding> {
            override fun onItemClicked(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                frogoStartActivity<MainDetailActivity, Article>(MainDetailActivity.EXTRA_DATA, data)
            }

            override fun onItemLongClicked(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                data.description?.let { showToast(it) }
            }

            override fun setViewBinding(parent: ViewGroup): ContentArticleVerticalBinding {
                return ContentArticleVerticalBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            }

            override fun setupInitComponent(
                binding: ContentArticleVerticalBinding,
                data: Article,
                position: Int,
                notifyListener: FrogoRecyclerNotifyListener<Article>
            ) {
                binding.apply {
                    tvTitle.text = data.title
                    tvPublished.text = data.publishedAt
                    tvDescription.text = data.description
                    ivUrl.glideLoad(data.urlToImage)
                }
            }
        }

        binding.rvNewsCategory.injectorBinding<Article, ContentArticleVerticalBinding>()
            .addData(data)
            .addCallback(callback)
            .createLayoutLinearVertical(false)
            .build()
    }


}