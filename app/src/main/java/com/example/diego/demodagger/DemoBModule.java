package com.example.diego.demodagger;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DemoBModule {

    @Provides
    public SubObj provideSubObj(){
        return new SubObj(-2);
    }
}
