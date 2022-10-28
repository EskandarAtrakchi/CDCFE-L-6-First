import java.time.LocalDateTime;//import the local time from the machine 
import java.time.format.DateTimeFormatter;//import the format 
import java.util.Scanner;//import the Scanner from java utility

public class Transaction {//start class 
	DateTimeFormatter date = DateTimeFormatter.ofPattern
		("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
	LocalDateTime now = LocalDateTime.now();
    //declaring private variables 
    private String Type;
    private double amount;
    private long accountNum;
    //end of declaring variables 
    private Bank b;//declaring variable b to assign it to a new Bank with default constructor later 
    
    private Balance balance = new Balance();//connecting the two classes together, holded by variable, there is default constructor here 

    Scanner sc = new Scanner(System.in);//Scanner input streamed as System.in held by sc 

    public Transaction() {//start constructor 
        b = new Bank();//assigning b to new Bank()
    }

    public void transaction(long accountNum, String Type, double amount) {//start method with parameters 
    //this. is to let the system know that the parameter intended here and not the variables been declared above 
        this.accountNum = accountNum;
        this.Type = Type;
        this.amount = amount;
        operation();//calling the method 
    }//end the method 

    private void operation() {//start metod 

        if (Type.equalsIgnoreCase("Opening")) {//start if 
            if (amount < 0) {//start if when customer enters balance less than zero 
                System.out.println("Opening balance cannot be less than zero.");
                return;
            }//end if 

            balance = new Balance(b.ReturningMethodForTheArrayList() + 1, amount);//
            b.newAccount(balance);
            System.out.println("Account is opened on: " + date.format(now)+"\n");
        }//end if 

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