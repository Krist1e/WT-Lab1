package main.java.by.bsuir.alekseeva.Task4;

import java.io.PrintStream;

public class PrimeArrayPrinter {
    private PrimeArrayPrinter() {
    }

    public static void printIndexes(int[] numbers, PrintStream stream) {
        for (int i = 0; i < numbers.length; i++) {
            if (PrimeNumberChecker.isPrime(numbers[i])) {
                stream.print(i + " ");
            }
        }
    }
}
