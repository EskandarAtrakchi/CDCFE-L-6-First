package ATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Balance {
	DateTimeFormatter date = DateTimeFormatter.ofPattern
		("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
	LocalDateTime now = LocalDateTime.now();
    private double balance;
    private long accountNum = MyRandom();
    Scanner sc = new Scanner(System.in);
    
    static int MyRandom() {
    	Random X = new Random();
    	int Y = X.nextInt(999)+1;
    	return Y;
    }

    public Balance(long aNo, double money) {
        accountNum = aNo;
        balance = money;
        System.out.println("New account created with account ID: " + accountNum);
        System.out.println("Opening balance is " + balance + "$");
        
    }

    public Balance(Balance b) {
        balance = b.balance;
        accountNum = b.accountNum;
    }

    public Balance() {}

    public long getAccountNum() {
        return accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Your ID Number is: " + accountNum + "\nCurrent balance: " + balance + "$"
                + "\nLast date of update was on: " + date.format(now) + "\n";

    }

}