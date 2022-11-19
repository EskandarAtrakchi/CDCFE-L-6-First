package ATM;//Declaring a packing location 

	import java.time.LocalDateTime;//importing local date and time from java library 
	import java.time.format.DateTimeFormatter;//importing format of date and time from java library 
	import java.util.Scanner;// importing Scanner from java library 

	 public class AbstractFromExistingCustomers {//start class 
		  Scanner X = new Scanner (System.in);//X is the user input streamed as System.in     
	    
		    private int AccountID;//declare int variable 
		    private String AccountName;//declare String variable
		    private int AccountPin;//declare int variable 
		    private int AccountBalance;//declare int variable 
		    public String toInt;//declare String variable
		    public static int Attempts = 3;//declare int variable 
		    protected int ProtectedVarForPIN;//declare int variable 

		  //declare object array for 6 Accounts constructed in DB class objected as AccountsOfExistingCustomers
		    static DB [ ] AccountsOfExistingCustomers = new DB [ 6 ];

		    public AbstractFromExistingCustomers
		    ( int AccountID, String AccountName, int AccountPin, int AccountBalance ) {//start constructor with parameters 
		        this.AccountID = AccountID;//initiating the value of variable to the value of the parameter 
		        this.AccountName = AccountName;//initiating the value of variable to the value of the parameter 
		        this.AccountPin = AccountPin;//initiating the value of variable to the value of the parameter 
		        this.AccountBalance = AccountBalance;//initiating the value of variable to the value of the parameter 
		    }//end constructor 

		    public AbstractFromExistingCustomers() {}//empty constructor 

		    public int getAccountID() {//start get method 
		        return AccountID;//return the variable 
		    }//end get method 

		    public void setAccountID(int AccountID) {//start set method 
		        this.AccountID = AccountID;//setting value of the variable to the parameter 
		    }//end set method 

		    public String getAccountName() {//start get method 
		        return AccountName;//return the variable 
		    }//end get method 

		    public void setAccountName(String AccountName) {//start set method 
		        this.AccountName = AccountName;//setting value of the variable to the parameter 
		    }//end set method 

		    public int getAccountPin() {//start get method 
		        return AccountPin;//return the variable 
		    }//end get method 

		    public void setAccountPin(int AccountPin) {//start set method 
		        this.AccountPin = AccountPin;//setting value of the variable to the parameter 
		    }//end set method 

		    public int getAccountBalance() {//start get method 
		        return AccountBalance;//return the variable 
		    }//end get method 

		    public void setAccountBalance(int AccountBalance) {//start set method 
		    	this.AccountBalance = AccountBalance;//setting value of the variable to the parameter 
		    }//end set method 

		    @Override
		    public String toString() {//start toString method to return String value/s 
		        return "ID: "+ AccountID + "  \nName: " + AccountName + " \nPIN: " 
				+ AccountPin + " \nBalance: " + AccountBalance+"$\n\n";
		    }//end toString method 
		
		public void LogInMethod () {//start method 
			
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
					AccountsOfExistingCustomers[ i ].AttemptMethod();
					AccountsOfExistingCustomers[ i ].LogInMethod();
				}
			}
		}

		public void SelectionMenu () {//start method 
	        
	    	while(true) {
				System.out.println("Select one of the following:\n"
						+ "1.Bank Statement\n"
						+ "2.Withdraw\n"
						+ "3.Deposite\n"
						+ "4.Back to the main menu\n"
						+ "5.Exit\n"
						+ "6.Change your PIN?\n"
						+ "7.Save money with interest\n"
						+ "8.Search for IDs\n"
						+ "9.Click here if you are the owner");
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
		
		private void DepositeMethod() {//start method 

				System.out.println("How much you want to deposit");
				toInt = X.next();
				inputValidation();
				int CustomerDeposite = Integer.parseInt(toInt);
				AccountBalance = AccountBalance + CustomerDeposite;
				System.out.println("Your new balance is now: " + getAccountBalance() + "$");
				SelectionMenu();
			}//end method
		
		  void InterestRateMethod () {//start method 

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
					System.out.println("Your annual interest is 0.05%, your savings: " 
							+ getAccountBalance () + "$");
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

		private void WithdrawMethod() {//start method 

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

		public void AttemptMethod() {//start method 
			
			Attempts--;
			System.out.println("\nYou have " 
			+ Attempts + 
			" attempts left\n");

				if ( Attempts == 0 ) {
					System.out.println("Attention your card is blocked");
					System.exit( 0 );
			}
		}
		
		public void inputValidation() {//start method 

			while ( ! toInt.matches("\\d+") ) {
				System.out.println("Not Allowed, numbers only!");
				toInt = X.next();
			}
		}
		
		
	    public void ChangePin() {//start method 
	    	
	        System.out.println("Enter your Pin: ");
	        toInt = X.next();
	        inputValidation();
	        int ProtectedVarForPIN = Integer.parseInt(toInt);
	        int i;
	        for ( i =0; i < AccountsOfExistingCustomers.length; i ++ ) {
	        	
	        	 if ( ProtectedVarForPIN == AccountsOfExistingCustomers [ i ].getAccountPin() ) {
		                System.out.println("The PIN is exist in the Database, please try again");
		                AccountsOfExistingCustomers [ i ].ChangePin();
		                break;
		            }
	        }

	        for ( i = 0; i < AccountsOfExistingCustomers.length; i ++ ) {
	        	
	        	if ( ProtectedVarForPIN != AccountsOfExistingCustomers [ i ].getAccountPin() ) {
	                AccountPin = AccountPin + ProtectedVarForPIN - AccountPin;
	                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	                LocalDateTime now = LocalDateTime.now();
	                System.out.println("Your new PIN is: " + getAccountPin() + 
	                		" This PIN been changed on " + dtf.format( now ) + "\n");
	                SelectionMenu();
	                break;
	            }
	        }
	    }
		
	    public void SearchCustomers() {//start method 
	    	
    	System.out.println("Please enter the ID number");
    	toInt = X.next();
		inputValidation();
        int key = Integer.parseInt(toInt);
        int i;
        boolean found = false;
       
        for ( i = 0; i < AccountsOfExistingCustomers.length; i ++ )
        {
             if ( AccountsOfExistingCustomers [ i ].getAccountID() == key ) {
            	 
                     found = true;  
                     break;
             }
       }

        if ( found == true )   //When found is true, ProtectedVarForPIN of location of key is printed.
        {
        	System.out.println("This is the information for the requested ID at " + key);
    	  	
            System.out.println( AccountsOfExistingCustomers [ i ].toString() );
        }
        else
        {
            System.out.println(key + " is not registered in the Bank");
        }
    }
}
