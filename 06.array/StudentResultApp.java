import java.util.Scanner;

public class StudentResultApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students will you give their numbers?");
        int totalStudents = scanner.nextInt();
        scanner.nextLine(); // buffer clear

        String[] names = new String[totalStudents];
        int[] marks = new int[totalStudents];
        int totalMarks = 0;

        // Input students name and marks
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Name of student " + (i + 1) + ":");
            names[i] = scanner.nextLine();

            System.out.print(names[i] + " marks: ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); // buffer clear

            totalMarks += marks[i];
        }

        // Result
        System.out.println("📋 Students name and marks");
        System.out.println("=================================");
        for (int i = 0; i < totalStudents; i++) {
            int mark = marks[i];
            String name = names[i];
            System.out.println(name + " obtained " + mark + " marks");
            System.out.println(name + " grade is " + calculateGrade(mark));
            System.out.println();
        }

        // Average marks
        double average = (double) totalMarks / totalStudents;
        System.out.println("Average marks: " + average);

        // Grade calculation
        String grade = calculateGrade(average);

        System.out.println("Average grade: " + grade);
    }

    public static String calculateGrade(double marks) {
        String grade;
        if (marks >= 80) grade = "A+";
        else if (marks >= 70) grade = "A";
        else if (marks >= 60) grade = "A-";
        else if (marks >= 50) grade = "B";
        else if (marks >= 40) grade = "C";
        else if (marks >= 30) grade = "D";
        else grade = "F";

        return grade;
    }
}
