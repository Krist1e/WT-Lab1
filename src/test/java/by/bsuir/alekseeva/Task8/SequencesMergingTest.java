package test.java.by.bsuir.alekseeva.Task8;

import main.java.by.bsuir.alekseeva.Task8.SequencesMerging;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SequencesMergingTest {

    @Test
    public void Should_ReturnInsertedElementIndexes_When_SrcElementsAreInsertedIntoDest() {
        double[] src = {1.0, 2.0, 3.0, 4.0};
        double[] dest = {0.5, 1.0, 2.0, 4.0, 5.0};
        int[] expectedIndexes = {2, 3, 3, 4};

        int[] result = SequencesMerging.getInsertedElementsIndexes(src, dest);

        assertArrayEquals(expectedIndexes, result);
    }

    @Test
    public void Should_ReturnEmptyArray_When_SrcIsEmpty() {
        double[] src = {};
        double[] dest = {1.0, 2.0, 3.0};
        int[] expectedIndexes = {};

        int[] result = SequencesMerging.getInsertedElementsIndexes(src, dest);

        assertArrayEquals(expectedIndexes, result);
    }

    @Test
    public void Should_ReturnEmptyArray_When_DestIsEmpty() {
        double[] src = {1.0, 2.0, 3.0};
        double[] dest = {};
        int[] expectedIndexes = {0, 0, 0};

        int[] result = SequencesMerging.getInsertedElementsIndexes(src, dest);

        assertArrayEquals(expectedIndexes, result);
    }

    @Test
    public void Should_ReturnInsertedElementIndexes_When_SrcAndDestAreEqual() {
        double[] src = {1.0, 2.0, 3.0};
        double[] dest = {1.0, 2.0, 3.0};
        int[] expectedIndexes = {1, 2, 3};

        int[] result = SequencesMerging.getInsertedElementsIndexes(src, dest);

        assertArrayEquals(expectedIndexes, result);
    }
}