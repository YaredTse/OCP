package functional_programming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryInterfaceSample {

    public static void main( String [] args ){

        UnaryOperator<String> st = (a) -> {;
            System.out.println( a.toUpperCase());
            return a.toUpperCase();
        };

        System.out.println( st.apply("test test"));

        BinaryOperator<String> st2 = (a, b) -> a + b;
        System.out.println( st2.apply("a", "b" ));

    }

}
