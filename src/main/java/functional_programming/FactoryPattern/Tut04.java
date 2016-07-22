package functional_programming.FactoryPattern;

import functional_programming.FactoryPattern.Foo;
import functional_programming.FactoryPattern.FooFactory;

import java.util.function.Supplier;

public class Tut04 {

    public static void main( String [] strings ){
        Supplier<Foo> fs = () -> FooFactory.getFoo("FooTest");
        fs.get().printName("Hello");
    }

}
