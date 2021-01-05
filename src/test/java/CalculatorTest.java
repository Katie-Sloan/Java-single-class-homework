import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() { calculator = new Calculator(0); }

    @Test
    public void add(){
        assertEquals(9, calculator.add(5, 4));
    }
    @Test
    public void subtract(){
        assertEquals(14, calculator.subtract(20, 6));
    }
    @Test
    public void multiply(){
        assertEquals(18, calculator.multiply(6, 3));
    }
    @Test
    public void divide(){
        assertEquals(15.45, calculator.divide(46.35, 3), 0.01);
    }
}
