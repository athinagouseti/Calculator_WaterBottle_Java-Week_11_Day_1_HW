import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(20, 5);
    }

    @Test
    public void hasAdd(){
        assertEquals(25, calculator.add());
    }

    @Test
    public void hasSubtract(){
        assertEquals(15, calculator.subtract());
    }

    @Test
    public void hasMultiply(){
        assertEquals(100, calculator.multiply());
    }

    @Test
    public void hasDivide(){
        assertEquals(4, calculator.divide(), 0.0);
    }

}
