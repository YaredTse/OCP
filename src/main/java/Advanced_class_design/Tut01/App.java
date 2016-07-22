package Advanced_class_design.Tut01;

public class App {

    public static void main(String [] args ){
        Bobcat bc = new BobcatKitten();
        bc.findDen();

        ((BobcatKitten)bc).findDen("Test");
        bc.findDen();
    }

}
