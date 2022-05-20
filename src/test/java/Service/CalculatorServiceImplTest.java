package Service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator.Constans.ConstantsTest.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectAdditionResult() {
        String result = out.sum(num1,num1);
        assertEquals(additionNumResultTest1,result);
        result = out.sum(num1,num2);
        assertEquals(additionNumResultTest2,result);
    }

    @Test
    public void shouldReturnCorrectSubtractionResult() {
        String result = out.subtract(num1,num1);
        assertEquals(subtractionNumResultTest1,result);
        result = out.subtract(num1,num2);
        assertEquals(subtractionNumResultTest2,result);
    }

    @Test
    public void shouldReturnCorrectMultiplicationResult() {
        String result = out.multiply(num1,num1);
        assertEquals(multiplicationNumResultTest1,result);
        result = out.multiply(num1,num2);
        assertEquals(multiplicationNumResultTest2,result);
    }

    @Test
    public void shouldReturnCorrectDivisionResult() {
        String result = out.divide(num1,num1);
        assertEquals(divisionNumResultTest1,result);
        result = out.divide(num1,num2);
        assertEquals(divisionNumResultTest2,result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDividedByZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(num1, zero));
    }
}