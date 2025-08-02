import java.util.Scanner;

public class MethodCalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enbter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choice operation: (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("অবৈধ অপারেশন!");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Divided by zero is not possible!");
            return 0;
        }
        return a / b;
    }
}
