package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String additionNum (@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null) {
            return "<h1>Не заполнен пареметр.<h1>";
        }
        Integer result = calculatorService.sum(num1,num2);
        return generateMessadge(num1,num2, '+', result);
    }

    @GetMapping("/minus")
    public String subtractionNum (@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorService.subtract(num1,num2);
        return generateMessadge(num1,num2, '-', result);
    }

    @GetMapping("/multiply")
    public String multiplicationNum (@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer result = calculatorService.multiply(num1,num2);
        return generateMessadge(num1,num2, '*', result);
    }

    @GetMapping("/divide")
    public String divisionNum (@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num2 == 0) {
            return "<h1>Деление на ноль невозможно.<h1>";
        }
        Integer result = calculatorService.divide(num1,num2);
        return generateMessadge(num1,num2, '/', result);
    }
    private String generateMessadge(int num1, int num2, char action, int result){
        return String.format("<h1>%d %c %d = %d</h1>", num1, action, num2, result);
    }
}
