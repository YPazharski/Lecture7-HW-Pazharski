package Lesson_7.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.ArrayRotator.rotateIntArray;

public class ArrayRotatorTest {

    @Test
    public void shouldRotateRightTaskExample1Correctly() {
        int[] example = {1, 2, 3};
        int[] expected = {3, 1, 2};
        rotateIntArray(example, 1);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateLeftTaskExample1Correctly() {
        int[] example = {1, 2, 3};
        int[] expected = {2, 3, 1};
        rotateIntArray(example, -1);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldDoNotMoveWithTaskExample1Correctly() {
        int[] example = {1, 2, 3};
        int[] expected = {1, 2, 3};
        rotateIntArray(example, 0);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateLeftTaskExample2Correctly() {
        int[] example = {3, 5, 6, 1};
        int[] expected = {6, 1, 3, 5};
        rotateIntArray(example, -2);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateRightTaskExample2Correctly() {
        int[] example = {3, 5, 6, 1};
        int[] expected = {6, 1, 3, 5};
        rotateIntArray(example, 2);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateRightFullTurnCorrectly() {
        int[] example = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        rotateIntArray(example, 5);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateRightFullTurnsCorrectly() {
        int[] example = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        rotateIntArray(example, 1000000000);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateLeftFullTurnCorrectly() {
        int[] example = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        rotateIntArray(example, -5);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateLeftFullTurnsCorrectly() {
        int[] example = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        rotateIntArray(example, -1000000000);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateRightAlmostFullTurnCorrectly() {
        int[] example = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 3, 4, 5, 6, 1};
        rotateIntArray(example, 5);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateLeftAlmostFullTurnCorrectly() {
        int[] example = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 1, 2, 3, 4, 5};
        rotateIntArray(example, -5);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateRightAlmostFullTurnsCorrectly() {
        int[] example = {1, 2, 3, 4, 5, 6};
        int[] expected = {2, 3, 4, 5, 6, 1};
        rotateIntArray(example, 11);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldRotateLeftAlmostFullTurnsCorrectly() {
        int[] example = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 1, 2, 3, 4, 5};
        rotateIntArray(example, -11);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldIgnoreEmptyArray() {
        int[] example = {};
        int[] expected = {};
        rotateIntArray(example, 1000);
        assertArrayEquals(expected, example);
    }

}