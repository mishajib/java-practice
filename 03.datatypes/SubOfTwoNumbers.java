
import java.util.Scanner;

public class SubOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if (num2 > num1) {
            System.out.println("Warning: The second number is greater than the first number. The result will be negative.");
            System.out.println("Do you want to continue? (yes/no)");
            String response = input.next();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Exiting the program.");
                return;
            }
        }

        int sub = num1 - num2;

        System.out.println("Subtraction is: " + sub);
    }
}
