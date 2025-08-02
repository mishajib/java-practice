
public class RoundingError {

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double result = a + b;

        // Wrong Output
        System.out.println("Result: " + result); // Output: 0.30000000000000004 😳
    }
}
