package com.example.diego.demodagger.components;


import com.example.diego.demodagger.DemoModule;
import com.example.diego.demodagger.ProvidedObj;
import com.example.diego.demodagger.components.DemoComponent;
import com.example.diego.demodagger.components.DemoComponentB;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DemoModule.class})
public interface ParentComponent {

    ProvidedObj provideObj();

    DemoComponent.Builder provideBuilder();

    DemoComponentB.Builder provideBBuilder();
}
