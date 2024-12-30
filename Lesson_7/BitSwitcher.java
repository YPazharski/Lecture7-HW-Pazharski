package Lesson_7;

public class BitSwitcher {

    /**
     * Switches the bit array
     *
     * @param bits array of bits (0 or 1 only) that are to be switched
     */
    public static void switchBites(byte[] bits) {
        if (bits != null) {
            for (int i = 0; i < bits.length; i++) {
                bits[i] ^= 1;
            }
        }
    }

}
