package Lesson_7;

import java.util.Arrays;

public class StaticArrayCreator {

    public static int[] createIntArray(int len, int initialValue) throws IllegalArgumentException {
        if (len < 0) {
            Throwable cause = new Throwable("len parameter can't be negative");
            throw new IllegalArgumentException("Invalid length:" + len, cause);
        }

        int[] result = new int[len];
        Arrays.fill(result, initialValue);

        return result;
    }

}
