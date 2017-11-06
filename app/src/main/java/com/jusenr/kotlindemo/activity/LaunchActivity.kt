package com.jusenr.kotlindemo.activity

import android.os.Bundle
import com.jusenr.kotlindemo.R
import com.jusenr.kotlindemo.base.BaseActivity

class LaunchActivity : BaseActivity() {


    companion object {
//        val TAG: String? = LaunchActivity::class.simpleName

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        title = "Launch"

//        Log.v(TAG, "This activity is ${LaunchActivity.TAG}")
    }

}
