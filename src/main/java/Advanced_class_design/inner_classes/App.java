package Advanced_class_design.inner_classes;

public class App {

    private static String st = "Hell World";
    protected String prSt = "App :   Protected String";

    private class Inner{
        protected String prSt = "Inner:  Protected String";


        class InnerInner{
            protected String prSt = "InnerInner:  Protected String";

            public void testT(){
                System.out.println( prSt );
                System.out.println( Inner.this.prSt );
                System.out.println( App.this.prSt );
            }
        }

        public void innerMethod(){
            for(int i = 0; i < st.length(); i++ ){
                System.out.println( i + " : "  + st );
            }
            System.out.println();
            System.out.println(" * * * * * * * * " + prSt + " * * * * * * * * ");
            System.out.println();
        }

    }

    class InnerTwo{
        public void printName(){
            System.out.println("This is second method");
        }
    }

    public void runner(){
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String [] args){
        App a = new App();
        a.runner();

        App.InnerTwo innerTwo = a.new InnerTwo();
        innerTwo.printName();

        App.Inner.InnerInner t = a.new Inner().new InnerInner();
        t.testT();
    }
}
