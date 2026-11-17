
import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankAccount {

    private String name;
    private int accountNumber;
    private double accountBalance;

    public BankAccount(String name, int accountNumber, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void deposite(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
        accountBalance += amount;
        System.out.println("Deposite Amount");
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount");
        }
        if (amount > accountBalance) {
            throw new InsufficientBalanceException("Insufficient Banalnce");
        }
        accountBalance -= amount;
        System.out.println("Witdrawal succefull");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + accountBalance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Holder: " + name);
    }
}

public class ATMBankingSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int accountNumber = scan.nextInt();
        double accountBalance = scan.nextDouble();

        int depositeChoice = scan.nextInt();
        double depositeAmount = scan.nextDouble();

        int withdrawChoice = scan.nextInt();
        double withdrawAmount = scan.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, accountBalance);

        try {
            account.displayAccountInfo();

            if (depositeChoice == 1) {
                account.deposite(depositeAmount);
            } else {
                throw new InvalidAmountException("Invalid amount");
            }

            if (withdrawChoice == 1) {
                account.withdraw(withdrawAmount);
            } else if (withdrawChoice == 2) {
                account.withdraw(withdrawAmount);
            } else {
                throw new InvalidAmountException("Invalid amount");
            }

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            account.checkBalance();
            System.out.println("Transaction Completed");
            scan.close();
        }
    }
}
