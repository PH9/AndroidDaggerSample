package com.silom313.sampledagger.configuration;

import com.silom313.sampledagger.service.HelloService;

import dagger.Module;

@Module
public class MyApplicationModule {

    HelloService provideHelloService() {
        return new HelloService();
    }
}
