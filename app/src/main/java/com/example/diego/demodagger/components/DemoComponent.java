package com.example.diego.demodagger.components;

import com.example.diego.demodagger.FragmentOne;
import com.example.diego.demodagger.ProvidedObj;

import dagger.Subcomponent;


@Subcomponent
public interface DemoComponent {

    ProvidedObj provideObj();

    void inject(FragmentOne fragmentOne);

    @Subcomponent.Builder
    interface Builder {
        DemoComponent build();
    }
}
