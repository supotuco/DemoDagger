package com.example.diego.demodagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DemoModule.class)
public interface DemoComponentB {

    void inject(BottomFragment bottomFragment);
}
