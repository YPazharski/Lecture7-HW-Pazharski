package Lesson_7.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.LinePrinter.printSameTextLines;

public class LinePrinterTest {

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
    public void shouldPrintOneLineCorrectly() {
        String expected = "Hello\n";
        printSameTextLines("Hello", 1);
        assertEquals(expected, outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintTwoLinesCorrectly() {
        String expected = "Yes\nYes\n";
        printSameTextLines("Yes", 2);
        assertEquals(expected, outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintEmptyLineCorrectly() {
        String expected = "\n";
        printSameTextLines("", 1);
        assertEquals(expected, outContent.toString().replaceAll("\\r\\n", "\n"));
    }

    @Test
    public void shouldPrintEmptyLinesCorrectly() {
        String expected = "\n\n\n";
        printSameTextLines("", 3);
        assertEquals(expected, outContent.toString().replaceAll("\\r\\n", "\n"));
    }

}