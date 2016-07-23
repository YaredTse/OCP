package functional_programming;

@FunctionalInterface
interface Name<T, R> {
    R mycustomeMethod(T t);
}

public class CustomeFunctionalInter {

    public static void main(String [] args ){
        Name<String, Integer> cfm = (input) -> {
            return input.length();
        };
        System.out.println( cfm.mycustomeMethod( "Test ") );
    }
}
