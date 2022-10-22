package ATM;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final public class ExisitingCustomers {
	
		static Scanner X = new Scanner (System.in);
		private static double Balance[] = {111, 222, 333, 444, 555, 666};
		final private static int[] ID = {01, 02, 03, 04, 05, 06};
		private static String names [] = {"Joshua", "Alex", "Younis", "Eskand", "Ann", "Appul"};
		private static int Pin [] = {1111, 2222, 3333, 4444, 5555, 6666};
		private static int Counter = 3;
		private static String toInt;
		private static int tostring;
		private static int index;
		private static int CustomerWithdaw;
		private static int CustomerDeposite;
		/*
		public static void NamesSearch() {
			String names [] = {"Joshua", "Alex", "Younis", "Eskand", "Ann", "Appul"};
			
			System.out.println("Please enter a name that you want to search in the system");
			Scanner search = new Scanner(System.in);
			Pattern pattern1 = Pattern.compile(names [6] , Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern1.matcher(search.nextLine());
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found in the existing customers in the array");
		    } else {
		      System.out.println("Match not found");
		    }
		}
		
		*/
		
		
		final public static void main(String [] args) {
			PrintCustomers();
			LogInMethod ();
			
		}
		
		final public static void PrintCustomers() {
			System.out.println("\t Don't fuck with Eskandar's bank\t\t"
					+ "\n--------------------------------------------------------");
			System.out.println("Names\t\tBalances\tIDs\t\tPINs");
			System.out.println("--------------------------------------------------------");
			for(int i = 0; i < 6; i++) {
				System.out.println(names[i] + "\t\t" + Balance[i] + "\t\t" + ID[i] + "\t\t" + Pin[i]);
				
			}
			System.out.println("--------------------------------------------------------");
		}
		
		public static void LogInMethod () {
			System.out.println("Please enter your PIN");
			toInt = X.next();
			inputValidation();
			tostring = Integer.parseInt(toInt);
			for (int i = 0; i < names.length; i++) {
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
				System.out.println("Select one of the following:\n1.Bank Statement\n2.Withdraw\n3.Deposite\nBack to the main menu\n5.Exit\n");
				toInt = X.next();
				inputValidation();
				int Y = Integer.parseInt(toInt);
				switch(Y) {
				case 1 : StatementMethod();
				case 2 : WithdrawMethod();
				case 3 : DepositeMethod();
				case 4 : BankDemo.TheMainMethodIsHere();
				case 5 : System.exit(0);
				}
			}
			
		}

		private static void DepositeMethod() {
				System.out.println("How much you want to deposit");
				toInt = X.next();
				inputValidation();
				CustomerDeposite = Integer.parseInt(toInt);
				//update user account balance after depositing
				Balance[index]= Balance[index]+ CustomerDeposite;
				System.out.println("\nPlease take your reciept\n");
				//print the updating balance for the customer so they know 
				System.out.println("\nYour new balance is now: "+ Balance[index]);
				System.out.println("Your card is still active in the ATM\n"
				 		+ "Please select from the menu down below\n");
				SelectionMenu();
			}//end method
		
		private static void StatementMethod() {
			System.out.println("Your bank statement is:");
			
			System.out.println("\t\tName\t\tPin\t\tBalance\t\tID"
					+ "\n\t\t---------------------------------------------------");
			System.out.println("\t\t" + names[index] + "\t\t" + Pin[index] + "\t\t" + Balance[index] + "\t\t" + ID[index]);
			SelectionMenu();
		}

		private static void WithdrawMethod() {
			
			System.out.println("How much do you want to withdraw?");
			toInt = X.next();
			inputValidation();
			CustomerWithdaw = Integer.parseInt(toInt);
			if(Balance[index] <= CustomerWithdaw) {
				Balance[index] = Balance[index] - CustomerWithdaw;
				System.out.println("Your new Balance is: "+Balance[index]);
				System.out.println("Select from the menu down below");
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
		

	}