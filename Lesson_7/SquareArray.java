package Lesson_7;

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
