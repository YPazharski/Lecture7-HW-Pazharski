package Lesson_7;

import org.jetbrains.annotations.NotNull;

public class ArrayRotator {

    public static void rotateIntArray(int @NotNull [] array, int n) {
        while (n > 0) {
            rotateRight(array);
            n--;
        }

        while (n < 0) {
            rotateLeft(array);
            n++;
        }
    }

    private static void rotateLeft(int[] array) {
        int i = array.length - 1;
        int buffer = array[i];

        while (i > 0) {
            array[i] = array[i - 1];
            i--;
        }

        array[0] = buffer;
    }

    private static void rotateRight(int[] array) {
        int i = 0;
        int buffer = array[i];
        int stopIndex = array.length - 1;
        while (i < stopIndex) {
            array[i] = array[i + 1];
            i++;
        }

        array[i] = buffer;
    }

}
