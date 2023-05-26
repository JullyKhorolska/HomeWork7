package calculator;

import calculatorSimple.CalculatorSimple;

public class CalculatorFinancial extends CalculatorSimple {
    public CalculatorFinancial(){

    }
    public static void depositInterest (double firstSum, double annualRate, int dayOfDeposit){
        double interestPaid = (firstSum * annualRate * dayOfDeposit / 365) / 100;
        System.out.println("Your interest income on the deposit will be: " + interestPaid);
    }
    public static void marginCalculation (double sellingPrice, double costPrice){
        double margin = (sellingPrice - costPrice) / sellingPrice * 100;
        System.out.println("Your margin will be: " + margin + " %");
    }

}
