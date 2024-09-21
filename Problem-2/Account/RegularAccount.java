package Account;

public class RegularAccount implements Account {
    private final double interestRate = 0.025;

    @Override
    public double calculateInterest(double principal, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }
}
