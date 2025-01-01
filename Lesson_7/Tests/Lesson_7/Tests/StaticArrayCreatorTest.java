package Lesson_7.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static Lesson_7.StaticArrayCreator.createIntArray;

public class StaticArrayCreatorTest {

    @Test
    public void shouldCreateCorrect1ElementArray() {
        int[] expected = {-1};
        int[] actual = createIntArray(1, -1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCreateCorrect3ElementsArray() {
        int[] expected = {0, 0, 0};
        int[] actual = createIntArray(3, 0);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCreateCorrect5ElementsArray() {
        int[] expected = {1, 1, 1, 1, 1};
        int[] actual = createIntArray(5, 1);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCreateCorrect10ElementsArray() {
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] actual = createIntArray(10, 10);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCreateCorrect0ElementsArray() {
        int[] expected = {};
        int[] actual = createIntArray(0, 500);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionWithNegativeLenArgument() {
        assertThrows(IllegalArgumentException.class, () -> createIntArray(-1, 100));
    }

}