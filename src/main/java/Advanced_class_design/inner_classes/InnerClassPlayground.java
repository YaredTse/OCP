package Advanced_class_design.inner_classes;

public class InnerClassPlayground {

    public String str = "Instance Field";

    // Inner class
    class Foo{
        public String str = "Inner Instance Field";

        public void printName(String name ){
            System.out.println( this.str );
            System.out.println( InnerClassPlayground.this.str );
            System.out.println(name);
        }

    }

    public static void main(String [] args ){

        InnerClassPlayground in = new InnerClassPlayground();
        System.out.println( in.str );

        Foo foo = in.new Foo();
        foo.printName("Hello World ");
        // Instance Field
        // Inner Instance Field
        // Hello World

    }
}
