package com.github.pgycode.weibo.app.router

/**
 * @author: xuxiaojie
 */

object Router {

    private val map = HashMap<String, String>()

    init {
        map["/home.page"] = "com.github.pgycode.weibo.home.HomeFragment"
    }

    fun get(name: String): String {
        map[name]?.let {
            try {
                Class.forName(it)
                return it
            } catch (e: ClassNotFoundException) { }
        }
        return "com.github.pgycode.weibo.app.frg.NoneFragment"
    }

}