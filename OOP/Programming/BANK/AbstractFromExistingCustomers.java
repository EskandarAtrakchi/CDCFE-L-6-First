package ATM;

	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;

	 public class AbstractFromExistingCustomers {
		  Scanner X = new Scanner (System.in);    
	    
		    private int AccountID;
		    private String AccountName;
		    private int AccountPin;
		    private int AccountBalance;
		    public String toInt;
		    public static int Attempts = 3;
		    protected int index;
		    Scanner input = new Scanner(System.in);

		    static DB [ ] AccountsOfExistingCustomers = new DB [ 6 ];

		    public AbstractFromExistingCustomers
		    (int AccountID, String AccountName, int AccountPin, int AccountBalance) {
		        this.AccountID = AccountID;
		        this.AccountName = AccountName;
		        this.AccountPin = AccountPin;
		        this.AccountBalance = AccountBalance;
		    }

		    public AbstractFromExistingCustomers() {}

		    public int getAccountID() {
		        return AccountID;
		    }

		    public void setAccountID(int AccountID) {
		        this.AccountID = AccountID;
		    }

		    public String getAccountName() {
		        return AccountName;
		    }

		    public void setAccountName(String AccountName) {
		        this.AccountName = AccountName;
		    }

		    public int getAccountPin() {
		        return AccountPin;
		    }

		    public void setAccountPin(int AccountPin) {
		        this.AccountPin = AccountPin;
		    }

		    public int getAccountBalance() {
		        return AccountBalance;
		    }

		    public void setAccountBalance(int AccountBalance) {
		    	this.AccountBalance = AccountBalance;
		    }

		    @Override
		    public String toString() {
		        return "ID: "+ AccountID + "  \nName: " + AccountName + " \nPIN: " + AccountPin + " \nBalance: " + AccountBalance+"$\n\n";
		    }
		
		public void LogInMethod () {
			
			AccountsOfExistingCustomers [ 0 ] = new DB(101,"Eska",1111, 111);
			AccountsOfExistingCustomers [ 1 ] = new DB(102,"Alex",2222, 222);
			AccountsOfExistingCustomers [ 2 ] = new DB(103,"Annm",3333, 333);
			AccountsOfExistingCustomers [ 3 ] = new DB(104,"Apul",4444, 444);
			AccountsOfExistingCustomers [ 4 ] = new DB(105,"Faby",5555, 555);
			AccountsOfExistingCustomers [ 5 ] = new DB(106,"Jeny",6666, 666);
	        
			System.out.println("Please enter your PIN");
			toInt = X.next();
			inputValidation();
			int tostring = Integer.parseInt(toInt);
			for ( int i = 0; i < AccountsOfExistingCustomers.length; i ++ ) {
				if (tostring == AccountsOfExistingCustomers[ i ].getAccountPin()) {
					//StartExistedCustomers CorrectPin = new StartExistedCustomers();
					AccountsOfExistingCustomers[ i ].SelectionMenu();
				}
			}

			for (int i = 0; i < AccountsOfExistingCustomers.length; i ++) {
				if(tostring != AccountsOfExistingCustomers[ i ].getAccountPin()) {
					System.out.println("Invalid PIN");
					AttemptMethod();
					LogInMethod();
				}
			}
		}

		public void SelectionMenu () {
	        
	    	while(true) {
				System.out.println("Select one of the following:\n1.Bank Statement\n2.Withdraw\n3.Deposite\n4.Back to the main menu\n5.Exit\n6.Change your PIN?\n7.Save money with interest\n8.Search for IDs");
				System.out.println("9.Click here if you are the owner");
				toInt = X.next();
				inputValidation();
	            int LOOP = Integer.parseInt(toInt);
	            
				switch(LOOP) {
				case 1 : 
				System.out.println(toString()); 
				break;

				case 2 : 
				WithdrawMethod();
				break;

				case 3 : 
				DepositeMethod();
				break;

				case 4 : 
				BankOptions.TheMainMethodOfBankOption();
				break;

				case 5 : 
				System.out.println("Thank you, Bye!"); 
				System.exit(0);
				break;

				case 6 : 
				ChangePin(); 
				break;

				case 7 : 
				InterestRateMethod();
				break;

				case 8 : 
				SearchCustomers();
				break;

				case 9 : 
				BankOptions.TheMainMenu ();
				break;

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
				int CustomerDeposite = Integer.parseInt(toInt);
				AccountBalance = AccountBalance + CustomerDeposite;
				System.out.println("Your new balance is now: " + getAccountBalance() + "$");
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
					int CustomerDepositeWithInterest = Integer.parseInt(toInt);
					//update Account account balance after depositing
					AccountBalance = (int) (AccountBalance + CustomerDepositeWithInterest 
							+ ((0.5/10) * CustomerDepositeWithInterest));
					
					//print the updating balance for the customer so they know 
					System.out.println("Your annual interest is 0.05%, your savings: " + getAccountBalance () + "$");
					SelectionMenu();
					break;
				
				case "2" : 
					BankOptions.TheMainMethodOfBankOption(); 
					break;
				
				default:
					System.out.println("Wrong choice!!"); 
					inputValidation();
					break;
			}
		}

		private void WithdrawMethod() {

			int Q = 0;
			
			System.out.println("How much do you want to withdraw?");
			toInt = X.next();
			inputValidation();
			int CustomerWithdawWithFees = Integer.parseInt(toInt);

			if(Q <= AccountBalance ) {
				AccountBalance = (int) (AccountBalance - CustomerWithdawWithFees - ((0.5/100) * CustomerWithdawWithFees));
				System.out.println("Your new Balance is: " + getAccountBalance() + "$");
				System.out.println("Fees been taken " + (0.5/100) * CustomerWithdawWithFees + "$\n");
				SelectionMenu();
			}
			else {
				System.out.println("Not enough funds");
				SelectionMenu();
			}
		}

		public void AttemptMethod() {
			
			Attempts--;
			System.out.println("\nYou have " + Attempts + " attempts left\n");
			if(Attempts == 0) {
				System.out.println("Attention your card is blocked");
				System.exit(0);
			}
		}
		
		public void inputValidation() {

			while (!toInt.matches("\\d+")) {
				System.out.println("Not Allowed, numbers only!");
				toInt = X.next();
			}
		}
		
		
	    public void ChangePin() {
	    	
	        System.out.println("Enter your Pin: ");
	        toInt = X.next();
	        inputValidation();
	        int index = Integer.parseInt(toInt);
	        int i;
	        for ( i =0; i < AccountsOfExistingCustomers.length; i ++ ) {
	        	
	        	 if (index == AccountsOfExistingCustomers[ i ].getAccountPin() ) {
		                System.out.println("The PIN is exist in the Database, please try again");
		                AccountsOfExistingCustomers [ i ].ChangePin();
		                break;
		            }
	        }

	        for ( i =0; i < AccountsOfExistingCustomers.length; i ++ ) {
	        	
	        	if (index != AccountsOfExistingCustomers[ i ].getAccountPin()) {
	                AccountPin = AccountPin + index - AccountPin;
	                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	                LocalDateTime now = LocalDateTime.now();
	                System.out.println("Your new PIN is: " + getAccountPin() +" This PIN been changed on " + dtf.format(now)+"\n");
	                SelectionMenu();
	                break;
	            }
	        }
	    }
		
	    public void SearchCustomers() {
	    	
    	System.out.println("Please enter the ID number");
    	toInt = X.next();
		inputValidation();
        int key = Integer.parseInt(toInt);
        int i;
        boolean found = false;
       
        for ( i = 0; i < AccountsOfExistingCustomers.length; i ++ )
        {
             if (AccountsOfExistingCustomers[ i ].getAccountID() == key) {
            	 
                     found = true;  
                     break;
             }
       }

        if (found == true)   //When found is true, index of location of key is printed.
        {
        	System.out.println("This is the information for the requested ID at " + key);
    	  	
            System.out.println(AccountsOfExistingCustomers[ i ].toString());
        }
        else
        {
            System.out.println(key + " is not registered in the Bank");
        }
    }
}
