package Lesson_7;

//2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

public class NumberSignPrinter {

    public static void printNumberSignInfo(int number) {
        System.out.println(number < 0 ? "Число отрицательное" : "Число положительное");
    }

}
