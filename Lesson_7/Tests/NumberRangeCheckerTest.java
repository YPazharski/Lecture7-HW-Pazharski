package Lesson_7.Tests;

import Lesson_7.NumberRangeChecker;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumberRangeCheckerTest {

    @Test
    public void shouldReturnFalseWithNegativeArguments() {
        Assertions.assertFalse(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(-5, -10));
    }

    @Test
    public void shouldReturnFalseWithNineSum() {
        Assertions.assertFalse(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(-6, 15));
    }

    @Test
    public void shouldReturnTrueWithTenSum() {
        Assertions.assertTrue(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(10, 0));
    }

    @Test
    public void shouldReturnTrueWithElevenSum() {
        Assertions.assertTrue(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(6, 5));
    }

    @Test
    public void shouldReturnTrueWithNineteenSum() {
        Assertions.assertTrue(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(10, 9));
    }

    @Test
    public void shouldReturnTrueWithTwentySum() {
        Assertions.assertTrue(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(15, 5));
    }

    @Test
    public void shouldReturnFalseWithTwentyOneSum() {
        Assertions.assertFalse(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(6, 15));
    }

    @Test
    public void shouldReturnFalseWithHundredSum() {
        Assertions.assertFalse(NumberRangeChecker.isNumbersSumBetweenTenAndTwenty(99, 1));
    }

}