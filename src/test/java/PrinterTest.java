import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(600);
    }

    @Test
    public void hasSheetsOfPaper() {
        assertEquals(600, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrintPager() {
        assertEquals("Printed 30 sheets of paper",printer.print(3, 10));
    }
}
