package Lesson_7;

public class ArrayRotator {

    public static void rotateIntArray(int[] array, int n) {
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

    }

    private static void rotateRight(int[] array) {

    }

}
