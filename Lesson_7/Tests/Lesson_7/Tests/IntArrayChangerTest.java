package Lesson_7.Tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.IntArrayChanger.doubleArrayElements;

public class IntArrayChangerTest {

    @Test
    public void shouldWorkCorrectlyWithTaskExample() {
        int[] taskExample = {1, 5,  3, 2, 11, 4, 5,  2, 4, 8, 9, 1};
        int[] expected    = {2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2};
        doubleArrayElements(taskExample, (x) -> x < 6);
        assertArrayEquals(expected, taskExample);
    }

    @Test
    public void shouldIgnoreNullArray() {
        int[] testArray = null;
        assertDoesNotThrow(() -> doubleArrayElements(testArray, (x) -> true));
        assertNull(testArray);
    }

    @Test
    public void shouldIgnoreNullCondition() {
        int[] testArray = {1, 2, 3};
        int[] expectedArray = {1, 2, 3};
        assertDoesNotThrow(() -> doubleArrayElements(testArray, null));
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void shouldIgnoreNullArguments() {
        int[] testArray = null;
        assertDoesNotThrow(() -> doubleArrayElements(testArray, null));
        assertNull(testArray);
    }

    @Test
    public void shouldWorkCorrectlyWithTrueCondition() {
        int[] testArray = {0, 5, 10};
        int[] expectedArray = {0, 10, 20};
        doubleArrayElements(testArray, (x) -> true);
        assertArrayEquals(expectedArray, testArray);
    }

    @Test
    public void shouldWorkCorrectlyWithFalseCondition() {
        int[] testArray = {0, 5, 10};
        int[] expectedArray = {0, 5, 10};
        doubleArrayElements(testArray, (x) -> false);
        assertArrayEquals(expectedArray, testArray);
    }

}