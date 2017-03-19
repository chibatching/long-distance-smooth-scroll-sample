package com.chibatching.longdistancesmoothscrollsample

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import com.chibatching.longdistancesmoothscrollsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.recyclerView.apply {
            layoutManager = FastScrollLineaLayoutManager(this@MainActivity)
            adapter = ManyItemAdapter()
            addItemDecoration(DividerItemDecoration(this@MainActivity, DividerItemDecoration.VERTICAL))
        }

        binding.goTopButton.setOnClickListener {
            binding.recyclerView.smoothScrollToPosition(0)
        }

        binding.goBottomButton.setOnClickListener {
            binding.recyclerView.smoothScrollToPosition(binding.recyclerView.adapter.itemCount - 1)
        }
    }
}
