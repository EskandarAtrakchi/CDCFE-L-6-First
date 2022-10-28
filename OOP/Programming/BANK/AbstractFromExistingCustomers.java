package ATM;//package location

import java.time.LocalDateTime;//importing locatal time from the machine 
import java.time.format.DateTimeFormatter;//importing the format
import java.util.Scanner;//importing the Scanner from utility

abstract public class AbstractFromExistingCustomers {//start an abstract class

	static Scanner X = new Scanner (System.in);//declare X as a variable for the static Scanner 
	private static double Balance [] = {111, 222, 333, 444, 555, 666};//declare private balance array 
	private static double Savings [] = {0, 0, 0, 0, 0, 0};//declare savings private array 
	final private static int IDs [] = {101, 102, 103, 104, 105, 106};//declare int IDs private array 
	private static String names [] = {"Joshua", "Alex", "Younis", "Eskand", "Ann", "Appul"};//declare private array for names 
	private static int Pin [] = {1111, 2222, 3333, 4444, 5555, 6666};//declare private array for PINs 
	private static int Counter = 3;//declare private counter 
	private static String toInt;//declare private String to take user input as a String when required 
	private static int tostring;//declare private int to take user input as int when required 
	private static int index;//declare index to iterate through the static arrays 
	private static int CustomerWithdaw;//declare private variable to hold customers withdraw 
	private static int CustomerDeposite;//varible to hold customer deposit to update the index in the array 
	private static int ChangePIN;//variable to update the PINs in the array
	
	public static void NamesSearch() {//start a method to search for names 

    	System.out.println("Please enter the ID number");//ask to enter the ID of the static array
       int key = X.nextInt();//hold the input in variable called key

       int i = 0;//assign i to zero
       boolean found = false;//assign variale found to false 

      for ( i = 0; i < IDs.length; i ++ ) {//start loop in IDs array 
    	  
             if ( IDs [ i ]  == key )
            {//condition if in the array equals the value of the variable 
                     found = true;//change the variable from false to true
                     break;//stop the for loop
             }//end if statement
       }//end loop

      if (found)//When found is true, index of location of key is printed.
      {
		//printing out the requested infor according to the i in the arrays
    	System.out.println("This is the information for the requested ID at " + key);
    	System.out.println("---------------------------------------------------------------------------------------");
    	System.out.println("Name\t\tBalance\t\tID\t\tPIN\t\tIndexPosition\tSavings");
        System.out.println(names [ i ] + "\t\t" + Balance [ i ] + "$" + "\t\t" + IDs [ i ] + "\t\t" + Pin [ i ] + "\t\t   " + i + "\t\t " + Savings [ i ]);
        System.out.println("---------------------------------------------------------------------------------------");
      }
      else
      {//start else 
	  		//print the out when the key variable is not found in the array
            System.out.println(key + " Customer doesn't exist, check in new customers ArrayList instead.");
      }//end else
    }//end method
	
	final public static void main(String [ ] args) {//start final main method 
		PrintCustomers();//calling print method
		LogInMethod ();//calling log in method 
	}//end final main method 
	
	final public static void PrintCustomers() {//start final method 
		System.out.println("\t\t Don't fuck with Eskandar's bank\t\t"
				+ "\n----------------------------------------------------------------------------------");
		System.out.println("Names\t\tBalances\tIDs\t\tPINs\t\tSaving Accounts");
		System.out.println("----------------------------------------------------------------------------------");
		for(int i = 0; i < 6; i++) {//start for loop to print the i in the arrays
			System.out.println(names [ i ] + "\t\t" + Balance [ i ] + "$" + "\t\t" + IDs [ i ] + "\t\t" + Pin [ i ] + "\t\t   " +  Savings[ i ] + "$");
			
		}//end for 
		System.out.println("----------------------------------------------------------------------------------");
	}//end method 
	
	public static void LogInMethod () {//start log in method 
		System.out.println("Please enter your PIN");
		toInt = X.next();//take user input as a String 
		inputValidation();//call the method 
		tostring = Integer.parseInt(toInt);//change the input to an int instead 
		for ( int i = 0; i < names.length; i ++ ) {//start loop 
			if (tostring == Pin [ i ]) {//start if 
				index = i;//assign index to i when it is found in the PINs array 
				SelectionMenu();//calling the method 
			}//end if 
		}//end for 
		for (int i = 0; i < names.length; i ++) {//start loop for the other cienario 
			if(tostring != Pin[i]) {//start if statement 
				System.out.println("Invalid PIN");//
				AttemptMethod();//call method 
				LogInMethod();//call the method 
			}//end if 
		}//end for
	}//end login method 
	
