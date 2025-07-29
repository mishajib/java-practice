import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        String grade;

        if (marks >= 80 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "A-";
        }  else if (marks >= 50) {
            grade = "B";
        }  else if (marks >= 40) {
            grade = "C";
        } else if (marks >= 33) {
            grade = "D";
        }  else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid marks!";
        }

        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
