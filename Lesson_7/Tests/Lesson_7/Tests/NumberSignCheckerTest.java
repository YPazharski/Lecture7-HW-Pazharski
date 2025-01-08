package Lesson_7.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.NumberSignChecker.isNegativeNumber;

public class NumberSignCheckerTest {

    @Test
    public void returnsTrueWithMinus1000() {
        assertTrue(isNegativeNumber(-1000));
    }

    @Test
    public void returnsTrueWithMinus1() {
        assertTrue(isNegativeNumber(-1));
    }

    @Test
    public void returnsFalseWith0() {
        assertFalse(isNegativeNumber(0));
    }

    @Test
    public void returnsFalseWith1() {
        assertFalse(isNegativeNumber(1));
    }

    @Test
    public void returnsFalseWith300() {
        assertFalse(isNegativeNumber(300));
    }

}