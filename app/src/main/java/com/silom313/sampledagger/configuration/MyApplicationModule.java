package com.silom313.sampledagger.configuration;

import com.silom313.sampledagger.service.HelloWorldService;

import dagger.Module;

@Module
public class MyApplicationModule {

    HelloWorldService provideHelloWorldService() {
        return new HelloWorldService();
    }
}
