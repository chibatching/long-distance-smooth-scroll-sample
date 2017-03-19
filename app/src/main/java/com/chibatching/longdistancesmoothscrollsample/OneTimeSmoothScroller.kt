package com.chibatching.longdistancesmoothscrollsample

import android.support.v7.widget.LinearSmoothScroller
import android.support.v7.widget.RecyclerView
import android.view.animation.AccelerateInterpolator

class OneTimeSmoothScroller(recyclerView: RecyclerView) : LinearSmoothScroller(recyclerView.context) {
    private var isScrolled: Boolean = false

    override fun updateActionForInterimTarget(action: Action) {
        if (isScrolled) {
            action.jumpTo(targetPosition)
        } else {
            super.updateActionForInterimTarget(action)
            action.duration *= 2
            action.interpolator = AccelerateInterpolator(1.5F)
            isScrolled = true
        }
    }
}
