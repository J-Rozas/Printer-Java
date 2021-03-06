import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(600, 1000);
    }

    @Test
    public void hasSheetsOfPaper() {
        assertEquals(600, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrintPages() {
        assertEquals("Printed 30 sheets of paper", printer.print(3, 10));
    }

    @Test
    public void cannotPrintPagesIfNotEnoughPaper() {
        assertEquals("Not enough paper to print that", printer.print(200, 400));
    }

    @Test
    public void hasTonerVolume() {
        assertEquals(1000, printer.getTonerVolume());
    }

    @Test
    public void tonerLowersWithUsage() {
        printer.print(250, 2);
        assertEquals(500, printer.getTonerVolume());
    }
}
