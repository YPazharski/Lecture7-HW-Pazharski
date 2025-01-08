package Lesson_7;

//6. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

public class IntArrayCreator {

    public static int[] createIntArray(int numberOfElements) throws IllegalArgumentException {
        if (numberOfElements < 0) {
            Throwable cause = new Throwable("numberOfElements can't be negative");
            throw new IllegalArgumentException("Invalid number of elements" + numberOfElements, cause);
        }

        int[] result = new int[numberOfElements];

        for (int i = 0; i < numberOfElements ; ) {
            result[i] = ++i;
        }

        return  result;
    }

}
