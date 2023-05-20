package checkCalculation;

import calculator.CalculatorAccounting;
import calculator.CalculatorEngineer;
import calculator.CalculatorFinancial;
import calculator.CalculatorProgram;

import java.util.Scanner;

public class CheckCalculation {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        CalculatorAccounting accounting = new CalculatorAccounting();
        CalculatorEngineer engineer = new CalculatorEngineer();
        CalculatorFinancial financial = new CalculatorFinancial();
        CalculatorProgram program = new CalculatorProgram();

        System.out.println("Choose calculator: " + "\n1 - accounting calculator " + "\n2 - engineer calculator" +
                "\n3 - financial calculator" +
                "\n4 - programming calculator\n");
        int value = scan.nextInt();
        switch (value){
            case 1:
                accounting.sum(2,5);
                accounting.netSalary(5460);
                accounting.profitabilityCalculation(200,1000);
                System.out.println("---------------------------------");
                break;
            case 2:
                engineer.multiplication(3.5,7.9);
                engineer.cubeRootOfNumber(3);
                engineer.logarithmBaseTenOfNumber(500);
                System.out.println("---------------------------------");
                break;
            case 3:
                financial.division(5,7);
                financial.depositInterest(350000,5.5,246);
                financial.marginCalculation(100,60.5);
                System.out.println("---------------------------------");
                break;
            case 4:
                program.subtraction(78,90.7);
                program.hexToBit(1028);
                System.out.println("---------------------------------");
                break;
        }
        scan.close();
    }
}
