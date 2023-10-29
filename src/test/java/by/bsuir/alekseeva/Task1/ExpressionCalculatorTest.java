package test.java.by.bsuir.alekseeva.Task1;

import main.java.by.bsuir.alekseeva.Task1.ExpressionCalculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void Should_ReturnExpectedValue_When_ValidInput(double x, double y, double expected) {
        double result = ExpressionCalculator.calculateExpression(x, y);
        assertEquals(expected, result, 1e-6);
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(0.0, 0.0, 0.5),
                Arguments.of(0.0, 1.0, 0.854036),
                Arguments.of(1.0, 0.0, 1.569357),
                Arguments.of(1.0, 1.0, 1.91341),
                Arguments.of(1.0, -1.0, 1.5),
                Arguments.of(1.0, 2.0, 1.392274)
        );
    }
}

