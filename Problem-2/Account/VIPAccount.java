package Account;

public class VIPAccount implements Account {
    private final double interestRate = 0.05;

    @Override
    public double calculateInterest(double principal, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }
}
