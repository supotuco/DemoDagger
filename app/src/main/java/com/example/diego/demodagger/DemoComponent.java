package com.example.diego.demodagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DemoModule.class)
public interface DemoComponent {

    void inject(TopFragment topFragment);

}
