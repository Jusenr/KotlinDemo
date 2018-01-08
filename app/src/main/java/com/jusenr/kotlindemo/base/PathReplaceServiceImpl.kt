package com.jusenr.kotlindemo.base

import android.content.Context
import android.net.Uri
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.service.PathReplaceService


/**
 * Description: 实现PathReplaceService接口，并加上一个Path内容任意的注解即可
 * Copyright  : Copyright (c) 2018
 * Email      : jusenr@163.com
 * Author     : Jusenr
 * Date       : 2018/01/08
 * Time       : 15:04
 * Project    ：KotlinDemo.
 */
@Route(path = "/xxx/xxx") // 必须标明注解
class PathReplaceServiceImpl : PathReplaceService {

    override fun init(context: Context?) {
        TODO("not implemented")
    }

    /**
     * For normal path.
     *
     * @param path raw path
     */
    override fun forString(path: String): String {
        return path    // 按照一定的规则处理之后返回处理后的结果
    }

    /**
     * For uri type.
     *
     * @param uri raw uri
     */
    override fun forUri(uri: Uri): Uri {
        return uri    // 按照一定的规则处理之后返回处理后的结果
    }
}