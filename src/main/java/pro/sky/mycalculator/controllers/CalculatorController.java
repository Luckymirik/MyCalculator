package pro.sky.mycalculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.mycalculator.services.CalculatorService;

@RestController
    @RequestMapping("/calculator")
    public class CalculatorController {
        private final CalculatorService calculatorService ;
        public CalculatorController(CalculatorService calculatorService){
            this.calculatorService=calculatorService;
        }
        @GetMapping
        public String calculator(){
            return calculatorService.calculator();
        }

        @GetMapping(path = "/plus")
        public String plusCalculator(@RequestParam int num1, int num2){
            return calculatorService.plusCalculator(num1,num2);
        }
        @GetMapping(path = "/minus")
        public String minusCalculator(@RequestParam int num1, int num2){
            return calculatorService.minusCalculator(num1,num2);
        }
        @GetMapping(path = "/multiply")
        public String multiplyCalculator(@RequestParam int num1, int num2){
            return calculatorService.multiplyCalculator(num1,num2);
        }@GetMapping(path = "/divide")
        public String divideCalculator(@RequestParam int num1, int num2){
            return calculatorService.divideCalculator(num1,num2);
        }
    }

