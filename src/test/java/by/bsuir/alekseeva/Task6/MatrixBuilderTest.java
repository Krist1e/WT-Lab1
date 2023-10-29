package test.java.by.bsuir.alekseeva.Task6;

import main.java.by.bsuir.alekseeva.Task6.MatrixBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixBuilderTest {
    @Test
    public void Should_BuildMatrixFromShiftingArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        double[][] expectedMatrix = {
                {1.0, 2.0, 3.0, 4.0},
                {2.0, 3.0, 4.0, 1.0},
                {3.0, 4.0, 1.0, 2.0},
                {4.0, 1.0, 2.0, 3.0}
        };

        double[][] matrix = MatrixBuilder.buildMatrixFromShiftingArray(array);

        assertEquals(expectedMatrix.length, matrix.length);
        for (int i = 0; i < expectedMatrix.length; i++) {
            assertArrayEquals(expectedMatrix[i], matrix[i], 0.01);
        }
    }

    @Test
    public void Should_BuildMatrixFromEmptyArray() {
        double[] array = {};
        double[][] expectedMatrix = {};

        double[][] matrix = MatrixBuilder.buildMatrixFromShiftingArray(array);

        assertArrayEquals(expectedMatrix, matrix);
    }

    @Test
    public void Should_BuildMatrixFromSingleElementArray() {
        double[] array = {5.0};
        double[][] expectedMatrix = {{5.0}};

        double[][] matrix = MatrixBuilder.buildMatrixFromShiftingArray(array);

        assertArrayEquals(expectedMatrix, matrix);
    }
}