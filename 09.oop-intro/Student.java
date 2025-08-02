public class Student {
    String name;
    int roll;
    int[] marks;

    public Student(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Total Marks
    public int getTotalMarks() {
        int sum = 0;
        for (int mark : marks)
            sum += mark;

        return sum;
    }

    // Average Marks
    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    // Display Student Info
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + getTotalMarks());
        System.out.println("Average: " + getAverageMarks());
    }
}