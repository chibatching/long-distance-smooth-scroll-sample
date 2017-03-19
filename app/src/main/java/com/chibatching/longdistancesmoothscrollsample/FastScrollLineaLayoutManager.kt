package com.chibatching.longdistancesmoothscrollsample

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView


class FastScrollLineaLayoutManager(context: Context) : LinearLayoutManager(context) {

    override fun smoothScrollToPosition(recyclerView: RecyclerView, state: RecyclerView.State?, position: Int) {
        OneTimeSmoothScroller(recyclerView).let {
            it.targetPosition = position
            startSmoothScroll(it)
        }
    }
}
