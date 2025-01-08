package Lesson_7.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.SquareArray.createSquareArray;

public class SquareArrayTest {

    @Test
    public void shouldWorkCorrectlyWithArgument3() {
        int[][] expected = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };

        int[][] actual = createSquareArray(3);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWorkCorrectlyWithArgument2() {
        int[][] expected = {
                {1, 1},
                {1, 1}
        };

        int[][] actual = createSquareArray(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWorkCorrectlyWithArgument1() {
        int[][] expected = {
                {1}
        };

        int[][] actual = createSquareArray(1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWorkCorrectlyWithArgument0() {
        int[][] expected = {
        };

        int[][] actual = createSquareArray(0);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWorkCorrectlyWithArgument4() {
        int[][] expected = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1}
        };

        int[][] actual = createSquareArray(4);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWorkCorrectlyWithArgument5() {
        int[][] expected = {
                {1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}
        };

        int[][] actual = createSquareArray(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionWithNegativeArgument() {
        assertThrows(IllegalArgumentException.class, () -> createSquareArray(-1));
    }

}