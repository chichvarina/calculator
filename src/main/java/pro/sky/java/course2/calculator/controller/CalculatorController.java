package pro.sky.java.course2.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.sevice.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("")
    public String welcome(){
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(int num1, int num2){
        int result = calculatorService.plus(num1, num2);
        return num1+" + "+num2+" = "+result;
    }

    @GetMapping("/minus")
    public String minus(int num1, int num2){
        int result = calculatorService.minus(num1, num2);
        return num1+" - "+num2+" = "+result;
    }

    @GetMapping("/multiply")
    public String multiply(int num1, int num2){
        int result = calculatorService.multiply(num1, num2);
        return num1+" * "+num2+" = "+result;
    }

    @GetMapping("/divide")
    public String divide(int num1, int num2){
        int result = calculatorService.divide(num1, num2);
        return num1+" / "+num2+" = "+result;
    }
}

