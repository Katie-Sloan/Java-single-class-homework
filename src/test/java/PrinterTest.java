import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() { printer = new Printer(500); }

    @Test
    public void successfulPrintSurplusSheets(){
        assertEquals(100, printer.print(100, 4));
    }

    @Test
    public void successfulPrintZeroSheets(){
        assertEquals(0, printer.print(10, 50));
    }

    @Test
    public void unsuccessfulPrint(){
        assertEquals(500, printer.print(51, 10));
    }

}
