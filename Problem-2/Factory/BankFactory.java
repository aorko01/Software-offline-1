package Factory;

import Account.Account;
import Loan.Loan;

public interface BankFactory {
    Loan createLoan();
    Account createAccount();
}
