package main.java.by.bsuir.alekseeva.Task4;

public class PrimeArrayPrinter {
    private ArrayPrinter() {
    }

    public static void printIndexes(int[] numbers) {
        for (int i = 0; i <= numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(i + ", ");
            }
        }
    }
}
