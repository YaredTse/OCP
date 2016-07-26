package Advanced_class_design.inner_classes;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StaticInnerClassTest {

    static StaticInnerClass staticInnerClass;

    @BeforeClass
    public static void setUp(){
        staticInnerClass = new StaticInnerClass();
    }

    @Test
    public void printHelloWorldFrom() {
        staticInnerClass.name = "test";
        Assert.assertEquals( staticInnerClass.name, "test");
    }

    @Test
    public void returnLength(){
        String str = "random string";
        Assert.assertEquals( staticInnerClass.returnLength(str), 13 );
    }


    @Test
    public void wrongInput(){
        String str = "random string";
        Assert.assertEquals( staticInnerClass.returnLength( str ), 13 );
    }

}
