package com.lpf.rxgirls.base;

import android.app.Application;
import android.content.Context;

import com.lpf.rxgirls.utils.AppContextUtil;

public class MyApplication extends Application {

    private static Context mApplicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContextUtil.init(this);
        mApplicationContext = this;
    }

    // 获取ApplicationContext
    public static Context getContext() {
        return mApplicationContext;
    }
}
