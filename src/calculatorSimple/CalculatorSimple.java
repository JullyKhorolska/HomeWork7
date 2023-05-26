package calculatorSimple;

public class CalculatorSimple {
    public static void sum (double a, double b){

        System.out.println("Sum: " + a + " + " + b + " = " + (a + b));
    }
    public static void subtraction (double a, double b){
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));

    }
    public static void division (double a, double b){
        if(b == 0){
            throw new ArithmeticException("We can't divide by zero");
        } else {
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        }
    }
    public static void multiplication (double a, double b){
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    }

}
