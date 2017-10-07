package com.example.diego.demodagger;

import javax.inject.Singleton;

import dagger.Subcomponent;


@Subcomponent
public interface DemoComponent {

    void inject(TopFragment topFragment);

    @Subcomponent.Builder
    interface Builder {
        DemoComponent build();
    }
}
