package com.github.pgycode.weibo.app.app

import android.app.Application
import android.content.Context
import com.didi.virtualapk.PluginManager

/**
 * @author: xuxiaojie
 */

class App: Application() {

    companion object {
        lateinit var context: Context
    }

    override fun attachBaseContext(base: Context) {
        context = base
        super.attachBaseContext(base)
        PluginManager.getInstance(base).init()
    }

}