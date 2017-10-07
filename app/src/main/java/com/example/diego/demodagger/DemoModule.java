package com.example.diego.demodagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DemoModule {

    @Provides
    @Singleton
    public ProvidedObj providedObj(){
        return new ProvidedObj(10);
    }
}