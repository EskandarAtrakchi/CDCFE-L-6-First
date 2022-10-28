import java.time.LocalDateTime;//importing locatal time from the machine 
import java.time.format.DateTimeFormatter;//importing the format
import java.util.Scanner;//importing the Scanner from utility

public class Balance {//start class 
	DateTimeFormatter date = DateTimeFormatter.ofPattern
		("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
	LocalDateTime now = LocalDateTime.now();//special method here 
    private double balance;//private variable 
    private long accountNum;//private variable 
    Scanner sc = new Scanner( System.in );//Scanner holds by sc variable 

    public Balance(long aNo, double money) {//constructor with two variables 
        accountNum = aNo;//assigning value
        balance = money;//assigning value
        System.out.println("New account created with account ID: " + accountNum);
        System.out.println("Opening balance is " + balance + "$");
        
    }//end constructor 

    public Balance(Balance b) {////constructor with two variable to connect it to the other class 
        balance = b.balance;//assigning value
        accountNum = b.accountNum;//assigning value
    }//end constructor 

    public Balance() {}//empty constructor 

    public long getAccountNum() {//get method 
        return accountNum;//returning value (this accountNum been assigned to b.accountNum and to aNo)
    }//end get 

    public double getBalance() {//start get 
        return balance;//retruning value (this value been assigned to money and to b.balance)
    }

    public void setBalance(double balance) {//start set
        this.balance = balance;//setting this balance 
    }

    public String toString() {//start to sting method 
        return "Your ID Number is: " + accountNum + "\nCurrent balance: " + balance + "$"
                + "\nLast date of update was on: " + date.format ( now ) + "\n";//returning 

    }//end toString 

}//end class 