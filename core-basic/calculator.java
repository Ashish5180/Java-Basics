import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 =sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        double result;
        
        if(operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            result = num1 - num2;
        } else if(operator == '*') {
            result = num1 * num2;
        } else if(operator == '/') {
            if(num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }
        System.out.println("Result: " + result);
    }
}
