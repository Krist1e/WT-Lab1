package test.java.by.bsuir.alekseeva.Task3;

import java.util.Map;

import main.java.by.bsuir.alekseeva.Task3.FunctionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionCalculatorTest {
    @Test
    public void Should_CalculateTangentValuesInRange_When_ValidInputProvided() {
        double min = 0.0;
        double max = Math.PI / 2;
        double step = 0.25;

        Map<Double, Double> result = FunctionCalculator.calculateTangent(min, max, step);

        assertNotNull(result);

        for (double x = min; x <= max; x += step) {
            assertTrue(result.containsKey(x));
        }

        for (double x = min; x <= max; x += step) {
            double expected = Math.tan(x);
            double actual = result.get(x);
            assertEquals(expected, actual, 0.01);
        }
    }

    @Test
    public void Should_ThrowIllegalArgumentException_When_MinIsGreaterThanMax() {
        assertThrows(IllegalArgumentException.class, () -> FunctionCalculator.calculateTangent(1.0, 0.0, 0.25));
    }

    @Test
    public void Should_ThrowIllegalArgumentException_When_StepIsNotPositive() {
        assertThrows(IllegalArgumentException.class, () -> FunctionCalculator.calculateTangent(0.0, Math.PI / 6, -0.25));
    }
}