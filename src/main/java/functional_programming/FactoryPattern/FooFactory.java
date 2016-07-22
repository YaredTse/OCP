package functional_programming.FactoryPattern;

import functional_programming.FactoryPattern.Foo;

public class FooFactory {

    public static Foo getFoo(String name){
        switch (name){
            case "Foo":
                return new Foo();
            case "FooTest":
                return new FooTest();
            default:
                return new Foo();
        }
    }

}
