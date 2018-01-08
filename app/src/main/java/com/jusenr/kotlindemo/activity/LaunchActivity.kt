package com.jusenr.kotlindemo.activity

import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.jusenr.kotlindemo.base.BaseActivity
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

@Route(path = "/launch/ui", name = "Launch UI")
class LaunchActivity : BaseActivity() {
    companion object {
        val TAG: String = LaunchActivity::class.java.simpleName
    }

    override fun getLayoutId(): Int {
        return 0
    }

    override fun onViewCreated(savedInstanceState: Bundle?) {
        Log.v(TAG, "This activity is $localClassName")

        Observable.timer(3000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe({ })
                .subscribe({
                    //                    startActivity(Intent(this@LaunchActivity, MainActivity::class.java))

                    ARouter.getInstance()
                            .build("/main/ui")
                            .navigation()
                    finish()
                })
    }
}
