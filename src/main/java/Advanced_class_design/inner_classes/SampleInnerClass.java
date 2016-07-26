package Advanced_class_design.inner_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

interface TestInter<T, R>{
    R tetMethod(T t);
}

abstract class TestAbstractClass{
    abstract void abstractMethod();
}

public class SampleInnerClass {

    public String methodTakingAb( String arg, TestAbstractClass testAbstractClass){
        testAbstractClass.abstractMethod();
        return " FRom Abstract method implemented";
    }

    public List<String> methodTakingInt(String input, TestInter<String, List<String>> arg) {
        return arg.tetMethod(input);
    }

    public static void main(String [] args){
        TestAbstractClass tac = new TestAbstractClass() {
            @Override
            void abstractMethod() {
                System.out.println("Hello World");
            }
        };
        tac.abstractMethod();

        SampleInnerClass sampleInnerClass = new SampleInnerClass();
        sampleInnerClass.methodTakingInt( "Test I have entered as argument ", (s) -> {
            List<String> secondArg = new ArrayList<String>();
            secondArg.add(s);
            for (String str : secondArg ) {
                System.out.println( "From The For Loop " );
                System.out.println( str );
                System.out.println(  );
            }
            return secondArg;
        });
    }
}
