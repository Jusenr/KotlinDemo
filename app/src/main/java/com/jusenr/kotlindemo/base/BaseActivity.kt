package com.jusenr.kotlindemo.base

import android.app.Activity
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.KeyEvent
import android.view.MenuItem

abstract class BaseActivity : AppCompatActivity() {
    companion object {
        val TAG: String = BaseActivity::class.java.simpleName
        protected var mActivity: Activity? = null
    }

    override final fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutId = getLayoutId()
        if (layoutId != 0) {
            setContentView(layoutId)
        }
        mActivity = this
        Log.i(TAG, localClassName)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar!!.setHomeButtonEnabled(true)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
        onViewCreated(savedInstanceState)
    }

    protected abstract fun getLayoutId(): Int

    protected abstract fun onViewCreated(@Nullable savedInstanceState: Bundle?)

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        super.onDestroy()

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return super.onKeyDown(keyCode, event)
    }

    override fun onBackPressed() {
        super.onBackPressed()

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
