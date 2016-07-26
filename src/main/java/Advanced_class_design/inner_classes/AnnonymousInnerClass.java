package Advanced_class_design.inner_classes;

public class AnnonymousInnerClass {

    static abstract class InnerAbstract{
        abstract int testMethod();
    }

    public int retrnmeSome(int base, InnerAbstract innerAbstract){
        return base * innerAbstract.testMethod();
    }

    public int annoMeth(int a ){
        InnerAbstract innerInner = new InnerAbstract(){
            @Override
            int testMethod() {
                return 12;
            }
        };
        return innerInner.testMethod() * a;
    }

    public static void main( String [] args ){
        AnnonymousInnerClass annonymousInnerClass = new AnnonymousInnerClass();
        int a = annonymousInnerClass.annoMeth(12);
        System.out.println( a );  // => 144

        int ba = annonymousInnerClass.retrnmeSome( 12, new InnerAbstract() {
            @Override
            public int testMethod() {
                return 0;
            }
        });

        System.out.println( ba );
    }
}
