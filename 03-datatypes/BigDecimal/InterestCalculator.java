import java.math.BigDecimal;

public class InterestCalculator {
    public static void main(String[] args) {
        BigDecimal balance = new BigDecimal("10000.00");
        BigDecimal interestRate = new BigDecimal("0.055"); // 5.5%

        // সুদ = মূলধন × সুদের হার
        BigDecimal interest = balance.multiply(interestRate);

        // সর্বমোট = মূলধন + সুদ
        BigDecimal total = balance.add(interest);

        System.out.println("Interest: " + interest); // Output: 550.00
        System.out.println("Total after interest: " + total); // Output: 10550.00
    }
}
