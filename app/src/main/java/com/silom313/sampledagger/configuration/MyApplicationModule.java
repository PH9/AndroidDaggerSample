package com.silom313.sampledagger.configuration;

import com.silom313.sampledagger.service.HelloService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyApplicationModule {

    @Provides
    @Singleton
    HelloService provideHelloService() {
        return new HelloService();
    }
}
