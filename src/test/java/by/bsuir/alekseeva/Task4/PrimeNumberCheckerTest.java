package test.java.by.bsuir.alekseeva.Task4;

import main.java.by.bsuir.alekseeva.Task4.PrimeNumberChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberCheckerTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 7, 11, 13})
    public void Should_ReturnTrue_When_NumberIsPrime(int number) {
        assertTrue(PrimeNumberChecker.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 8, 9, 10, -5, 0})
    public void Should_ReturnFalse_When_NumberIsNotPrime(int number) {
        assertFalse(PrimeNumberChecker.isPrime(number));
    }

}