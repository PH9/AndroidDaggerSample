package com.silom313.sampledagger;

import android.app.Application;
import android.util.Log;

import com.silom313.sampledagger.configuration.DaggerMyApplicationComponent;
import com.silom313.sampledagger.configuration.MyApplicationComponent;
import com.silom313.sampledagger.service.HelloService;

import javax.inject.Inject;

public class MyApplication extends Application {

    MyApplicationComponent component;

    @Inject
    HelloService service;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMyApplicationComponent.builder().build();
        component.inject(this);

        Log.d("Hello Service",  service.sayHello("BaiPhai"));
    }
}
