package Lesson_7.Tests;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static  Lesson_7.BitSwitcher.switchBites;

public class BitSwitcherTest {

    @Test
    public void shouldSwitchBitsCorrectlyWithGivenExample() {
        byte[] example =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        byte[] expected = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        switchBites(example);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldSwitchBitsCorrectlyWithOneElementArray() {
        byte[] example =  {1};
        byte[] expected = {0};
        switchBites(example);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldSwitchBitsCorrectlyWithEmptyArray() {
        byte[] example =  {};
        byte[] expected = {};
        switchBites(example);
        assertArrayEquals(expected, example);
    }

    @Test
    public void shouldIgnoreNullArray() {
        byte[] example = null;
        switchBites(example);
        assertNull(example);
    }

    @Test
    public void shouldThrowExceptionOnNonBitElement() {
        byte[] example =  {1, 2};
        assertThrows(IllegalArgumentException.class, () -> switchBites(example));
    }

}