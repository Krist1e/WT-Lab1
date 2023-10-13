package main.java.by.bsuir.alekseeva.Task7;

public class Sorting {
    private Sorting() {
    }

    public static void sortArray(double[] array) {
        int index = 0;
        while (index < array.length - 1) {
            index = sortingStep(array, index);
        }
    }

    private static int sortingStep(double[] array, int index) {
        if (array[index] > array[index + 1])
        {
            swapElements(array, index, index + 1);
            if (index > 0)
                --index;
        }
        else {
            ++index;
        }
        return index;
    }

    private static void swapElements(double[] array, int i, int j) {
        array[i] += array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }

}
