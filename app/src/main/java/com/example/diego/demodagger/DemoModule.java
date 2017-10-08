package com.example.diego.demodagger;

import com.example.diego.demodagger.components.DemoComponent;
import com.example.diego.demodagger.components.DemoComponentB;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module(subcomponents = {DemoComponent.class, DemoComponentB.class})
public class DemoModule {

    @Provides
    @Singleton
    public ProvidedObj providedObj(){
        return new ProvidedObj(10);
    }
}
