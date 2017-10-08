package com.example.diego.demodagger.components;


import com.example.diego.demodagger.FragmentThree;
import com.example.diego.demodagger.ParentBModule;
import com.example.diego.demodagger.ProvidedBObj;
import com.example.diego.demodagger.scope.ParentBScope;

import dagger.Component;

@ParentBScope
@Component(modules = ParentBModule.class,dependencies = ParentComponent.class)
public interface ParentBComponent {

    ProvidedBObj provideBObj();

    void inject(FragmentThree fragmentThree);
}
