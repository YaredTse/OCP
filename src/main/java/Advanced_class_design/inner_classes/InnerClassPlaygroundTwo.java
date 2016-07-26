package Advanced_class_design.inner_classes;


public class InnerClassPlaygroundTwo {

    public void innerClassM(){

        class LocalClass{
            public void printName(){
                System.out.println("From Local Class, printing Greetings ! !");
            }
        }

        LocalClass lc = new LocalClass();
        lc.printName();

    }

    public String returningString() throws InterruptedException {

        Integer num = 1000;

        class LocalClass{

            public String printText(){
                int num = 200;
                System.out.println( num );
                return "Greetings ! ! !";
            }
        }

        System.out.println( new LocalClass().printText() );
        return new LocalClass().printText();

    }

    public static void main(String [] args ) throws InterruptedException {
        InnerClassPlaygroundTwo icpgt = new InnerClassPlaygroundTwo();
        icpgt.innerClassM();
        icpgt.returningString();
    }

}
