package Advanced_class_design.inner_classes;

public class App2 {

    interface InnerInterface{
        void printName();
    }

    class InnerClass implements InnerInterface {
        @Override
        public void printName() {
            System.out.println("From within the implementing class");
        }
    }

    public static void main(String [] args ){
        App2 app2 = new App2();
        App2.InnerInterface innerInterface = app2.new InnerClass();
        innerInterface.printName();
    }
}
