package Lesson_7.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static Lesson_7.NumberSignPrinter.printNumberSignInfo;
import static org.junit.jupiter.api.Assertions.*;

public class NumberSignPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldPrintPositiveWithArgument0() {
        printNumberSignInfo(0);
        String expected = "Число положительное\n";
        assertEquals(expected.replaceAll("\\r\\n", "\n"), outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintNegativeWithArgumentNegative1() {
        printNumberSignInfo(-1);
        String expected = "Число отрицательное\n";
        assertEquals(expected.replaceAll("\\r\\n", "\n"), outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintNegativeWithArgumentNegative100500() {
        printNumberSignInfo(-100500);
        String expected = "Число отрицательное\n";
        assertEquals(expected.replaceAll("\\r\\n", "\n"), outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintPositiveWithArgument1() {
        printNumberSignInfo(1);
        String expected = "Число положительное\n";
        assertEquals(expected.replaceAll("\\r\\n", "\n"), outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintPositiveWithArgument888() {
        printNumberSignInfo(888);
        String expected = "Число положительное\n";
        assertEquals(expected.replaceAll("\\r\\n", "\n"), outContent.toString().replaceAll("\\r\\n", "\n"));
    }

}
