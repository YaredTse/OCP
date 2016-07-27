package junittddtest;

import junittdd.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUO(){
        calculator = new Calculator();
    }

    @Test
    public void addTeoNumbers(){
        int result = calculator.add(2, 3);
        Assert.assertEquals( result, 5);
    }

    @Test
    public void multiplyTwoNumbers(){
        int result = calculator.multiply( 5, 7);
        Assert.assertEquals( result, 35 );
    }

    @Test
    public void divideTwoNumbers(){
        int result = calculator.divide(100, 2 );
        Assert.assertEquals( result, 50);
    }

    @Test
    public void divide0toaNumber(){
        int result = calculator.divide( 0, 2);
        Assert.assertEquals( result, 0 );
    }

    @Test( expected = IllegalArgumentException.class )
    public void wrongInput(){
        calculator.divide( 4, 0);
    }
}
