import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer!");
            scanner.close();
            return;
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);

        scanner.close();
    }
}
