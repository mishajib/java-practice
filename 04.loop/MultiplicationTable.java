import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which number multiplication table you want to see?");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table Of " + number);
        System.out.println("====================================");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

        System.out.println("====================================");
        System.out.println("Multiplication table completed!");

        scanner.close();
    }
}
