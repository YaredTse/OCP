package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Tut03 {

    public void loopUsingGenerics(Supplier<List<String>> args){
        args.get().forEach(System.out::println);
    }

    public static void main(String [] args ){
        Tut03 tut03 = new Tut03();
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        tut03.loopUsingGenerics( () -> {
            return l;
        });
    }
}
