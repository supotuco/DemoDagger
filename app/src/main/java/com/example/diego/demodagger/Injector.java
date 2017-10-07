package com.example.diego.demodagger;

/**
 * TODO: Add class header comment!
 */

public class Injector {
    private static ParentComponent parentComponent;
    private static DemoComponent componentA;
    private static DemoComponentB componentB;

    public static void initialize(){
        DemoModule module = new DemoModule();

        parentComponent = DaggerParentComponent
                .builder()
                .demoModule(module)
                .build();
    }

    public static DemoComponent getComponentA(){
        return parentComponent
                .provideBuilder()
                .build();
    }

    public static DemoComponentB getComponentB(){
        return parentComponent
                .provideBBuilder()
                .build();
    }
}
