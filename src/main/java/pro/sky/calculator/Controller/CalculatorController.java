package pro.sky.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greeting(){
        return "<h1>Добро пожаловать в калькулятор!<h1>";
    }
    @GetMapping("/plus")
    public String additionNum (@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        return calculatorService.sum(num1,num2);
    }

    @GetMapping("/minus")
    public String subtractionNum (@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        return calculatorService.subtract(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiplicationNum (@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        return calculatorService.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public String divisionNum (@RequestParam("number1") int num1, @RequestParam("number2") int num2) {
        return calculatorService.divide(num1,num2);
    }
}