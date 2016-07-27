package junittdd;

public class Calculator {

    public int add(Integer a, Integer b ){
        return a + b;
    }

    public int multiply( Integer a, Integer b){
        return a * b;
    }

    public int divide( Integer a, Integer b ){
        if (b == 0) throw new IllegalArgumentException("Dividor cannot be 0");
        return a / b;
    }
}
