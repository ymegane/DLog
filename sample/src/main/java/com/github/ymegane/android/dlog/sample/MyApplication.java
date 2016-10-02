package com.github.ymegane.android.dlog.sample;

import android.app.Application;

import com.github.ymegane.android.dlog.DLog;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        DLog.init(this);
    }
}
