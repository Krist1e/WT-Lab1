package main.java.by.bsuir.alekseeva.Task1;

import static java.lang.Math.*;

public class ExpressionCalculator {
    private ExpressionCalculator() {
    }

    public static double calculateExpression(double x, double y) {
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2 * x) / (1 + pow(x, 2) * pow(y, 2)));
        return numerator / denominator + x;
    }
}
