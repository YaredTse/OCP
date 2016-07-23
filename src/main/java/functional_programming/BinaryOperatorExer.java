package functional_programming;

import java.util.StringJoiner;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorExer {

    public void unaryOperator( String a, UnaryOperator<String> str ){
        str.apply(a);
    }

    public void binaryOperator( String a, String b, BinaryOperator<String> str ){
        str.apply(a, b );
    }

    public static void main(String [] args){

        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println( binaryOperator.apply(10, 20) ); // => 30

        BinaryOperator<String> binaryOperator1 = String::concat;
        System.out.println( binaryOperator1.apply("a ", "b") ); //=> a b

        BinaryOperatorExer bo = new BinaryOperatorExer();

        bo.unaryOperator( "This is test", (z) -> {
            System.out.println( z.toUpperCase() );  // => THIS IS A TEST
            return z.toUpperCase();
        });

        bo.binaryOperator( "Hello", " World", (a, b) -> {
            System.out.println( a.concat(b)); // => Hello World
            System.out.println( a.join( " - ", b ) ); // => Hello World
            return a.concat(b);
        });

    }
}
