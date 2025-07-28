import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Operator (+, -, x, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (operator == '/' && num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*', 'x' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            default -> System.out.println("Invalid operator!");
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
