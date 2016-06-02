package com.silom313.sampledagger.configuration;

import com.silom313.sampledagger.service.HelloService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    HelloService getHelloService();
}
