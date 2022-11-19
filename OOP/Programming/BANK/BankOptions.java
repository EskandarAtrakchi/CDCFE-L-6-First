package ATM;//Declaring a packing location 

import java.util.*;// load the contents of the Util package in a Java program.

public class BankOptions {//start the main class 
	static Scanner X = new Scanner (System.in);//declare a Scanner streamed as System.in 
    public static void main(String args [ ]) {//start main method 
    	TheMainMethodOfBankOption();//calling the method 
    	
    }//end method 
    
    public static void TheMainMenu () {//start method 
    	Scanner sc = new Scanner(System.in);//declare a Scanner input streamed as System.in 
		while(true) {//start loop 
			//give options 
			System.out.println("You can choose One of the following:");
			System.out.println("1.Log in for registered accounts");
			System.out.println("2.Accounts Search For Bank owners");
			System.out.println("3.Check temporary account options");
			System.out.println("4.Exit");
			
            String LOOP = sc.next();//take user input as String 
            //create an object to call from static to non static 
            AbstractFromExistingCustomers CallingMethodsFromAnotherClass = new AbstractFromExistingCustomers();
			switch(LOOP) {//start switch 
			
			case "1" : //start case 1
				CallingMethodsFromAnotherClass.LogInMethod();//calling non static method to static 
				break;//all the (break) to stop cases interacting with each other 
			
			case "2" : //start case 2
				CallingMethodsFromAnotherClass.SearchCustomers();//calling non static method to static 
				break;
			
			case "3" : //start case 3
				TheMainMethodOfBankOption();//calling method 
				break;
			
			case "4" : //start case 4 
				System.out.println("Thank you, bye!"); 
				sc.close();//close the Scanner source 
				System.exit(0);//shutdown the system 
			
			default://start default 
                System.out.println("Wrong choice!!"); 
                break;
			}//end switch 
		}//end loop 
		
	}//end method 
    
    public static void TheMainMethodOfBankOption() {//start method 
    	
    	String choice, ch, operation;//declare String variables 
    	//create an object from Transaction class 
        Transaction pullingInfoFromTransactionClass = new Transaction();
        Scanner sc = new Scanner(System.in);//declare a Scanner input streamed as System.in 
        double amount;//declare a double variable 
        long accountNo;//declare a long variable 

        do {//start do while loop 
        	//output the options 
            System.out.println("1. Create Temporary flexible account?");
            System.out.println("2. Transaction for the temporary created account");
            System.out.println("3. View the Temporary Account Information");
            System.out.println("4. Existed Customer?");
            System.out.println("5. Exit");
            System.out.println("6. Click here if you are the owner");
            choice = sc.next();//take user input as a String 
            switch (choice) {//start switch 

            case "1": //start case 1 
            	
                double openingBalance;//local variable as a double 
                System.out.println("Enter the opening balance :");
                openingBalance = sc.nextDouble();//taking user input as a double
                //calling the object been created to initiate values that been set as parameters in Transaction class 
                pullingInfoFromTransactionClass.transaction(0, "Opening", openingBalance);
                break;//all the (break) to stop cases interacting with each other 

            case "2": //start case 2
            	//out put the choices 
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                ch = sc.next();//take user input as a String 
                if (ch.equalsIgnoreCase("1"))//start if when the input is equal to Deposit 
                    operation = "Deposit";//declaring the Deposit in the Transaction class 
                else if (ch.equalsIgnoreCase("2"))//start if when the input is equal to Withdraw
                    operation = "Withdraw";//declaring the Withdraw in the Transaction class 
                else {//start else 
                    operation = "Invalid option";//returning nothing 
                }//end else 
                System.out.println("Your ID Number:");
                accountNo = sc.nextLong();//taking user input as long 
                System.out.println("Amount:");
                amount = sc.nextDouble();//taking user input as a double 
                //initiating the values through constructors
                pullingInfoFromTransactionClass.transaction(accountNo, operation, amount);
                break;

            case "3":// start case 3 
            	
                System.out.println("Your ID Number:");
                accountNo = sc.nextLong();//taking user input as long 
                operation = "showInfo";//declaring the showInfo in the Transaction class
                pullingInfoFromTransactionClass.transaction(accountNo, operation, 0);
                break;
                
            case "4": //start case 4 
            	
            	//create Object variable to call from non static method to static 
            	AbstractFromExistingCustomers Access = new AbstractFromExistingCustomers();
            	Access.LogInMethod ();//calling non static method  
            	break;

            case "5"://start case 5 
            	
                System.out.println("Thank you!");
                break;
                
            case "6" ://start case 6 
            	
            	TheMainMenu ();//calling method 
            	break;
            	
            default://start default 
            	
                System.out.println("Wrong choice!!"); 
                break;
                
            }//end switch 
        }//end loop  
        while (choice != "5");//setting the condition 
        sc.close();//closing the Scanner source 
    }//end method 
    static {//start static block 
    	System.out.println("\tThis is a TEST ATM");
    }//end static block 
}//end class 
