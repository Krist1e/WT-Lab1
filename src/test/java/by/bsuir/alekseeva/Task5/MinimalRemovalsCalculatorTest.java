package test.java.by.bsuir.alekseeva.Task5;

import main.java.by.bsuir.alekseeva.Task5.MinimalRemovalsCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinimalRemovalsCalculatorTest {

    @Test
    public void Should_ReturnZero_When_ArrayIsEmpty() {
        int[] array = {};
        int removals = MinimalRemovalsCalculator.minRemovals(array);
        assertEquals(0, removals);
    }

    @Test
    public void Should_ReturnZero_When_ArrayHasOnlyOneElement() {
        int[] array = {5};
        int removals = MinimalRemovalsCalculator.minRemovals(array);
        assertEquals(0, removals);
    }

    @Test
    public void Should_ReturnZero_When_ArrayIsAlreadySorted() {
        int[] array = {1, 2, 3, 4, 5};
        int removals = MinimalRemovalsCalculator.minRemovals(array);
        assertEquals(0, removals);
    }

    @Test
    public void Should_ReturnNumberOfRemovals_When_ArrayIsPartiallySorted() {
        int[] array = {5, 2, 8, 7, 3, 6};
        int removals = MinimalRemovalsCalculator.minRemovals(array);
        assertEquals(3, removals);
    }

    @Test
    public void Should_ReturnNumberOfRemovals_When_ArrayIsInReverseOrder() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int removals = MinimalRemovalsCalculator.minRemovals(array);
        assertEquals(8, removals);
    }
}