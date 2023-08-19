package pro.sky.mycalculator;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.mycalculator.services.CalculatorService;
import pro.sky.mycalculator.services.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedCalculatorServiceTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> plusTestParam(){
        return Stream.of(
                Arguments.of(2,3,"2 + 3 = 5"),
                Arguments.of(-2,3,"-2 + 3 = 1"),
                Arguments.of(1,1,"1 + 1 = 2")

        );
    }
    @ParameterizedTest
    @MethodSource("plusTestParam")
    public void plusTest(int num1,int num2,String result){
        assertEquals(result,calculatorService.plusCalculator(num1,num2));
    }
    public static Stream<Arguments> minusTestParam(){
        return Stream.of(
                Arguments.of(2,3,"2 - 3 = -1"),
                Arguments.of(-2,3,"-2 - 3 = -5"),
                Arguments.of(1,1,"1 - 1 = 0")

        );
    }
    @ParameterizedTest
    @MethodSource("minusTestParam")
    public void minusTest(int num1,int num2,String result){
        assertEquals(result,calculatorService.minusCalculator(num1,num2));
    }
    public static Stream<Arguments> multiplyTestParam(){
        return Stream.of(
                Arguments.of(2,3,"2 * 3 = 6"),
                Arguments.of(-2,3,"-2 * 3 = -6"),
                Arguments.of(1,1,"1 * 1 = 1")

        );
    }
    @ParameterizedTest
    @MethodSource("multiplyTestParam")
    public void multiplyTest(int num1,int num2,String result){
        assertEquals(result,calculatorService.multiplyCalculator(num1,num2));
    }
    public static Stream<Arguments> divideTestParam(){
        return Stream.of(
                Arguments.of(6,3,"6 / 3 = 2"),
                Arguments.of(-6,3,"-6 / 3 = -2"),
                Arguments.of(1,1,"1 / 1 = 1")

        );
    }
    @ParameterizedTest
    @MethodSource("divideTestParam")
    public void divideTest(int num1,int num2,String result){
        assertEquals(result,calculatorService.divideCalculator(num1,num2));
    }

}
