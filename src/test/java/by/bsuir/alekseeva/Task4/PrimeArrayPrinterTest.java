package test.java.by.bsuir.alekseeva.Task4;

import main.java.by.bsuir.alekseeva.Task4.PrimeArrayPrinter;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeArrayPrinterTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outputStream);
    @Test
    public void Should_PrintPrimeIndexesToStream_When_ArrayContainsPrimes() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        PrimeArrayPrinter.printIndexes(numbers, printStream);

        String printedIndexes = outputStream.toString();
        String expectedIndexes = "1 2 4 6 ";
        assertEquals(expectedIndexes, printedIndexes);
    }

    @Test
    public void Should_PrintNothingToStream_When_ArrayContainsNoPrimes() {
        int[] numbers = {4, 6, 8, 9};

        PrimeArrayPrinter.printIndexes(numbers, printStream);

        String printedIndexes = outputStream.toString();
        assertEquals("", printedIndexes);
    }
}