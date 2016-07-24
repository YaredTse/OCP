package functional_programming.FactoryPattern;

import java.util.function.Supplier;

public class Foo {
    public void printName(String str){
        System.out.println( " * * * * * * * * * * * * " );
        System.out.println( " * Name from foo: " + str );
        System.out.println( " * * * * * * * * * * * *" );
    }

    /**
     *
     * These interfaces are the build in Functional Interfaces in Java 8

        Supplier<T>
            Method => get

        Consumer<T>
            Method => accept

        BiConsumer<T, U>
            Method => accept

        PredicateT<>
            Method => test

        BiPredicate<T, U>
            Method => apply

        Function<T, R>
            Method => apply

        BiFunction<T, U, R>
            Method => apply

        UnaryOperator<T>
            Method => Test

        BinaryOperator<T>
            Method => apply

     **/

}
