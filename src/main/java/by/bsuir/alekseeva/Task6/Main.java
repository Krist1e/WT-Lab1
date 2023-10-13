package main.java.by.bsuir.alekseeva.Task6;

public class Main {
    public static int n = 5;

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5};
        double[][] matrix = MatrixBuilder.buildMatrixFromShiftingArray(array);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.1f   ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
