package com.github.pgycode.weibo.app.router

import com.github.pgycode.weibo.app.app.App
import java.io.File

/**
 * @author: xuxiaojie
 */

object Plugin {

    private val map = HashMap<String, File>()

    init {
        map["home"] = File(File(App.context.getExternalFilesDir(null), "home.apk").absolutePath.replace("/storage/emulated/10", "/storage/emulated/0"))
    }

    fun get(name: String): File? {
        return map[name]
    }

}