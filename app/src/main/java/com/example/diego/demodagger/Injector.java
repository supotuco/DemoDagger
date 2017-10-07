package com.example.diego.demodagger;

/**
 * TODO: Add class header comment!
 */

public class Injector {
    private static DemoComponent componentA;
    private static DemoComponentB componentB;

    public static void initialize(){
        DemoModule module = new DemoModule();
        componentA = DaggerDemoComponent
                .builder()
                .demoModule(module)
                .build();

        componentB = DaggerDemoComponentB
                .builder()
                .demoModule(module)
                .build();
    }

    public static DemoComponent getComponentA(){
        return componentA;
    }

    public static DemoComponentB getComponentB(){
        return componentB;
    }
}
