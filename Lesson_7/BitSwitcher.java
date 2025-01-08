package Lesson_7;

//5. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [1, 1, 0, 0, 1, 0, 1, 1, 0, 0]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class BitSwitcher {

    /**
     * Switches the bit array. If null in the parameter no exception will be thrown.
     *
     * @param bits array of bits (0 or 1 only) that are to be switched
     */
    public static void switchBites(byte[] bits) throws IllegalArgumentException {
        if (bits != null) {
            for (int i = 0; i < bits.length; i++) {
                if (bits[i] != 0 && bits[i] != 1) {
                    throw new IllegalArgumentException("the element on the " + i + " position is " + bits[i] +
                            ". It must be 0 or 1");
                }
            }

            for (int i = 0; i < bits.length; i++) {
                bits[i] ^= 1;
            }
        }
    }

}
