package utils;

public class IntsFrequency {
    public static int maxFrequency(int min, int max, int[] sequence) {
        int[] array = new int[max - min + 1];
        int maxElem = -1;
        int maxElemIndex = 0;

        for (int integer: sequence) {
            array[integer - min] += 1;
        }

        for (int i = 0; i < max; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
                maxElemIndex = i;
            }
        }

       return maxElemIndex + min;
    }
}
