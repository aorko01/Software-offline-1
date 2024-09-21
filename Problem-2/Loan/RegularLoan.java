package Loan;

public class RegularLoan implements Loan {
    private final double interestRate = 0.14;

    @Override
    public double calculateInterest(double principal, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }
}
