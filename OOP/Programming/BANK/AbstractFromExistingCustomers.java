package ATM;//Declaring a packing location 

	import java.time.LocalDateTime;//importing local date and time from java library 
	import java.time.format.DateTimeFormatter;//importing format of date and time from java library 
	import java.util.Scanner;// importing Scanner from java library 

	 public class AbstractFromExistingCustomers {//start class 
		 
		 DateTimeFormatter date = DateTimeFormatter.ofPattern
					("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
				LocalDateTime now = LocalDateTime.now();//special method here for local time and date
		 
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

			//Override toString method 
		    @Override
		    public String toString() {//start toString method to return String value/s 
		        return "ID: "+ AccountID + "  \nName: " + AccountName + " \nPIN: " 
				+ AccountPin + " \nBalance: " + AccountBalance+"$\n\n";
		    }//end toString method 
		
		public void LogInMethod () {//start method 
			
			//Assigning values for the object arrays 
			AccountsOfExistingCustomers [ 0 ] = new DB(101,"Eska",1111, 111);
			AccountsOfExistingCustomers [ 1 ] = new DB(102,"Alex",2222, 222);
			AccountsOfExistingCustomers [ 2 ] = new DB(103,"Annm",3333, 333);
			AccountsOfExistingCustomers [ 3 ] = new DB(104,"Apul",4444, 444);
			AccountsOfExistingCustomers [ 4 ] = new DB(105,"Faby",5555, 555);
			AccountsOfExistingCustomers [ 5 ] = new DB(106,"Jeny",6666, 666);
	        
			System.out.println("Please enter your PIN");
			toInt = X.next();//take user input as a String 
			inputValidation();//calling the method 
			int tostring = Integer.parseInt(toInt);//parse int to String 
			for ( int i = 0; i < AccountsOfExistingCustomers.length; i ++ ) {//start for loop 
				if (tostring == AccountsOfExistingCustomers[ i ].getAccountPin()) {// start if statement 
					
					AccountsOfExistingCustomers[ i ].SelectionMenu();//The specific account in the array has the right to access only
				}//end if statement 
			}//end for loop

			for (int i = 0; i < AccountsOfExistingCustomers.length; i ++) {//start for loop 
				if(tostring != AccountsOfExistingCustomers[ i ].getAccountPin()) {// start if statement 
					System.out.println("Invalid PIN");
					AccountsOfExistingCustomers[ i ].AttemptMethod();//The method will be called on The specific account in the array
					AccountsOfExistingCustomers[ i ].LogInMethod();//The method will be called on The specific account in the array
				}//end if statement 
			}//end for loop
		}//end method 

		public void SelectionMenu () {//start method 
	        
			System.out.println("You logged in at " + date.format ( now ) +"\n");
	    	while(true) {//start while loop 
				System.out.println("Select one of the following:\n"
						+ "1.Bank Statement\n"
						+ "2.Withdraw\n"
						+ "3.Deposite\n"
						+ "4.Back to the main menu\n"
						+ "5.Exit\n"
						+ "6.Change your PIN?\n"
						+ "7.Save money with interest\n"
						+ "8.Search for IDs\n"
						+ "9.Click here if you are the owner");//output the menu 
				toInt = X.next();//take user input as a String 
				inputValidation();//calling method
	            int LOOP = Integer.parseInt(toInt);//parse local int variable to String 
	            
				switch(LOOP) {//start switch statement 
				case 1 : //start case 1
					System.out.println(toString());//output the toString method  
					//all the (break) to stop cases interacting with each other 
					break;

				case 2 : //start case 2
					WithdrawMethod();//calling the method 
					break;

				case 3 : //start case 3
					DepositeMethod();//calling the method 
					break;

				case 4 : //start case 4
					BankOptions.TheMainMethodOfBankOption();//calling the method in the BankOptions class 
					break;

				case 5 : //start case 5
					System.out.println("Thank you, Bye!"); 
					System.exit(0);//shutdown the system 
					break;

				case 6 : //start case 6
					ChangePin(); //calling the method 
					break;

				case 7 : //start case 7
					InterestRateMethod();//calling the method 
					break;

				case 8 : //start case 8
					SearchCustomers();//calling the method 
					break;

				case 9 : //start case 9
					BankOptions.TheMainMenu ();//calling the method in the BankOptions class  
					break;

				default: //start default 
					System.out.println("Wrong choice!!"); 
					break;
				}// switch 
			}//end loop
	    }//end method 
		
		private void DepositeMethod() {//start method 

				System.out.println("How much you want to deposit");
				toInt = X.next();//take user input as a String 
				inputValidation();//calling the method 
				int CustomerDeposite = Integer.parseInt(toInt);//parsing int to String 
				AccountBalance = AccountBalance + CustomerDeposite;//updating balance 
				System.out.println("Your new balance is now: " + getAccountBalance() + 
						"$ on " + date.format ( now ) );//output the balance 
				SelectionMenu();//calling the method 
			}//end method
		
		  void InterestRateMethod () {//start method 

			System.out.println("Number 1 to deposit with interest\nNumber 2 to return to the main menu");
			toInt = X.next();//take user input as a String 
			inputValidation();//calling the method 
			switch(toInt) {//start switch 
			
			case "1" : //start case 1
					System.out.println("How much you want to deposit?");
					toInt = X.next();//take user input as a String 
					inputValidation();//calling the method 
					int CustomerDepositeWithInterest = Integer.parseInt(toInt);//parsing int to String 
					//update the balance 
					AccountBalance = (int) (AccountBalance + CustomerDepositeWithInterest 
							+ ((0.5/10) * CustomerDepositeWithInterest));
					System.out.println("Your annual interest is 0.05%, your savings: " 
							+ getAccountBalance () + "$ on " + date.format ( now ) );//output the value 
					SelectionMenu();//calling the method 
					break;
				
				case "2" : //start case 2
					BankOptions.TheMainMethodOfBankOption(); //calling the method in the BankOptions class   
					break;
				
				default: //start default 
					System.out.println("Wrong choice!!"); 
					inputValidation();//calling the method 
					break;
			}//end switch 
		}//end method 

		private void WithdrawMethod() {//start method 

			int Q = 0;//declare local variable 
			
			System.out.println("How much do you want to withdraw?");
			toInt = X.next();//take user input as a String 
			inputValidation();//calling the method 
			int CustomerWithdawWithFees = Integer.parseInt(toInt);//parsing int to String 

			if(Q <= AccountBalance ) {//start if 
				//updating the balance 
				AccountBalance = (int) (AccountBalance - CustomerWithdawWithFees - ((0.5/100) * CustomerWithdawWithFees));
				System.out.println("Your new Balance is: " + getAccountBalance() + "$ on " + date.format ( now ) );//output the value 
				System.out.println("Fees been taken " + (0.5/100) * CustomerWithdawWithFees + "$\n");//output the fee 
				SelectionMenu();//calling the method 
			}//end if 
			else {//start else 
				System.out.println("Not enough funds");
				SelectionMenu();//calling the method 
			}//end else 
		}//end method 

		public void AttemptMethod() {//start method 
			
			Attempts--;//decrement the variable value 
			System.out.println("\nYou have " 
			+ Attempts + 
			" attempts left\n");//output the decremented variable 

				if ( Attempts == 0 ) {//start if 
					System.out.println("Attention your card is blocked");
					System.exit( 0 );//shutdown the system 
			}//end if 
		}//end method 
		
		public void inputValidation() {//start method 

			while ( ! toInt.matches("\\d+") ) {//start while loop 
				System.out.println("Not Allowed, numbers only!");
				toInt = X.next();//take user input as a String 
			}//end while loop 
		}//end method 
		
		
	    public void ChangePin() {//start method 
	    	
	        System.out.println("Enter your Pin: ");
	        toInt = X.next();//take user input as a String 
	        inputValidation();//calling the method 
	        int ProtectedVarForPIN = Integer.parseInt(toInt);//parsing int to String 
	        int i;//local variable i
	        for ( i =0; i < AccountsOfExistingCustomers.length; i ++ ) {//start for loop 
	        	
	        	 if ( ProtectedVarForPIN == AccountsOfExistingCustomers [ i ].getAccountPin() ) {//start if statement 
		                System.out.println("The PIN is exist in the Database, please try again");
		                AccountsOfExistingCustomers [ i ].ChangePin();//call the method only for the specific account in the array 
		                break;//stop the for loop 
		            }//end if 
	        }//end loop 

	        for ( i = 0; i < AccountsOfExistingCustomers.length; i ++ ) {//start loop 
	        	
	        	if ( ProtectedVarForPIN != AccountsOfExistingCustomers [ i ].getAccountPin() ) {//start if 
	                AccountPin = AccountPin + ProtectedVarForPIN - AccountPin;//update the password 
	                //establish format for date and time that been imported from java library 
	                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	                //establish local date and time that been imported from java library 
	                LocalDateTime now = LocalDateTime.now();
	                //output the PIN and the date and time 
	                System.out.println("Your new PIN is: " + getAccountPin() + 
	                		" This PIN been changed on " + dtf.format( now ) + "\n");
	                SelectionMenu();//calling the method 
	                break;//stop the loop 
	            }//end if 
	        }//end loop
	    }//end method 
		
	    public void SearchCustomers() {//start method 
	    	
    	System.out.println("Please enter the ID number");
    	toInt = X.next();//take user input as a String 
		inputValidation();//calling the method 
        int key = Integer.parseInt(toInt);//parsing int to String 
        int i;//declare local variable 
        boolean found = false;//set variable found to false for now 
       
        for ( i = 0; i < AccountsOfExistingCustomers.length; i ++ )
        {//start for loop
             if ( AccountsOfExistingCustomers [ i ].getAccountID() == key ) {//start if 
            	 
                     found = true;//change the value of found to true   
                     break;//stop trhe loop 
             }//end if 
       }//end loop 

        if ( found == true )   //When found is true, ProtectedVarForPIN of location of key is printed.
        {
        	System.out.println("This is the information for the requested ID at " + key);
    	  	
            System.out.println( AccountsOfExistingCustomers [ i ].toString() );//output the specific account in the array 
            System.out.println("You requested the information on " + date.format ( now ) );
        }//end if 
        else
        {//start else 
            System.out.println(key + " is not registered in the Bank");
        }//end else 
    }//end method 
}//end class 