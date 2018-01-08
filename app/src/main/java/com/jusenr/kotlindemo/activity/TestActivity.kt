package com.jusenr.kotlindemo.activity

import android.net.Uri
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jusenr.kotlindemo.R
import com.jusenr.kotlindemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_test.*
import org.jetbrains.anko.sdk25.coroutines.onClick

@Route(path = "/test/ui", name = "Test UI")
class TestActivity : BaseActivity() {

    @Autowired
    @JvmField
    var key1: String? = null
    @Autowired
    @JvmField
    var key2: Boolean? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_test
    }

    override fun onViewCreated(savedInstanceState: Bundle?) {

        title = "Test"

        val value1 = intent.getStringExtra("key1")
        val value2 = intent.getBooleanExtra("key2", false)

        Log.i(TAG, "key1= $value1")
        Log.i(TAG, "key2= $value2")

        tv_text.text = value1

        tv_text.onClick {
            val testUriMix = Uri.parse("arouter://k.jusenr.com/about/ui")
            ARouter.getInstance().build(testUriMix)
                    .navigation()
        }
    }
}
