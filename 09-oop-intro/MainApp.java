import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = input.nextLine();

        System.out.println("Enter roll: ");
        int roll = input.nextInt();

        int[] marks = new int[3];
        System.out.println("Enter three subjects marks: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // Make Student class object
        Student student = new Student(name, roll, marks);

        // Display information
        System.out.println("Student Information: ");
        student.showInfo();
    }
}