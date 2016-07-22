package functional_programming;
import java.util.function.Predicate;

public class Tut05 {

    public static void main(String [] args ) {
        Predicate<String> str = String::isEmpty;
        System.out.println( str.test("thuihih") );
    }
    
}
