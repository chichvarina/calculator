package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.sevice.CalculatorService;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testWelcome1(){
        Assertions.assertEquals("Добро пожаловать в калькулятор", calculatorService.welcome());
    }

    @Test
    public void testWelcome2(){
        Assertions.assertNotEquals("Такого сообщения быть не должно", calculatorService.welcome());
    }

    @Test
    public void testPlus1(){
        Assertions.assertEquals(5, calculatorService.plus(2,3));
    }

    @Test
    public void testPlus2(){
        Assertions.assertNotEquals(7, calculatorService.plus(2,3));
    }

    @Test
    public void testMinus1(){
        Assertions.assertEquals(-1, calculatorService.minus(2,3));
    }

    @Test
    public void testMinus2(){
        Assertions.assertNotEquals(1, calculatorService.minus(2,3));
    }

    @Test
    public void testMultiply1(){
        Assertions.assertEquals(6, calculatorService.multiply(2,3));
    }

    @Test
    public void testMultiply2(){
        Assertions.assertNotEquals(8, calculatorService.multiply(2,3));
    }

    @Test
    public void testDivide1(){
        Assertions.assertEquals(3, calculatorService.divide(9,3));
    }

    @Test
    public void testDivide2(){
        Assertions.assertNotEquals(2, calculatorService.divide(9,3));
    }


    @Test
    public void testDivideZero () {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()->calculatorService.divide(1, 0)
        );
    }


}
