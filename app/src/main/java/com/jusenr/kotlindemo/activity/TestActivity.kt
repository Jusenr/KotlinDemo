package com.jusenr.kotlindemo.activity

import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.jusenr.kotlindemo.R
import com.jusenr.kotlindemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_test.*

@Route(path = "/test/ui", name = "Test UI")
class TestActivity : BaseActivity() {

    @Autowired
    internal var key1: String? = null
    @Autowired
    internal var key2: Boolean? = null

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
    }
}
