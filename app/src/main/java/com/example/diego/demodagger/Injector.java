package com.example.diego.demodagger;

import com.example.diego.demodagger.components.*;
import com.example.diego.demodagger.scope.DemoCScope;


public class Injector {
    private static ParentComponent parentComponent;
    private static ParentBComponent parentBComponent;
    private static DemoComponent componentA;
    private static DemoComponentB componentB;

    public static void initialize() {
        DemoModule module = new DemoModule();

        parentComponent = com.example.diego.demodagger.components.DaggerParentComponent
                .builder()
                .demoModule(module)
                .build();

        parentBComponent = DaggerParentBComponent
                .builder()
                .parentComponent(parentComponent)
                .parentBModule(new ParentBModule())
                .build();

    }

    public static ParentComponent getParentComponent() {
        return parentComponent;
    }

    public static ParentBComponent getParentBComponent() {
        return parentBComponent;
    }

    public static DemoComponent getComponentA() {

        return getParentComponent()
                .provideBuilder()
                .build();
    }

    public static DemoComponentB getComponentB() {
        return parentComponent
                .provideBBuilder()
                .build();
    }

    public static DemoCComponent getComponentC() {
        return DaggerDemoCComponent
                .builder()
                .parentBComponent(getParentBComponent())
                .demoComponent(getComponentA())
                .build();
    }
}
