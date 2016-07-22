package functional_programming.FactoryPattern;

public class FooTest extends Foo  {

    public void printName(String str){
        System.out.print( "Name from FooTest: " + str );
    }

    public void printName(String str, int a){
        System.out.print( "Name from FooTest: " + str );
    }

}
