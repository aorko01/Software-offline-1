import Factory.*;
import Account.Account;
import Loan.Loan;
import Operations.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get customer type input
        System.out.println("Enter customer type (Regular, Premium, VIP): ");
        String customerType = scanner.nextLine();

        // Get operation input
        System.out.println("Enter operation type (Loan, Account): ");
        String operationType = scanner.nextLine();

        // Get principal and years
        System.out.println("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter number of years: ");
        int years = scanner.nextInt();

        // Create appropriate factory based on customer type
        BankFactory factory = null;

        switch (customerType.toLowerCase()) {
            case "regular":
                factory = new RegularFactory();
                break;
            case "premium":
                factory = new PremiumFactory();
                break;
            case "vip":
                factory = new VIPFactory();
                break;
            default:
                System.out.println("Invalid customer type.");
                return;
        }

        // Calculate interest based on operation type
        Operation operation = null;

        if (operationType.equalsIgnoreCase("loan")) {
            operation = factory.createLoan();
        } else if (operationType.equalsIgnoreCase("account")) {
            operation = factory.createAccount();
        } else {
            System.out.println("Invalid operation type.");
            return;
        }

        double interest = operation.calculateInterest(principal, years);
        System.out.printf("The calculated interest is: %.2f\n", interest);
    }
}
