package pro.sky.mycalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.mycalculator.services.CalculatorServiceImpl;

@SpringBootTest

public class CalculatorServiceTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();


    @Test
    public void plusTest(){
        String actual = calculatorService.plusCalculator(2,3);
        String expected = "2 + 3 = 5";
        Assertions.assertEquals(actual, expected);

        actual =  calculatorService.plusCalculator(-2,3);
        expected = "-2 + 3 = 1";
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void minusTest(){
        String actual = calculatorService.minusCalculator(2,3);
        String expected = "2 - 3 = -1";
        Assertions.assertEquals(actual,expected);

        actual = calculatorService.minusCalculator(-2,3);
        expected = "-2 - 3 = -5";
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void multiplyTest(){
        String actual = calculatorService.multiplyCalculator(2,3);
        String expected = "2 * 3 = 6";
        Assertions.assertEquals(actual,expected);

        actual = calculatorService.multiplyCalculator(-2,3);
        expected = "-2 * 3 = -6";
        Assertions.assertEquals(actual,expected);
    }
    @Test
    public void divideTest(){
        String actual = calculatorService.divideCalculator(4,2);
        String excepted = "4 / 2 = 2";
        Assertions.assertEquals(actual,excepted);

        actual = calculatorService.divideCalculator(-10,2);
        excepted = "-10 / 2 = -5";
        Assertions.assertEquals(actual,excepted);
    }
    @Test
    public void divideByZeroTest(){
        Assertions.assertThrows(IllegalArgumentException.class,()->calculatorService.divideCalculator(1,0));
        Assertions.assertThrows(IllegalArgumentException.class,()->calculatorService.divideCalculator(5,0));
    }

}
