package Lesson_7;

//* Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный.

public class YearChecker {

    /**
     * @param year of Gregorian calendar
     * @return true if the year is leap according to Gregorian calendar, otherwise - false
     */
    public static boolean isLeapYear(int year) {
        if (year < 1584) {
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
