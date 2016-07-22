package functional_programming.FactoryPattern;

import java.util.function.BiFunction;

public class BiFunctionExe {

    public void methodBiFunc(String input1, String input2, BiFunction<String, String, Integer> funcArg  ){
        funcArg.apply(input1, input2);
    }

    public static void main( String [] args) {

        BiFunction< String, String, Integer> str = (a, b) -> a.concat(b).length();
        System.out.println( str.apply("H", "B"));  // => 2

        BiFunction<String, String, String> str2 = String::concat;
        System.out.println( str2.apply("H", "B"));  // "HB"

        BiFunctionExe biFunctionExe = new BiFunctionExe();
        biFunctionExe.methodBiFunc( "hello",  "world", (a, b) -> {
            System.out.println( a.concat(b).length()) ;
            return  a.concat(b).length();
        });

    }
}
