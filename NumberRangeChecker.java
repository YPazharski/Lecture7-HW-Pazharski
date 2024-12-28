public class NumberRangeChecker {
    public static boolean isNumbersSumBetweenTenAndTwenty(int firstNumber, int secondNumber) {
        int numbersSum = firstNumber + secondNumber;
        return  numbersSum >= 10 && numbersSum <= 20;
    }
}
