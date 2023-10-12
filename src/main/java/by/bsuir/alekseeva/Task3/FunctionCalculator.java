package main.java.by.bsuir.alekseeva.Task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionCalculator {
    private FunctionCalculator() {
    }

    public static Map<Double, Double> calculateTangent(double min, double max, double step) {
        checkIfValid(min, max, step);
        Map<Double, Double> result = new LinkedHashMap<>();
        for (double i = min; i <= max; i += step) {
            result.put(i, Math.tan(i));
        }
        return result;
    }

    private static void checkIfValid(double min, double max, double step) {
        if (min > max)
            throw new IllegalArgumentException("min can't be more than max");
        if (step <= 0)
            throw new IllegalArgumentException("step must be a natural number");
    }
}
