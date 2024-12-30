package Lesson_7;

import java.util.function.IntPredicate;

public class IntArrayChanger {

    public static void doubleArrayElements(int[] array, IntPredicate condition) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (condition.test(array[i])) {
                    array[i] *= 2;
                }
            }
        }
    }

}
