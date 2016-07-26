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
    public final void printHelloWorldFrom() {
        staticInnerClass.name = "test";
        Assert.assertEquals( staticInnerClass.name, "test");
    }

}
