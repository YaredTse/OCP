package Advanced_class_design.inner_classes;

public class StaticInnerClass {

    static class InnerStatic{
        public String retutnName( String str ){
            System.out.println(" = = = = = = = = ");
            return str;
        }

        static public String staticMethod( String str ){
            return str.toUpperCase();
        }

    }

    String name;

    public int returnLength(String s ){
        return s.length();
    }
}
