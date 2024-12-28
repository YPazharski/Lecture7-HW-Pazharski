public class YearChecker {
    public static boolean isLeapYear(int year) {
        year = Math.abs(year);
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
