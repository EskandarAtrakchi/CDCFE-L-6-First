import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

 public class AbstractFromExistingCustomers {
	  Scanner X = new Scanner (System.in);                                                                                                                                          	//Array object of CurrentAccount class       CurrentAccount currentAcc [] = new CurrentAccount[3];
    //Array object of SavingsAccount class
    
    private int counter;
    private String PIN;
	private String toInt;
	private int tostring;
	private double Balance;

	private int index;
	private int CustomerWithdaw;
	private int CustomerDeposite;
	private int ChangePIN;
    
    public  static  void main(String [ ] args) {
    	AbstractFromExistingCustomers abstractFromExistingCustomers = new AbstractFromExistingCustomers("");
    	abstractFromExistingCustomers.PrintCustomers();
    	
		abstractFromExistingCustomers.LogInMethod("");
		
    }

	/*
	 

    	System.out.println("Please enter the ID number");
       int key = X.nextInt();

       int i = 0;
       boolean found = false;
       
      for ( i = 0; i < DB.Arrays.length; i ++ )
      {
             if (  DB.Arrays [ i ] == key) {
            	 
                     found = true;  
                     
                     break;
             }
       }

      if (found)   //When found is true, index of location of key is printed.
      {
    	  System.out.println("This is the information for the requested ID at " + key);
    	  System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Name\t\tBalance\t\tID\t\tPIN\t\tIndexPosition\tSavings");
            System.out.println(names [ i ] + "\t\t" + Balance [ i ] + "$" + "\t\t" + IDs [ i ] + "\t\t" + Pin [ i ] + "\t\t   " + i + "\t\t " + Savings [ i ]);
            System.out.println("---------------------------------------------------------------------------------------");
      }
      else
      {
            System.out.println(key + "is not in this array.");
      }
    }
    */
	
	
	
	public String getPIN() {
		return PIN;
	}

	public AbstractFromExistingCustomers(String PIN) {
		super();
		this.PIN = PIN;
	}

	public void setPIN(String PIN) {
		this.PIN = PIN;
	}
	
	public double getBalance() {
		return Balance;
	}

	public void setBalance(double d) {
		this.Balance = d;
	}
	
	public int getCustomerWithdaw() {
		return CustomerWithdaw;
	}

	public void setCustomerWithdaw(int customerWithdaw) {
		CustomerWithdaw = customerWithdaw;
	}

	public int getCustomerDeposite() {
		return CustomerDeposite;
	}

	public void setCustomerDeposite(int customerDeposite) {
		CustomerDeposite = customerDeposite;
	}

	public int getChangePIN() {
		return ChangePIN;
	}

	public void setChangePIN(int changePIN) {
		ChangePIN = changePIN;
	}
	public AbstractFromExistingCustomers(int counter, String pIN, String toInt, int tostring, int balance, int index,
			int customerWithdaw, int customerDeposite, int changePIN) {
		super();
		counter = 3;
		PIN = pIN;
		this.toInt = toInt;
		this.tostring = tostring;
		Balance = balance;
		this.index = index;
		CustomerWithdaw = customerWithdaw;
		CustomerDeposite = customerDeposite;
		ChangePIN = changePIN;
	}


	public   void PrintCustomers() {
		System.out.println("\t\t Don't fuck with Eskandar's bank\t\t"
				+ "\n----------------------------------------------------------------------------------");
		System.out.println("Names\t\tBalances\tIDs\t\tPINs\t\tSaving Accounts");
		System.out.println("----------------------------------------------------------------------------------");
		for(int i = 0; i < 6; i++) {
			System.out.println(DB.Arrays [ i ] );
			
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
	
	public void LogInMethod (String PIN) {
		System.out.println("Please enter your PIN");
		toInt = X.next();
		inputValidation();
		tostring = Integer.parseInt(toInt);
		for ( int i = 0; i < DB.Arrays.length; i ++ ) {
			if (PIN.matches(getPIN())) {
				index = i;
				SelectionMenu();
			}
		}
		for (int i = 0; i < DB.Arrays.length; i ++) {
			if(!(PIN.matches(getPIN()))) {
				System.out.println("Invalid PIN");
				AttemptMethod();
				LogInMethod(PIN);
			}
		}
	}
	
	private void SelectionMenu() {
		
		while(true) {
			System.out.println("Select one of the following:\n1.Bank Statement\n2.Withdraw\n3.Deposite\n4.Back to the main menu\n5.Exit\n6.Change your PIN?\n7.Save money with interest");
			toInt = X.next();
			switch(toInt) {
			case "1" : StatementMethod();
			case "2" : WithdrawMethod();
			case "3" : DepositeMethod();
			case "4" : BankOptions.TheMainMethodIsHere();
			case "5" : System.out.println("Thank you, Bye!"); System.exit(0);
			//case "6" : changePin();
			case "7" : InterestRateMethod();
			default:
                System.out.println("Wrong choice!!"); 
                break;
			}
		}
	}

	private void DepositeMethod() {
			System.out.println("How much you want to deposit");
			toInt = X.next();
			inputValidation();
			CustomerDeposite = Integer.parseInt(toInt);
			//update user account balance after depositing
			setBalance(getBalance() + CustomerDeposite) ;
			//print the updating balance for the customer so they know 
			System.out.println("Your new balance is now: " + getBalance() + "$");
			SelectionMenu();
		}//end method
	
	
	  void InterestRateMethod () {
		System.out.println("Number 1 to deposit with interest\nNumber 2 to return to the main menu");
		toInt = X.next();
		inputValidation();
		switch(toInt) {
		
		case "1" : 
			System.out.println("How much you want to deposit?");
			toInt = X.next();
			inputValidation();
			CustomerDeposite = Integer.parseInt(toInt);
			//update user account balance after depositing
			setBalance(getBalance() + CustomerDeposite + ((0.5/10) * CustomerDeposite));
			
			//print the updating balance for the customer so they know 
			System.out.println("Your annual interest is 0.05%, your savings: " + getBalance () + "$");
			SelectionMenu();
			break;
			
		case "2" : BankOptions.TheMainMethodIsHere(); 
		break;
		
		default:
            System.out.println("Wrong choice!!"); inputValidation();
            break;
		}
	}
	
	private   void StatementMethod() {
		System.out.println("Your bank statement is:");
		
		System.out.println("\t\tName\t\tPin\t\tBalance\t\tID\t\tSavings"
				+ "\n\t\t--------------------------------------------------------------------------");
		System.out.println(DB.Arrays[index]);
		SelectionMenu();
	}

	private   void WithdrawMethod() {
		int Q = 0;
		
		System.out.println("How much do you want to withdraw?");
		toInt = X.next();
		inputValidation();
		CustomerWithdaw = Integer.parseInt(toInt);
		if(Q <= getBalance() ) {
			setBalance(getBalance() - CustomerWithdaw - ((0.5/100) * CustomerWithdaw));
			
			System.out.println("Your new Balance is: " + getBalance() + "$");
			System.out.println("Fees been taken " + (0.5/100) * CustomerWithdaw + "$\n");
			SelectionMenu();
		}
		else {
			System.out.println("Not enough funds");
			SelectionMenu();
		}
	}

	public   void AttemptMethod() {
		counter--;
		System.out.println("\nYou have " + counter + " attempts left\n");
		if(counter == 0) {
			System.out.println("Attention your card is blocked");
			System.exit(0);
		}
		else {
			LogInMethod(PIN);
		}
	}
	
	public   void inputValidation() {
		while (!toInt.matches("\\d+")) {
			System.out.println("Not Allowed, numbers only!");
			toInt = X.next();
		}
	}
	
	/*public   void changePin() {//start changePin method 
		System.out.println("Please enter your new "
				+ "PIN");//	Asking the customer to enter their new PIN 
		toInt = X.next();//take in user input as a string
		inputValidation();//check if the user input is valid
		ChangePIN = Integer.parseInt(toInt);//parse String into integer
		//reset the PIN to zero and taking user input PIN instead and store it in the array 
		if(ChangePIN.matches(getPIN())) {
			
			System.out.println("Not Allowed, try again");
			changePin();
			
		}
		
		else {
			Pin[index]= Pin[index] + ChangePIN - Pin[index];//update pin index
			 DateTimeFormatter dtf = DateTimeFormatter.ofPattern
					 ("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the machine
	    	   LocalDateTime now = LocalDateTime.now();//get the time and the date from the machine  
		 System.out.println("Your new PIN is now: "+ Pin [ index ] + " This PIN been changed on " + dtf.format(now));
		 SelectionMenu();//get the customer to selection Menu in-case for any other process
		}
		
	}//end method changePin
	*/
	
}
