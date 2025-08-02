public class MethodOverloading {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();

        System.out.println(mu.add(5, 8)); // 13
        System.out.println(mu.add(5, 5, 5)); // 15
        System.out.println(mu.add(4.5, 5.5)); // 10.0
    }
}

/*
 * Method Overloading is concept to defining multiple methods with the same name
 * in the same class but with different parameters.
 * And Parameters can be different types, number or in a different order.
 */
// Method overloading class
public class MathUtils {
    // Add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three numbers
    public int add (int a, int b, int c) {
        return a + b + c;
    }

    // Add two decimal numbers
    public double add(double a, double b) {
        return a + b;
    }
}