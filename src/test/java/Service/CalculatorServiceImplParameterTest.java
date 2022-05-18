package Service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator.Constans.ConstantsTest.*;

public class CalculatorServiceImplParameterTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForAdditionCalculatorTests")
    @ParameterizedTest
    public void shouldReturnResultCorrectAddition(float num1, float num2, String expectedResult) {
        String result = out.sum(num1, num2);
        assertEquals(expectedResult, result);
    }

    @MethodSource("provideArgumentsForSubtractionCalculatorTests")
    @ParameterizedTest
    public void shouldReturnResultCorrectSubtraction(float num1, float num2, String expectedResult) {
        String result = out.subtract(num1, num2);
        assertEquals(expectedResult, result);
    }

    @MethodSource("provideArgumentsForMultiplicationCalculatorTests")
    @ParameterizedTest
    public void shouldReturnResultCorrectMultiplication(float num1, float num2, String expectedResult) {
        String result = out.multiply(num1, num2);
        assertEquals(expectedResult, result);
    }

    @MethodSource("provideArgumentsForDivisionCalculatorTests")
    @ParameterizedTest
    public void shouldReturnResultCorrectDivision(float num1, float num2, String expectedResult) {
        String result = out.divide(num1, num2);
        assertEquals(expectedResult, result);
    }
    public static Stream<Arguments> provideArgumentsForAdditionCalculatorTests() {
        return Stream.of(
                Arguments.of(num1, num1, additionNumResultTest1),
                Arguments.of(num1, num2, additionNumResultTest2)
        );
    }

    public static Stream<Arguments> provideArgumentsForSubtractionCalculatorTests() {
        return Stream.of(
                Arguments.of(num1, num1, subtractionNumResultTest1),
                Arguments.of(num1, num2, subtractionNumResultTest2)
        );
    }

    public static Stream<Arguments> provideArgumentsForMultiplicationCalculatorTests() {
        return Stream.of(
                Arguments.of(num1, num1, multiplicationNumResultTest1),
                Arguments.of(num1, num2, multiplicationNumResultTest2)
        );
    }

    public static Stream<Arguments> provideArgumentsForDivisionCalculatorTests() {
        return Stream.of(
                Arguments.of(num1, num1, divisionNumResultTest1),
                Arguments.of(num1, num2, divisionNumResultTest2)
        );
    }
}
