
import java.util.Scanner;

public class DivOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        double div = (double) num1 / num2;
        System.out.println("Division is: " + div);
        input.close();
    }
}
