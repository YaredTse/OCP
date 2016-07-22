package functional_programming;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Tut01 {

    public static void main( String [] args ){

        Supplier<LocalDate> localDate = LocalDate::now;
        System.out.println( localDate.get() );
        Supplier<String> str = () -> "Hello World from supplier";
        System.out.println( str.get() );

    }

}
