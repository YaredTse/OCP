package Advanced_class_design.inner_classes;

public class LocalInnerClass {

    private int length = 4;

    public void calculate(){
        int width = 20;
        final int b = 30;

        class Inner{
            public void multiply(){
                System.out.println( length * width );
                System.out.println( b );
            }
        }
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String [] args ){
        LocalInnerClass innerClass = new LocalInnerClass();
        innerClass.calculate();
    }
}
