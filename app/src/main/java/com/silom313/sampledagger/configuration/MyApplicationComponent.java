package com.silom313.sampledagger.configuration;

import com.silom313.sampledagger.MyApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    void inject(MyApplication application);
}
