package main.java.by.bsuir.alekseeva.Task3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Double, Double> result = FunctionCalculator.calculateTangent(3, 5, 0.5);
        for (double i : result.keySet()) {
            System.out.printf("x = %.2f f(x) = %.4f\n", i, result.get(i));
        }
    }
}
