package Lesson_7;

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
