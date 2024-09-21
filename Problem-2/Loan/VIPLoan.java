package Loan;

public class VIPLoan implements Loan {
    private final double interestRate = 0.10;

    @Override
    public double calculateInterest(double principal, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }
}
