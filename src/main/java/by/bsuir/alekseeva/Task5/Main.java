package main.java.by.bsuir.alekseeva.Task5;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 6, 10, 1, 12, 15, 6};
        int result = MinimalRemovalsCalculator.minRemovals(array);
        System.out.println("Min K = " + result);
    }
}
