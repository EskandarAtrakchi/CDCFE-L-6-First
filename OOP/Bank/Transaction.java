import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Transaction {
	DateTimeFormatter date = DateTimeFormatter.ofPattern
		("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
	LocalDateTime now = LocalDateTime.now();
    private String Type;
    private double amount;
    private long accountNum;
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
        operation();
    }

    private void operation() {

        if (Type.equalsIgnoreCase("Opening")) {
            if (amount < 0) {
                System.out.println("Opening balance cannot be less than zero.");
                return;
            }

            balance = new Balance(b.ReturningMethodForTheArrayList() + 1, amount);
            b.newAccount(balance);
            System.out.println("Account is opened on: " + date.format(now)+"\n");
        }

        else if (Type.equalsIgnoreCase("withdraw")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Your ID not found");
                return;
            }
            if (balance.getBalance() < amount) {
                System.out.println("Insufficient Balance.");
                return;
            }
            balance.setBalance(balance.getBalance() - amount);
            System.out.println(balance.toString() + "$");
        }

        else if (Type.equalsIgnoreCase("deposit")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Account not found");
                return;
            }
            balance.setBalance(balance.getBalance() + amount);
            System.out.println(balance.toString() + "$");
        }

        else if (Type.equalsIgnoreCase("showInfo")) {
            balance = b.searchAccount(accountNum);
            if (balance == null) {
                System.out.println("Your ID not found");
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