package com.example.diego.demodagger;

import com.example.diego.demodagger.scope.ParentBScope;

import dagger.Module;
import dagger.Provides;


@Module
public class ParentBModule {
    @Provides
    @ParentBScope
    public ProvidedBObj providedBObj(){
        return new ProvidedBObj(1992);
    }
}
