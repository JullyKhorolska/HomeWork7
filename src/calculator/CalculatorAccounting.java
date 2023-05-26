package calculator;

import calculatorSimple.CalculatorSimple;
public class CalculatorAccounting extends CalculatorSimple {
    public CalculatorAccounting(){

    }
    public static void netSalary (double salary){
        double netSalary = salary - 0.18  * salary - 0.15 * salary;
        System.out.println("Your salary after tax will be: " + netSalary);
    }
    public static void profitabilityCalculation (double profit, double revenue){
        double profitability = profit / revenue * 100;
        System.out.println("Your profitability will be: " + profitability + " %");
    }
}
