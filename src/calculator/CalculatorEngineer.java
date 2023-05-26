package calculator;

import calculatorSimple.CalculatorSimple;

public class CalculatorEngineer extends CalculatorSimple {
    public CalculatorEngineer(){

    }
    public static void cubeRootOfNumber (double number){
        System.out.println("Cube root of " + number + " = " + Math.cbrt(number));
    }
    public static void logarithmBaseTenOfNumber (double number){
        System.out.println("Base 10 logarithm of " + number + " = " + Math.log10(number));
    }
}
