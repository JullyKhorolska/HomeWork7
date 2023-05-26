package checkCalculation;

import calculator.CalculatorAccounting;
import calculator.CalculatorEngineer;
import calculator.CalculatorFinancial;
import calculator.CalculatorProgram;

import java.util.Scanner;

public class CheckCalculation {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("""
                Choose calculator:\s
                1 - accounting calculator\s
                2 - engineer calculator
                3 - financial calculator
                4 - programming calculator
                """);
        int value = scan.nextInt();
        switch (value){
            case 1:
                CalculatorAccounting.sum(2,5);
                CalculatorAccounting.netSalary(5460);
                CalculatorAccounting.profitabilityCalculation(200,1000);
                System.out.println("---------------------------------");
                break;
            case 2:
                CalculatorEngineer.multiplication(3.5,7.9);
                CalculatorEngineer.cubeRootOfNumber(3);
                CalculatorEngineer.logarithmBaseTenOfNumber(500);
                System.out.println("---------------------------------");
                break;
            case 3:
                CalculatorFinancial.division(5,7);
                CalculatorFinancial.depositInterest(350000,5.5,246);
                CalculatorFinancial.marginCalculation(100,60.5);
                System.out.println("---------------------------------");
                break;
            case 4:
                CalculatorProgram.subtraction(78,90.7);
                CalculatorProgram.hexToBit(128);
                System.out.println("---------------------------------");
                break;
        }
        scan.close();
    }
}
