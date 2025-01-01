package Lesson_7;

//*** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
// [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.

import org.jetbrains.annotations.NotNull;

public class ArrayRotator {

    public static void rotateIntArray(int @NotNull [] array, int n) {
        if (array.length == 0) return;
        n %= array.length;

        while (n > 0) {
            rotateRight(array);
            n--;
        }

        while (n < 0) {
            rotateLeft(array);
            n++;
        }
    }

    private static void rotateRight(int[] array) {
        int i = array.length - 1;
        int buffer = array[i];

        while (i > 0) {
            array[i] = array[i - 1];
            i--;
        }

        array[0] = buffer;
    }

    private static void rotateLeft(int[] array) {
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
