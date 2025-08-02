public class Main {
    public static void main(String[] args) {
        Student student = new Student("Al-Amin", 25, 50);
        Teacher teacher = new Teacher("Mahmudul Hasan", 40, "Physics");

        System.out.println("Student Information:");
        student.showInfo();

        System.out.println("===============================");

        System.out.println("Teacher Information:");
        teacher.showInfo();
    }
}

// Person class to inheritance to others class
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name + ", I'm " + age + " years old.");
    }
}

// Student class
public class Student extends Person {
    int roll;

    public Student(String name, int age, int roll) {
        super(name, age);
        this.roll = roll;
    }

    public void showInfo() {
        introduce(); // It's called from person class
        System.out.println("My roll is " + roll);
    }
}

// Teacher class
public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void showInfo() {
        introduce(); // Parent method
        System.out.println("My subject is " + subject);
    }
}