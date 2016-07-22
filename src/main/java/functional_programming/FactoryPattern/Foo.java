package functional_programming.FactoryPattern;

import java.util.function.Supplier;

public class Foo {
    public void printName(String str){
        System.out.println( " * * * * * * * * * * * * " );
        System.out.println( " * Name from foo: " + str );
        System.out.println( " * * * * * * * * * * * *" );
    }
}
