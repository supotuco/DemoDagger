package com.example.diego.demodagger.components;


import com.example.diego.demodagger.FragmentFour;
import com.example.diego.demodagger.scope.DemoCScope;

import dagger.Component;

@DemoCScope
@Component(dependencies = {ParentBComponent.class, DemoComponent.class})
public interface DemoCComponent {

    void inject(FragmentFour fragmentFour);
}
