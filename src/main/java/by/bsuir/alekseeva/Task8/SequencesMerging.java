package main.java.by.bsuir.alekseeva.Task8;

import java.util.Arrays;

public class SequencesMerging {
    private SequencesMerging() {
    }

    public static int[] getInsertedElementsIndexes(double[] src, double[] dest) {
        int[] result = new int[src.length];
        for (int i = 0; i < src.length; i++) {
            int index = Arrays.binarySearch(dest, src[i]);
            result[i] = (index >= 0) ? index + 1 : Math.abs(index) - 1;
        }
        return result;
    }
}
