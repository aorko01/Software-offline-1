package Factory;

import Account.Account;
import Account.PremiumAccount;
import Loan.Loan;
import Loan.PremiumLoan;

public class PremiumFactory implements BankFactory {

    @Override
    public Loan createLoan() {
        return new PremiumLoan();
    }

    @Override
    public Account createAccount() {
        return new PremiumAccount();
    }
}
