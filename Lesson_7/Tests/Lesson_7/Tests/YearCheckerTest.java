package Lesson_7.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.YearChecker.isLeapYear;

public class YearCheckerTest {

    @Test
    public void shouldReturnFalseWithNegativeYear() {
        assertFalse(isLeapYear(-2025));
    }

    @Test
    public void shouldReturnFalseWithZeroYear() {
        assertFalse(isLeapYear(0));
    }

    @Test
    public void shouldReturnFalseWithYearBeforeGregorianCalendar() {
        assertFalse(isLeapYear(1444));
    }

    @Test
    public void shouldReturnFalseWithYear1900() {
        assertFalse(isLeapYear(1900));
    }

    @Test
    public void shouldReturnTrueWithYear2000() {
        assertTrue(isLeapYear(2000));
    }

    @Test
    public void shouldReturnTrueWithYear2024() {
        assertTrue(isLeapYear(2024));
    }

}