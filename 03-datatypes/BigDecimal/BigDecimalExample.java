
import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        BigDecimal result = a.add(b);

        System.out.println("Result: " + result);
    }
}
