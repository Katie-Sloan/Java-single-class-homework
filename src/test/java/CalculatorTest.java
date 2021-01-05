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

}
