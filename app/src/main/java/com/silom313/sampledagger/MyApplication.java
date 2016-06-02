package com.silom313.sampledagger;

import android.app.Application;

import com.silom313.sampledagger.configuration.DaggerMyApplicationComponent;
import com.silom313.sampledagger.configuration.MyApplicationComponent;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MyApplicationComponent myApplicationComponent = DaggerMyApplicationComponent.create();
    }
}
