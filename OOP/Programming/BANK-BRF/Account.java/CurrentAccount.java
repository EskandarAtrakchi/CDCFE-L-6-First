
	import java.time.LocalDateTime;//importing local date and time from java library 
	import java.time.format.DateTimeFormatter;//importing format of date and time from java library 
	import java.util.Scanner;// importing Scanner from java library 

	 public class CurrentAccount {//start class
		 
		 private String toInt;//declare String variable
		 
		 public class CurrentDB extends CurrentAccount {

		    	public CurrentDB(int AccountID, String AccountName, int AccountPin, double AccountBalance) {
		    		super(AccountID,AccountName, AccountPin, AccountBalance);
		    		
		    	}
		    }
		 Account OBJ = new Account();
		 DateTimeFormatter date = DateTimeFormatter.ofPattern
					("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the device 
		 LocalDateTime now = LocalDateTime.now();//special method here for local time and date
		 Scanner X = new Scanner (System.in);//X is the user input streamed as System.in     
		  //declare object array for 6 Accounts constructed in CurrentAccount class objected as AccountsOfExistingCustomers
		    static CurrentAccount [ ] Current = new CurrentAccount [ 3 ];

		public CurrentAccount(int AccountID, String AccountName, int AccountPin, double AccountBalance) {
			OBJ.AccountID = AccountID;//initiating the value of variable to the value of the parameter 
	        OBJ.AccountName = AccountName;//initiating the value of variable to the value of the parameter 
	        OBJ.AccountPin = AccountPin;//initiating the value of variable to the value of the parameter 
	        OBJ.AccountBalance = AccountBalance;//initiating the value of variable to the value of the parameter 
		}

		public CurrentAccount() {}
		
		public void CurrentLogIn () {//start method 
			
			//Assigning values for the object arrays 
			Current [ 0 ] = new CurrentAccount(101,"Eska",1111, 111);
			Current [ 1 ] = new CurrentAccount(102,"Alex",2222, 222);
			Current [ 2 ] = new CurrentAccount(103,"Annm",3333, 333);
			
			System.out.println("Please enter your PIN");
			toInt = X.next();//take user input as a String 
			inputValidation();//calling the method 
			int tostring = Integer.parseInt(toInt);//parse int to String 
			for ( int i = 0; i < Current.length; i ++ ) {//start for loop 
				if (tostring == Current[ i ].OBJ.getAccountPin()) {// start if statement 
					
					boolean found = false;//set variable found to false for now 
				       
			        for (int j = 0; j < Current.length; j ++ )
			        {//start for loop
			             if ( Current [ j ].OBJ.getAccountPin() == tostring ) {//start if 
			            	 
			                     found = true;//change the value of found to true   
			                     break;//stop the loop 
			             }//end if 
			       }//end loop 

			        if ( found == true )   //When found is true, ProtectedVarForPIN of location of key is printed.
			        {
			        	System.out.println("Hello " + Current [ i ].OBJ.getAccountName() + " You logged in to the CURRENT ACCOUNT at \n" + date.format ( now ) +"\n");//output the specific account in the array  
			        }//end if 
					Current[ i ] . SelectionMenu();//The specific account in the array has the right to access only
				}//end if statement 
			}//end for loop

			for (int i = 0; i < Current.length; i ++) {//start for loop 
				if(tostring != Current[ i ].OBJ.getAccountPin()) {// start if statement 
					System.out.println("Invalid PIN");
					Account.AttemptMethod();//The method will be called on The specific account in the array
					Current[ i ].CurrentLogIn();//The method will be called on The specific account in the array
				}//end if statement 
			}//end for loop
		}//end method 

		public void SelectionMenu () {//start method 
			
	    	while(true) {//start while loop 
				System.out.println("Select one of the following:\n"
						+ "1.Bank Statement\n"
						+ "2.Withdraw\n"
						+ "3.Deposite\n"
						+ "4.Change your PIN?\n"
						+ "5.Exit");//output the menu 
				toInt = X.next();//take user input as a String 
				inputValidation();//calling method
	            int LOOP = Integer.parseInt(toInt);//parse local int variable to String 
				switch(LOOP) {//start switch statement 
				case 1 : //start case 1
					System.out.println("The last update for your bank statement was on " 
				+ date.format ( now ) + "\n" + OBJ.toString());//output the toString method  
					//all the (break) to stop cases interacting with each other 
					break;

				case 2 : //start case 2
					WithdrawMethod();//calling the method 
					break;

				case 3 : //start case 3
					DepositeMethod();//calling the method 
					break;

				case 4 : //start case 4
					ChangePin(); //calling the method 
					break;

				case 5 : //start case 5
					System.out.println("Thank you for using CURRENT ACCOUNT, Bye!"); 
					X.close();
					System.exit(0);//shutdown the system 
					
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
				double CustomerDeposite = Integer.parseInt(toInt);//parsing int to String 
				OBJ.setAccountBalance(OBJ.getAccountBalance() 
					+ CustomerDeposite - ((0.5/100) * CustomerDeposite));//updating balance 
				System.out.println("Your new balance is now: " + OBJ.getAccountBalance() + 
						"$ on " + date.format ( now ) );//output the balance
				System.out.println("Fees been taken " + (0.5/100) * CustomerDeposite + "$\n");//output the fee 
				SelectionMenu();//calling the method 
			}//end method
		
		private void WithdrawMethod() {//start method 
			
			System.out.println("How much do you want to withdraw?");
			toInt = X.next();//take user input as a String 
			inputValidation();//calling the method 
			double CustomerWithdawWithFees = Integer.parseInt(toInt);//parsing int to String 
			
			OBJ.setAccountBalance(OBJ.getAccountBalance() 
					- CustomerWithdawWithFees - ((0.5/100) * CustomerWithdawWithFees));//updating balance 
				System.out.println("Your new Balance is: " + OBJ.getAccountBalance() + "$ on " + date.format ( now ) );//output the value 
				System.out.println("Fees been taken " + (0.5/100) * CustomerWithdawWithFees + "$\n");//output the fee 
				SelectionMenu();//calling the method 
		}//end method 
		
	    public void ChangePin() {//start method 
	    	
	        System.out.println("Enter your Pin: ");
	        toInt = X.next();//take user input as a String 
	        inputValidation();//calling the method 
	        int ProtectedVarForPIN = Integer.parseInt(toInt);//parsing int to String 
	        int i;//local variable i
	        for ( i =0; i < Current.length; i ++ ) {//start for loop 
	        	
	        	 if ( ProtectedVarForPIN == OBJ.getAccountPin() ) {//start if statement 
		                System.out.println("The PIN is exist in the Database, please try again");
		                ChangePin();//call the method only for the specific account in the array 
		                break;//stop the for loop 
		            }//end if 
	        }//end loop 

	        for ( i = 0; i < Current.length; i ++ ) {//start loop 
	        	
	        	if ( ProtectedVarForPIN != OBJ.getAccountPin() ) {//start if 
	        		
	        		OBJ.setAccountPin(OBJ.getAccountPin() 
							+ ProtectedVarForPIN - OBJ.getAccountPin());//updating password 
	                //establish format for date and time that been imported from java library 
	                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	                //establish local date and time that been imported from java library 
	                LocalDateTime now = LocalDateTime.now();
	                //output the PIN and the date and time 
	                System.out.println("Your new PIN is: " + OBJ.getAccountPin() + 
	                		" This PIN been changed on " + dtf.format( now ) + "\n");
	                SelectionMenu();//calling the method 
	                break;//stop the loop 
	            }//end if 
	        }//end loop
	    }//end method 
	    
	    public void inputValidation() {//start method 

			while ( ! toInt.matches("\\d+") ) {//start while loop 
				System.out.println("Not Allowed, numbers only!");
				toInt = X.next();//take user input as a String 
			}//end while loop 
		}//end method 
}//end class 
	 
