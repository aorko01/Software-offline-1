package Account;

public class PremiumAccount implements Account {
    private final double interestRate = 0.035;

    @Override
    public double calculateInterest(double principal, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }
}
