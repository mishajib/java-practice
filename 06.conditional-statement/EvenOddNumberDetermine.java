import java.util.Scanner;

public class EvenOddNumberDetermine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("You entered 'EVEN' number. Number is " + number);
        }  else {
            System.out.println("You entered 'ODD' number. Number is " + number);
        }

        scanner.close();
    }
}
