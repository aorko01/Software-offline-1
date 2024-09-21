package Loan;

public class PremiumLoan implements Loan {
    private final double interestRate = 0.12;

    @Override
    public double calculateInterest(double principal, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }
}
