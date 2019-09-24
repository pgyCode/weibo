package com.github.pgycode.weibo.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.pgycode.weibo.common.BaseFragment

/**
 * @author: xuxiaojie
 */

class HomeFragment: BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
            = inflater.inflate(R.layout.frg_home, null)

}