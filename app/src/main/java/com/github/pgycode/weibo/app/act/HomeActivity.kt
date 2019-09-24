package com.github.pgycode.weibo.app.act

import android.Manifest
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.didi.virtualapk.PluginManager
import com.github.pgycode.weibo.app.R
import com.github.pgycode.weibo.app.app.App
import com.github.pgycode.weibo.app.router.Plugin
import com.github.pgycode.weibo.app.router.Router
import com.github.pgycode.weibo.common.BaseActivity
import java.lang.Exception


/**
 * @author: xuxiaojie
 */
class HomeActivity: BaseActivity() {

    lateinit var btnHome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)

        initId()

        initClick()
    }

    private fun initId() {
        btnHome = findViewById(R.id.btn_home)
    }

    private fun initClick() {
        btnHome.setOnClickListener {
            try {
                PluginManager.getInstance(App.context).loadPlugin(Plugin.get("home"))
            } catch (ignore: Exception) {
                ignore.printStackTrace()
            }
            supportFragmentManager.beginTransaction().add(R.id.container, Class.forName(Router.get("/home.page")).newInstance() as Fragment).commit()
        }
    }
}