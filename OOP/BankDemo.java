package ATM;

import java.util.*;

public class BankDemo {
	static Scanner X = new Scanner (System.in);
    public static void main(String args[]) {
    	TheMainMethodIsHere();
    	
    }
    public static void NamesSearch() {
	    
    	int ID [] = {01, 02, 03, 04, 05, 06};
    	int Pin [] = {1111, 2222, 3333, 4444, 5555, 6666};
    	double Balance[] = {111, 222, 333, 444, 555, 666};
    	String names [] = {"Joshua", "Alex", "Younis", "Eskand", "Ann", "Appul"};
    	System.out.println("Please enter the ID number");
       int key = X.nextInt();

       int i = 0;
       boolean found = false;

      for ( i = 0; i < ID.length; i++)
      {
             if (ID[ i ]  == key)
            {
                     found = true;     
                     break;
             }
       }

      if (found)   //When found is true, index of location of key is printed.
      {
    	  System.out.println("This is the information for the requested ID at " + key);
    	  System.out.println("------------------------------------------------------------------------------");
            System.out.println("Name\t\tBalance\t\tID\t\tPIN\t\tIndexPosition");
            System.out.println(names[i] + "\t\t" + Balance[i]+"$" + "\t\t" + ID[i] + "\t\t" + Pin[i] + "\t\t   " + i);
            System.out.println("------------------------------------------------------------------------------");
      }
      else
      {
            System.out.println(key + "is not in this array.");
      }
    }
    
    public static void TheMainMethodIsHere() {
    	String choice, ch, operation;
        Transaction pullingInfoFromTransactionClass = new Transaction();
        Scanner sc = new Scanner(System.in);
        double amount;
        long accountNo;

        do {
            System.out.println("1. Create an account?");
            System.out.println("2. Transaction");
            System.out.println("3. View Account Information");
            System.out.println("4. Existed Customer?");
            System.out.println("5. Exit");
            System.out.println("6. For DEV use only");
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
            	ExisitingCustomers.PrintCustomers();
            	ExisitingCustomers.LogInMethod (); 
            	break;

            case "5":
                System.out.println("Thank you!");
                break;
            
            
            case "6":
            	NamesSearch(); break;
			
            default:
                System.out.println("Wrong choice!!"); 
                break;
            }
        } while (choice != "5");
        sc.close();
    }
}