package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private float num1;
    private float num2;

    @Override
    public String sum(float num1, float num2){
        float value = num1 + num2;
        return num1 + " + " +  num2 + " = " + value;
    }
    @Override
    public String subtract(float num1, float num2){
        float value = num1 - num2;
        return num1 + " - " +  num2 + " = " + value;
    }
    @Override
    public String multiply(float num1, float num2){
        float value = num1 * num2;
        return num1 + " * " +  num2 + " = " + value;
    }
    @Override
    public String divide(float num1, float num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("<h1>Деление на ноль невозможно.<h1>");
        }
        float value = num1 / num2;
        return num1 + " / " +  num2 + " = " + value;
    }
}
