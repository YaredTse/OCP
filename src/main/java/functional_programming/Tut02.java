package functional_programming;

import java.util.function.Supplier;

public class Tut02 {

    public void methodTakingFunc(Supplier<?> supplier ) {
        System.out.println( supplier.get() );
    }

    public static void main( String [] args ){
        Tut02 tut02 = new Tut02();
        tut02.methodTakingFunc( () -> "Generic lambda, which means it takes any value" );

        tut02.methodTakingFunc(  () -> {
            System.out.println(" This    ");
            System.out.println(" is a    ");
            System.out.println(" Generic ");
            System.out.println(" Lambda  ");
            return 12312;
            }
        );
    }
}
