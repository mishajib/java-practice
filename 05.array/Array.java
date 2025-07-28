public class Array {
    public static void main(String[] args) {
        int[] numbers = {85, 75, 72, 67, 32, 43};

        // Length of the array
        System.out.println("Length of array is: " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number[" + i + "] => " + numbers[i]);
        }
    }
}