	private static void SelectionMenu() {//start method 
		
		while(true) {//start while loop 
			System.out.println("Select one of the following:\n1.Bank Statement\n2.Withdraw\n3.Deposite\n4.Back to the main menu\n5.Exit\n6.Change your PIN?\n7.Save money with interest");
			toInt = X.next();//take user input as a String 
			switch(toInt) {//start switch statement 
			case "1" : StatementMethod();//case one call StatementMethod method 
			break;//stop at the current case 
			case "2" : WithdrawMethod();// case two call WithdrawMethod method 
			break;//stop at the current case 
			case "3" : DepositeMethod();// case three call DepositeMethod method 
			break;//stop at the current case 
			case "4" : BankOptions.TheMainMethodIsHere();//case four call the method in the other call that called TheMainMethodIsHere
			break;//stop at the current case 
			case "5" : System.exit(0);//case 5 is to exit the system 
			break;//stop at the current case 
			case "6" : changePin();// case 6 call the changePin method 
			break;//stop at the current case 
			case "7" : InterestRateMethod();// case 7 call the InterestRateMethod method 
			break;//stop at the current case 
			default://any other input, this gonna happen 
                System.out.println("Wrong choice!!"); 
                break;//stop at the current case 
			}//end switch statement 
		}//end loop
	}//end method 

	private static void DepositeMethod() {//start method 
			System.out.println("How much you want to deposit");
			toInt = X.next();//take user inut as a String 
			inputValidation();//call the validation method 
			CustomerDeposite = Integer.parseInt(toInt);//change the input to int 
			//update user account balance after depositing
			Balance [ index ] = Balance [ index ] + CustomerDeposite;
			//print the updating balance for the customer so they know 
			System.out.println("Your new balance is now: " + Balance [ index ] + "$");
			SelectionMenu();//call the method
		}//end method
	
	static void InterestRateMethod () {//start method 
		System.out.println("Number 1 to deposit with interest\nNumber 2 to return to the main menu");
		toInt = X.next();//take user input as a String 
		inputValidation();//call the method 
		switch(toInt) {//switch statement 
		
		case "1" : //case one 
			System.out.println("How much you want to deposit?");
			toInt = X.next();//take user input as a String 
			inputValidation();//call the validation method 
			CustomerDeposite = Integer.parseInt(toInt);//change the input to int 
			//update user account balance after depositing
			Savings [ index ] = Savings [ index ] + CustomerDeposite;
			//clarify the rate 
			Balance[index] = Savings [ index ]  + ((0.5/10) * CustomerDeposite);
			//print the updating balance for the customer so they know 
			System.out.println("Your annual interest is 0.05%, your savings: " + Balance[index] + "$");
			SelectionMenu();//call the method 
			break;//break case one 
			
		case "2" : BankOptions.TheMainMethodIsHere();//call the method from the other call that called TheMainMethodIsHere
		break;//break case two 
		
		default://in any other cases, do this 
            System.out.println("Wrong choice!!"); 
			inputValidation();//call the validation method 
            break;
		}//end switch
	}//end the mathod
	
	private static void StatementMethod() {//start method 
		System.out.println("Your bank statement is:");
		
		System.out.println("\t\tName\t\tPin\t\tBalance\t\tID\t\tSavings"
				+ "\n\t\t--------------------------------------------------------------------------");
		System.out.println("\t\t" + names [ index ] + "\t\t" + Pin [ index ] + "\t\t" + Balance [ index ] + "$" + "\t\t" + IDs [ index ] + "\t\t" + Savings [ index ] + "$\n");
		SelectionMenu();//calling a method 
	}//end mehod 

	private static void WithdrawMethod() {//start method 
		int Q = 0;//assign variable Q to zero 
		
		System.out.println("How much do you want to withdraw?");
		toInt = X.next();//take user input as a String 
		inputValidation();//call input validation method 
		CustomerWithdaw = Integer.parseInt(toInt);//change from String to number 
		if(Balance[index] >= Q) {//start if 
			Balance[index] = Balance[index] - CustomerWithdaw;//update balance 
			Balance[index] = Balance[index] - ((0.5/100) * CustomerWithdaw);//detect fees
			//print out the balance updated  
			System.out.println("Your new Balance is: " + Balance[index] + "$");
			//print out the fees been taken 
			System.out.println("Fees been taken " + (0.5/100) * CustomerWithdaw + "$\n");
			SelectionMenu();//calling method 
		}//end if statement 
		else {//start else 
			System.out.println("Not enough funds");
			SelectionMenu();//calling the method 
		}//end else 
	}//end method 

	public static void AttemptMethod() {//start method 
		Counter--;//decrement the counter
		System.out.println("\nYou have " + Counter + " attempts left\n");
		if(Counter == 0) {//condition when it hits zero 
			System.out.println("Attention your card is blocked");
			System.exit(0);//exiting the system 
		}//end if 
		else {//start else 
			LogInMethod();//calling a method 
		}//end else 
	}//end method 
	
	public static void inputValidation() {//start method 
		while (!toInt.matches("\\d+")) {//start loop 
			System.out.println("Not Allowed, numbers only!");
			toInt = X.next();//take user input 
		}//end while loop
	}//end method 
	
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