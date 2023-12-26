package pro.sky.mycalculator.services;

import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {

    public String calculator(){
        return "Добро пожаловать в калькулятор ";
    }

    @Override
    public String plusCalculator(int num1, int num2){
        int num = num1+num2;

        return num1+" + "+num2+" = "+num;
    }
    @Override
    public String minusCalculator(int num1, int num2){
        int num = num1-num2;

        return num1+" - "+num2+" = "+num;
    }
    @Override
    public String multiplyCalculator(int num1, int num2){
        int num = num1*num2;

        return num1+" * "+num2+" = "+num;
    }
    @Override
    public String divideCalculator(int num1, int num2){
        if(num2==0){
            throw new IllegalArgumentException("На ноль делить нельзя");
        }else {
            int num = num1 / num2;

            return num1 + " / " + num2 + " = " + num;
        }
    }
}

