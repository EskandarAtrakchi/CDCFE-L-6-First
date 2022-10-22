package ATM;

import java.util.*;

public class BankDemo {
    public static void main(String args[]) {
    	TheMainMethodIsHere();
    }
    
    public static void TheMainMethodIsHere() {
    	String choice, ch, operation;
        Transaction transac = new Transaction();
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
                transac.transaction(0, "Opening", openingBalance);
                break;

            case "2":
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                ch = sc.next();
                if (ch.equalsIgnoreCase("a"))
                    operation = "Deposit";
                else if (ch.equalsIgnoreCase("b"))
                    operation = "Withdraw";
                else {
                    operation = "Invalid option";
                }
                System.out.println("Established ID Number:");
                accountNo = sc.nextLong();
                System.out.println("Amount:");
                amount = sc.nextDouble();
                transac.transaction(accountNo, operation, amount);
                break;

            case "3":
                System.out.println("Established ID Number:");
                accountNo = sc.nextLong();
                operation = "showInfo";
                transac.transaction(accountNo, operation, 0);
                break;
                
            case "4":
            	ExisitingCustomers.PrintCustomers();
            	ExisitingCustomers.LogInMethod ();break;

            case "5":
                System.out.println("Thank you!");
                break;
            
            /*
            case "6":
            	ExisitingCustomers.NamesSearch();break;
			*/
                
                
            default:
                System.out.println("Wrong choice!!");break;
            }
        } while (choice != "5");
        sc.close();
    }
}