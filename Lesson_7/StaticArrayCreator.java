package Lesson_7;

//9.* Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

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
