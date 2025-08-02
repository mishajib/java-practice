import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer!");
            scanner.close();
            return;
        }

        long factorial = 1;
        String factorialString = "";

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            factorialString = factorialString.isEmpty() ? String.valueOf(i) : factorialString + " * " + i;
        }

        System.out.println("Factorial of " + number + " is: " + factorialString + " = " + factorial);
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
