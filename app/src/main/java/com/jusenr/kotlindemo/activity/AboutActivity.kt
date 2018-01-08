package com.jusenr.kotlindemo.activity

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.jusenr.kotlindemo.R
import com.jusenr.kotlindemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_about.*

@Route(path = "/about/ui", name = "About UI")
class AboutActivity : BaseActivity() {

    override fun getLayoutId(): Int {
        return R.layout.activity_about
    }

    override fun onViewCreated(savedInstanceState: Bundle?) {
        title = "About"

        tv_text.text = title
    }
}
