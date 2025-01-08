package Lesson_7;

//7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

import java.util.function.IntPredicate;

public class IntArrayChanger {

    public static void doubleArrayElements(int[] array, IntPredicate condition) {
        if (array != null && condition != null) {
            for (int i = 0; i < array.length; i++) {
                if (condition.test(array[i])) {
                    array[i] *= 2;
                }
            }
        }
    }

}
