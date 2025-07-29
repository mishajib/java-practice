import java.util.Scanner;

public class AdultMinorDetermine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println(name + " is a minor.");
        } else {
            System.out.println(name + " is an adult.");
        }

        scanner.close();
    }
}
