package test.java.by.bsuir.alekseeva.Task7;

import main.java.by.bsuir.alekseeva.Task7.Sorting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTest {

    @Test
    public void Should_SortArrayInAscendingOrder() {
        double[] array = {4.0, 2.0, 6.0, 1.0, 3.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0, 6.0};

        Sorting.sortArray(array);

        assertArrayEquals(expectedArray, array, 0.01);
    }

    @Test
    public void Should_LeaveSortedArrayUnchanged() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        Sorting.sortArray(array);

        assertArrayEquals(expectedArray, array, 0.01);
    }

    @Test
    public void Should_SortArrayInDescendingOrder() {
        double[] array = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        Sorting.sortArray(array);

        assertArrayEquals(expectedArray, array, 0.01);
    }

    @Test
    public void Should_SortArrayWithDuplicateValues() {
        double[] array = {3.0, 2.0, 4.0, 2.0, 1.0};
        double[] expectedArray = {1.0, 2.0, 2.0, 3.0, 4.0};

        Sorting.sortArray(array);

        assertArrayEquals(expectedArray, array, 0.01);
    }

    @Test
    public void Should_SortEmptyArray() {
        double[] array = {};
        double[] expectedArray = {};

        Sorting.sortArray(array);

        assertArrayEquals(expectedArray, array, 0.01);
    }
}