package com.example.diego.demodagger.components;

import com.example.diego.demodagger.DemoBModule;
import com.example.diego.demodagger.FragmentTwo;

import dagger.Subcomponent;

@Subcomponent(modules = DemoBModule.class)
public interface DemoComponentB {

    void inject(FragmentTwo fragmentTwo);

    @Subcomponent.Builder
    interface Builder {
        DemoComponentB build();
    }
}
