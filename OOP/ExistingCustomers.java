package ATM;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

final public class ExisitingCustomers {
	
		static Scanner X = new Scanner (System.in);
		private static double Balance [] = {111, 222, 333, 444, 555, 666};
		private static double Savings [] = {0, 0, 0, 0, 0, 0};
		final private static int ID [] = {01, 02, 03, 04, 05, 06};
		private static String names [] = {"Joshua", "Alex", "Younis", "Eskand", "Ann", "Appul"};
		private static int Pin [] = {1111, 2222, 3333, 4444, 5555, 6666};
		private static int Counter = 3;
		private static String toInt;
		private static int tostring;
		private static int index;
		private static int CustomerWithdaw;
		private static int CustomerDeposite;
		private static int ChangePIN;
		
		public static void NamesSearch() {

	    	System.out.println("Please enter the ID number");
	       int key = X.nextInt();

	       int i = 0;
	       boolean found = false;

	      for ( i = 0; i < ID.length; i ++ )
	      {
	             if ( ID [ i ]  == key )
	            {
	                     found = true;     
	                     break;
	             }
	       }

	      if (found)   //When found is true, index of location of key is printed.
	      {
	    	  System.out.println("This is the information for the requested ID at " + key);
	    	  System.out.println("---------------------------------------------------------------------------------------");
	            System.out.println("Name\t\tBalance\t\tID\t\tPIN\t\tIndexPosition\tSavings");
	            System.out.println(names [ i ] + "\t\t" + Balance [ i ] + "$" + "\t\t" + ID [ i ] + "\t\t" + Pin [ i ] + "\t\t   " + i + "\t\t " + Savings [ i ]);
	            System.out.println("---------------------------------------------------------------------------------------");
	      }
	      else
	      {
	            System.out.println(key + "is not in this array.");
	      }
	    }
		
		final public static void main(String [ ] args) {
			PrintCustomers();
			LogInMethod ();
		}
		
		final public static void PrintCustomers() {
			System.out.println("\t Don't fuck with Eskandar's bank\t\t"
					+ "\n----------------------------------------------------------------------------------");
			System.out.println("Names\t\tBalances\tIDs\t\tPINs\t\tSaving Accounts");
			System.out.println("----------------------------------------------------------------------------------");
			for(int i = 0; i < 6; i++) {
				System.out.println(names [ i ] + "\t\t" + Balance [ i ] + "$" + "\t\t" + ID [ i ] + "\t\t" + Pin [ i ] + "\t\t   " +  Savings[ i ] + "$");
				
			}
			System.out.println("----------------------------------------------------------------------------------");
		}
		
		public static void LogInMethod () {
			System.out.println("Please enter your PIN");
			toInt = X.next();
			inputValidation();
			tostring = Integer.parseInt(toInt);
			for ( int i = 0; i < names.length; i ++ ) {
				if (tostring == Pin[i]) {
					index = i;
					SelectionMenu();
				}
			}
			for (int i = 0; i < names.length; i ++) {
				if(tostring != Pin[i]) {
					System.out.println("Invalid PIN");
					AttemptMethod();
					LogInMethod();
				}
			}
		}
		
		private static void SelectionMenu() {
			
			while(true) {
				System.out.println("Select one of the following:\n1.Bank Statement\n2.Withdraw\n3.Deposite\n4.Back to the main menu\n5.Exit\n6.Change your PIN?\n7.Save money with interest");
				toInt = X.next();
				switch(toInt) {
				case "1" : StatementMethod();
				case "2" : WithdrawMethod();
				case "3" : DepositeMethod();
				case "4" : BankDemo.TheMainMethodIsHere();
				case "5" : System.exit(0);
				case "6" : changePin();
				case "7" : InterestRateMethod ();
				default:
	                System.out.println("Wrong choice!!"); 
	                break;
				}
			}
			
		}

		private static void DepositeMethod() {
				System.out.println("How much you want to deposit");
				toInt = X.next();
				inputValidation();
				CustomerDeposite = Integer.parseInt(toInt);
				//update user account balance after depositing
				Balance [ index ] = Balance [ index ] + CustomerDeposite;
				//print the updating balance for the customer so they know 
				System.out.println("Your new balance is now: " + Balance [ index ] + "$");
				SelectionMenu();
			}//end method
		
		static void InterestRateMethod () {
			System.out.println("Number 1 to deposit with interest\nNumber 2 to return to the main menu");
			toInt = X.next();
			switch(toInt) {
			case "1" : 

				System.out.println("How much you want to deposit");
				toInt = X.next();
				inputValidation();
				CustomerDeposite = Integer.parseInt(toInt);
				//update user account balance after depositing
				Savings [ index ] = Savings [ index ] + CustomerDeposite;
				double InterestInTheSavingAccount = Savings [ index ]  + ((0.5/10) * CustomerDeposite);
				//print the updating balance for the customer so they know 
				System.out.println("Your annual interest is 0.05%, you savings: " + InterestInTheSavingAccount + "$");
				SelectionMenu();
				
			break;
			case "2" : BankDemo.TheMainMethodIsHere(); 
			break;
			default:
                System.out.println("Wrong choice!!"); 
                break;
			}
		}
		
		private static void StatementMethod() {
			System.out.println("Your bank statement is:");
			
			System.out.println("\t\tName\t\tPin\t\tBalance\t\tID\t\tSavings"
					+ "\n\t\t---------------------------------------------------");
			System.out.println("\t\t" + names [ index ] + "\t\t" + Pin [ index ] + "\t\t" + Balance[ index ] + "$" + "\t\t" + ID [ index ] + Savings[ index ]);
			SelectionMenu();
		}

		private static void WithdrawMethod() {
			int Q = 0;
			
			System.out.println("How much do you want to withdraw?");
			toInt = X.next();
			inputValidation();
			CustomerWithdaw = Integer.parseInt(toInt);
			if(Balance[index] >= Q) {
				Balance[index] = Balance[index] - CustomerWithdaw;
				double TransactionsFees = Balance[index] - (0.5/100);
				System.out.println("Your new Balance is: " + TransactionsFees + "$");
				SelectionMenu();
			}
			else {
				System.out.println("Not enough funds");
				SelectionMenu();
			}
		}

		public static void AttemptMethod() {
			Counter--;
			System.out.println("\nYou have " + Counter + " attempts left\n");
			if(Counter == 0) {
				System.out.println("Attention your card is blocked");
				System.exit(0);
			}
			else {
				LogInMethod();
			}
		}
		
		public static void inputValidation() {
			while (!toInt.matches("\\d+")) {
				System.out.println("Not Allowed, numbers only!");
				toInt = X.next();
			}
		}
		
		public static void changePin() {//start changePin method 
			System.out.println("Please enter your new "
					+ "PIN");//	Asking the customer to enter their new PIN 
			toInt = X.next();//take in user input as a string
			inputValidation();//check if the user input is valid
			ChangePIN = Integer.parseInt(toInt);//parse String into integer
			//reset the PIN to zero and taking user input PIN instead and store it in the array 
					Pin[index]= Pin[index] + ChangePIN - Pin[index];//update pin index
						 DateTimeFormatter dtf = DateTimeFormatter.ofPattern
								 ("yyyy/MM/dd HH:mm:ss");//set format for date and time that been imported from the machine
				    	   LocalDateTime now = LocalDateTime.now();//get the time and the date from the machine  
					 System.out.println("Your new PIN is now: "+ Pin [ index ] + " This PIN been changed on " + dtf.format(now));
					 SelectionMenu();//get the customer to selection Menu in-case for any other process
		}//end method changePin
		

	}
































