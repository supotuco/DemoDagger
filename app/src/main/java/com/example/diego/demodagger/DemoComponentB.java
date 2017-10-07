package com.example.diego.demodagger;

import dagger.Subcomponent;

@Subcomponent
public interface DemoComponentB {

    void inject(BottomFragment bottomFragment);

    @Subcomponent.Builder
    interface Builder {
        DemoComponentB build();
    }
}
