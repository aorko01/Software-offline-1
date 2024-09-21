package Factory;

import Account.Account;
import Account.VIPAccount;
import Loan.Loan;
import Loan.VIPLoan;

public class VIPFactory implements BankFactory {

    @Override
    public Loan createLoan() {
        return new VIPLoan();
    }

    @Override
    public Account createAccount() {
        return new VIPAccount();
    }
}
