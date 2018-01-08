package com.jusenr.kotlindemo

import android.app.Application
import android.support.multidex.MultiDex
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Description:
 * Copyright  : Copyright (c) 2017
 * Email      : jusenr@163.com
 * Author     : Jusenr
 * Date       : 2017/11/06
 * Time       : 10:59
 * Project    ：KotlinDemo.
 */
class TotalApplication : Application() {
    companion object {
        val TAG: String = TotalApplication::class.java.simpleName
    }

    override fun onCreate() {
        super.onCreate()

        MultiDex.install(applicationContext)

        if (BuildConfig.DEBUG) {  // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()     // 打印日志
            ARouter.openDebug()   // 开启调试模式
            ARouter.printStackTrace()//打印日志的时候打印线程堆栈
        }
        ARouter.init(this)

        Log.i(TAG, "TotalApplication\'s onCreate()")
        Log.i(TAG, "isDebug :" + BuildConfig.IS_INNER_TEST)

    }
}