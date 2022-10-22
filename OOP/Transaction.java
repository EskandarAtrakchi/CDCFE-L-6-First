package ATM;

import java.util.Date;
import java.util.Scanner;

public class Transaction {

    private String Type;
    private double amount;
    private long accountNum;
    private Date date;
    private Bank b;
    private Balance balance = new Balance();

    Scanner sc = new Scanner(System.in);

    public Transaction() {
        b = new Bank();
    }

    public void transaction(long accountNum, String Type, double amount) {
        this.accountNum = accountNum;
        this.Type = Type;
        this.amount = amount;
        date = new Date();
        operation();
    }

    private void operation() {

        if (Type.equalsIgnoreCase("Opening")) {
            if (amount < 0) {
                System.out.println("Opening balance cannot be less than zero.");
                return;
            }

            balance = new Balance(b.getBalanceListSize() + 1, amount, date);
            b.newAccount(balance);
        }

        else if (Type.equalsIgnoreCase("withdraw")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account ID not found");
                return;
            }
            if (balance.getBalance() < amount) {
                System.out.println("Insufficient Balance.");
                return;
            }
            System.out.println("Balance before transaction:");
            System.out.println(balance.toString()+"$");
            balance.setBalance(balance.getBalance() - amount);
            System.out.println("Balance after transaction:\n"
                    + balance.toString()+"$");
        }

        else if (Type.equalsIgnoreCase("deposit")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account not found");
                return;
            }
            System.out.println("Balance before transaction:");
            System.out.println(balance.toString()+"$");
            balance.setBalance(balance.getBalance() + amount);
            System.out.println("Balance after transaction:\n"
                    + balance.toString()+"$");
        }

        else if (Type.equalsIgnoreCase("showInfo")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account ID not found");
                return;
            }
            System.out.println(balance.toString());
        }

        else {
            System.out.println("Invalid option");
            return;
        }
    }
}