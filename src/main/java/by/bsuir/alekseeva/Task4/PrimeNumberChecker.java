package main.java.by.bsuir.alekseeva.Task4;

public class PrimeNumberChecker {
    private PrimeNumberChecker() {
    }

    public static boolean isPrime(int number) {
        if (number <= 1 || number % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
