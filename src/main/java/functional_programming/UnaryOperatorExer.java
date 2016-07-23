package functional_programming;

import java.util.function.UnaryOperator;

public class UnaryOperatorExer {

    public void calculateUsingUnary( Integer in2, UnaryOperator<Integer> in){
        in.apply(in2);
    }

    public static void main(String [] args ){

        System.out.println(" * * * * * * * UnaryOperator Sample * * * * * * * ");

        UnaryOperator<String> unaryOperator = String::toUpperCase;
        System.out.println( unaryOperator.apply("hello world"));

        UnaryOperator<String> integerUnaryOperator = String::toUpperCase;
        System.out.println( integerUnaryOperator.apply("xxxx"));

        UnaryOperatorExer unaryOperatorExer = new UnaryOperatorExer();

        unaryOperatorExer.calculateUsingUnary( 12, a -> {
            System.out.print( ++a );
            System.out.print( a.toString() );
            return ++a;
        });

    }
}
