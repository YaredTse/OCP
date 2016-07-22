package functional_programming;

import java.util.function.Function;

public class FunctionExe {

    public int functionReturningInt(Integer in, String input, Function<String, Integer> str ){
        return str.apply(input);
    }

    public static void main(String [] args){

        Function<String, Integer> str = (a) -> a.length();
        System.out.println( str.apply("Hello") );

        Function<String, Integer> str1 = String::length;
        System.out.println( str1.apply("weewewrew") );

        FunctionExe functionExe = new FunctionExe();
        functionExe.functionReturningInt( 1, "Hello", (in) -> {
            System.out.print( in.length() );
            return in.length();
        });

    }
}
