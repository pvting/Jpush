package com.want_want.jpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by 00282738 on 2015/11/23.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
