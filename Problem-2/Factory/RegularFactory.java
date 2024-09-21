package Factory;

import Account.Account;
import Account.RegularAccount;
import Loan.Loan;
import Loan.RegularLoan;

public class RegularFactory implements BankFactory {

    @Override
    public Loan createLoan() {
        return new RegularLoan();
    }

    @Override
    public Account createAccount() {
        return new RegularAccount();
    }
}
