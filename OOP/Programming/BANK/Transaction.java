package ATM;//Declaring a packing location 

import java.time.LocalDateTime;//import the local time from the machine 
import java.time.format.DateTimeFormatter;//import the format 
import java.util.Scanner;//import the Scanner from java utility

public class Transaction {//start class 
	DateTimeFormatter date = DateTimeFormatter.ofPattern
			("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
		LocalDateTime now = LocalDateTime.now();//special method here for local time and date
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
    //this. is to let the system know that the variables intended here and not the parameter been declared above 
        this.accountNum = accountNum;
        this.Type = Type;
        this.amount = amount;
        operation();//calling the method 
    }//end the method 

    private void operation() {//start method 

        if (Type.equalsIgnoreCase("Opening")) {//start if 
            if (amount < 0) {//start if when customer enters balance less than zero 
                System.out.println("Opening balance cannot be less than zero.");
                return;//returning nothing 
            }//end if 

            //adding new account to the size of the array in the Bank class 
            balance = new Balance(b.ReturningMethodForTheArrayList() + 1, amount);
            b.newAccount(balance);//initiating new value in the constructor in Balance class 
            System.out.println("Account is opened on: " + date.format(now)+"\n");//output the date 
        }//end if 

        else if (Type.equalsIgnoreCase("withdraw")) {//start else if 
            balance = b.searchAccount(accountNum);//searching for amount to withdraw 
            if (balance == null) {//start if 
                System.out.println("Your ID not found");
                return;//returning nothing 
            }//end if 
            if (balance.getBalance() < amount) {//start if 
                System.out.println("Insufficient Balance.");
                return;//returning nothing 
            }//end if 
            balance.setBalance(balance.getBalance() - amount);//updating the balance 
            System.out.println(balance.toString() + "$");//output the balance
        }//end else if 

        else if (Type.equalsIgnoreCase("deposit")) {//start else if 
            balance = b.searchAccount(accountNum);//searching for amount to deposit 
            if (balance == null) {//start if 
                System.out.println("Account not found");
                return;//returning nothing 
            }//end if 
            balance.setBalance(balance.getBalance() + amount);//updating the balance 
            System.out.println(balance.toString() + "$");//output the balance 
        }//end else if 

        else if (Type.equalsIgnoreCase("showInfo")) {//start else if 
            balance = b.searchAccount(accountNum);////searching for amount to output 
            if (balance == null) {//start if 
                System.out.println("Your ID not found");
                return;//returning nothing 
            }//end if 
            System.out.println(balance.toString());
        }//end else if 

        else {//start else 
            System.out.println("Invalid option");
            return;//returning nothing 
        }//end else 
    }//end method 
}//end class 