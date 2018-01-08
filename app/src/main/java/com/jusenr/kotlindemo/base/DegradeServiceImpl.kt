package com.jusenr.kotlindemo.base

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.DegradeService

/**
 * Description: 实现DegradeService接口
 * Copyright  : Copyright (c) 2018
 * Email      : jusenr@163.com
 * Author     : Jusenr
 * Date       : 2018/01/08
 * Time       : 15:01
 * Project    ：KotlinDemo.
 */
@Route(path = "/xxx/xxx") // 必须标明注解
class DegradeServiceImpl : DegradeService {

    override fun onLost(context: Context?, postcard: Postcard?) {
        TODO("not implemented")
    }

    override fun init(context: Context?) {
        TODO("not implemented")
    }
}