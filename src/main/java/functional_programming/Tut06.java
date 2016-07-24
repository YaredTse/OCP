package functional_programming;

interface MyCustomePredicate<T> {
    boolean testThis(T t);
}

public class Tut06 {

    public void testMethod( String input, MyCustomePredicate<String> s ){
        s.testThis(input);
    }

    public static void main(String [] args){


        MyCustomePredicate<String> st = (s) -> s.length() > 12;
        System.out.println( st.testThis("test") ); // => false


        Tut06 a = new Tut06();
        a.testMethod( "Test", (s) -> {
            System.out.println( s.length() < 12 );
            return s.length() < 12;
        });

    }
}
