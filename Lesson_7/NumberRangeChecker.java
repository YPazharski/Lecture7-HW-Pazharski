package Lesson_7;

//1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

public class NumberRangeChecker {

    public static boolean isNumbersSumBetweenTenAndTwenty(int firstNumber, int secondNumber) {
        int numbersSum = firstNumber + secondNumber;
        return  numbersSum >= 10 && numbersSum <= 20;
    }

}
