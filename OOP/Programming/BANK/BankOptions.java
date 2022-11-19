package ATM;

import java.util.*;

public class BankOptions {
	static Scanner X = new Scanner (System.in);
    public static void main(String args [ ]) {
    	TheMainMethodOfBankOption();
    	
    }
    
    public static void TheMainMenu () {
    	Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("You can choose One of the following:");
			System.out.println("1.Log in for registered accounts");
			System.out.println("2.Accounts Search For Bank owners");
			System.out.println("3.Check temporary account options");
			System.out.println("4.Exit");
			
            String LOOP = sc.next();
            AbstractFromExistingCustomers CallingMethodsFromAnotherClass = new AbstractFromExistingCustomers();
			switch(LOOP) {
			
			case "1" : CallingMethodsFromAnotherClass.LogInMethod(); 
			break;
			
			case "2" : CallingMethodsFromAnotherClass.SearchCustomers();
			break;
			
			case "3" : TheMainMethodOfBankOption();
			break;
			
			case "4" : System.out.println("Thank you, bye!"); 
			sc.close();
			System.exit(0);
			
			default:
                System.out.println("Wrong choice!!"); 
                break;
			}
		}
		
	}
    
    public static void TheMainMethodOfBankOption() {
    	
    	String choice, ch, operation;
        Transaction pullingInfoFromTransactionClass = new Transaction();
        Scanner sc = new Scanner(System.in);
        double amount;
        long accountNo;

        do {
            System.out.println("1. Create Temporary flexible account?");
            System.out.println("2. Transaction for the temporary created account");
            System.out.println("3. View the Temporary Account Information");
            System.out.println("4. Existed Customer?");
            System.out.println("5. Exit");
            System.out.println("6. Click here if you are the owner");
            choice = sc.next();
            switch (choice) {

            case "1":
            	
                double openingBalance;
                System.out.println("Enter the opening balance :");
                openingBalance = sc.nextDouble();
                pullingInfoFromTransactionClass.transaction(0, "Opening", openingBalance);
                break;

            case "2":
            	
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                ch = sc.next();
                if (ch.equalsIgnoreCase("1"))
                    operation = "Deposit";
                else if (ch.equalsIgnoreCase("2"))
                    operation = "Withdraw";
                else {
                    operation = "Invalid option";
                }
                System.out.println("Your ID Number:");
                accountNo = sc.nextLong();
                System.out.println("Amount:");
                amount = sc.nextDouble();
                pullingInfoFromTransactionClass.transaction(accountNo, operation, amount);
                break;

            case "3":
            	
                System.out.println("Your ID Number:");
                accountNo = sc.nextLong();
                operation = "showInfo";
                pullingInfoFromTransactionClass.transaction(accountNo, operation, 0);
                break;
                
            case "4":
            	
            	AbstractFromExistingCustomers Access = new AbstractFromExistingCustomers();
            	Access.LogInMethod (); 
            	break;

            case "5":
            	
                System.out.println("Thank you!");
                break;
                
            case "6" :
            	
            	TheMainMenu ();
            
            default:
            	
                System.out.println("Wrong choice!!"); 
                break;
            }
        } 
        while (choice != "5");
        sc.close();
    }
    static {
    	System.out.println("\tThis is a TEST ATM");
    }
}