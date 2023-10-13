package main.java.by.bsuir.alekseeva.Task7;

public class Main {
    public static void main(String[] args) {
        double[] array = {3.2, 7.4, 5.6, 4.8, 8, 5.1, 9};
        Sorting.sortArray(array);
        for (double element: array) {
            System.out.print(element + " ");
        }
    }
}
