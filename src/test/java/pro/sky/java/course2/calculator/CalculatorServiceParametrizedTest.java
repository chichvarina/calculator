package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.sevice.CalculatorService;

public class CalculatorServiceParametrizedTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testWelcome(String text){
        Assertions.assertEquals(text, calculatorService.welcome());
    }

    @Test
    public void testPlus(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.plus(num1, num2));
    }

    @Test
    public void testMinus(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.minus(num1, num2));
    }

    @Test
    public void testMultiply(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.multiply(num1, num2));
    }

    @Test
    public void testDivide(int num1, int num2, int result){
        Assertions.assertEquals(result, calculatorService.divide(num1, num2));
    }

    @Test
    public void allTest(){
        testWelcome("Добро пожаловать в калькулятор");
        testPlus(4,6,10);
        testMinus(8,3,5);
        testMultiply(9,20, 180);
        testDivide(90,3, 30);
    }


}

