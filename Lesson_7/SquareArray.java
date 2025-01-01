package Lesson_7;

//8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

public class SquareArray {

    public static int[][] createSquareArray(int sideLength) throws IllegalArgumentException {
        if (sideLength < 0) {
            Throwable cause = new Throwable("sideLength can't be negative");
            throw new IllegalArgumentException("Invalid number of elements" + sideLength, cause);
        }

        int[][] result = new int[sideLength][sideLength];

        for (int x = 0, y = sideLength - 1; x < sideLength; x++, y--) {
            result[x][x] = 1;
            result[x][y] = 1;
        }

        return result;
    }

}
