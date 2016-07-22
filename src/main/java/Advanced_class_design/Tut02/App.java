package Advanced_class_design.Tut02;

public class App extends FooAbstractClass  {

    @Override
    public void abstractClass() {
        System.out.println("Implementing Abstract method ");
    }

    public static void main(String [] args ){

        System.out.println("Abstract Class ");
        new App().abstractClass();
//        System.out.println( App.str );
        System.out.println( new App().returnStr() );

    }
}
