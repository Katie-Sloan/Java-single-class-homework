import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() { printer = new Printer(500, 1000); }

    @Test
    public void successfulPrintSurplusSheets(){
        assertEquals(100, printer.print(100, 4));
        assertEquals(600, printer.tonerVolume);
    }

    @Test
    public void successfulPrintZeroSheets(){
        assertEquals(0, printer.print(10, 50));
        assertEquals(500, printer.tonerVolume);
    }

    @Test
    public void unsuccessfulPrint(){
        assertEquals(500, printer.print(51, 10));
        assertEquals(1000, printer.tonerVolume);
    }
}
