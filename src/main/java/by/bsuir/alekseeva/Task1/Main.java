package main.java.by.bsuir.alekseeva.Task1;

public class Main {
    public static double X;
    public static double Y;

    static {
        X = 2.0;
        Y = 5.0;
    }

    public static void main(String[] args) {
        double result = ExpressionCalculator.calculateExpression(X, Y);
        System.out.printf("Result of calculation: %.4f", result);
    }
}
