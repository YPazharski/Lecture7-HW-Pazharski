package Lesson_7;

//3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
// если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.

public class NumberSignChecker {

    public static  boolean isNegativeNumber(int number) {
        return  number < 0;
    }

}
