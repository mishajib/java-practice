public class MethodOverloading {
    public static void main(String[] args) {
        Student student1 = new Student("Rakib");
        Student student2 = new Student("Sakib", 10);
        student1.showInfo();
        student2.showInfo();
    }
}

/*
* Constuctor overloading is same as method overloading, only difference
* is one class has multiple constructor with the same name with different params.
*/
// Constructor Overloading class
public class Student {
    String name;
    int roll;

    // First constructor
    public Student(String name) {
        this.name = name;
        this.roll = 0;
    }

    // Second constructor
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void showInfo() {
        if (this.roll > 0) {
            System.out.println("Student name is " + this.name + ". And his roll is " + this.roll);
        } else {
            System.out.println("Student name is " + this.name);
        }
    }
}