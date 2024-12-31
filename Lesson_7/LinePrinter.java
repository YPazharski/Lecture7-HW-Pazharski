package Lesson_7;

//4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

import org.jetbrains.annotations.NotNull;

public class LinePrinter {

    public static void printSameTextLines(@NotNull String text, int linesQuantity) {
        for (int i = 0; i < linesQuantity; i++) {
            System.out.println(text);
        }
    }

}
