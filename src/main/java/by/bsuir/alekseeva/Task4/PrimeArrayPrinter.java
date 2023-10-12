package main.java.by.bsuir.alekseeva.Task4;

public class PrimeArrayPrinter {
    private PrimeArrayPrinter() {
    }

    public static void printIndexes(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (PrimeNumberChecker.isPrime(numbers[i])) {
                System.out.print(i + " ");
            }
        }
    }
}
