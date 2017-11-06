package com.jusenr.kotlindemo

/**
 * Description:
 * Copyright  : Copyright (c) 2017
 * Email      : jusenr@163.com
 * Author     : Jusenr
 * Date       : 2017/11/06
 * Time       : 9:47
 * Project    ：KotlinDemo.
 */
class NativeLib {
    companion object {
        val TAG: String = NativeLib::class.java.simpleName

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

}