package com.jusenr.kotlindemo.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.jusenr.kotlindemo.NativeLib
import com.jusenr.kotlindemo.R
import com.jusenr.kotlindemo.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    companion object {
//        val TAG: String? = MainActivity::class.simpleName

        fun onLaunch(context: Context) {
            val intent = Intent(context, LaunchActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Main"

        // Example of a call to a native method
        val nativeLib = NativeLib()
        sample_text.text = nativeLib.stringFromJNI()
        sample_text.setOnClickListener(View.OnClickListener {
            onLaunch(applicationContext)
        })


//        Log.d(TAG, "This activity is ${MainActivity.TAG}")
    }

}
