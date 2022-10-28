import java.util.*;//general imports from java utility 

public class BankOptions {//start public class 
	static Scanner X = new Scanner (System.in);//static Scanner by holded by variable X 
    public static void main(String args [ ]) {//start main method 
    	TheMainMethodIsHere();//calling the method 
    	
    }//end the main method 
    
    public static void TheMainMethodIsHere() {//start method 
    	
    	String choice, ch, operation;//declare String variables 
        Transaction pullingInfoFromTransactionClass = new Transaction();//connecting the two classes together, holded by variable, there is default constructor here 
        Scanner sc = new Scanner(System.in);//Scanner input streamed as System.in held by sc 
        double amount;//double variable 
        long accountNo;//long variable 

        do {//start do while loop 
            System.out.println("1. Create an account?");
            System.out.println("2. Transaction");
            System.out.println("3. View Account Information");
            System.out.println("4. Existed Customer?");
            System.out.println("5. Exit");
            System.out.println("6. For DEV use only");
            choice = sc.next();//take user input and hold it by varibale called choice 
            switch (choice) {//switch the variable 

            case "1"://start case one 
                double openingBalance;//variable double 

                System.out.println("Enter the opening balance :");
                openingBalance = sc.nextDouble();//taking user input as a double as hold it by the declared varibale 
                pullingInfoFromTransactionClass.transaction(0, "Opening", openingBalance);//pushing info in the transaction class 
                break;//stop case one 

            case "2"://start case two 
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                ch = sc.next();//hold user input in variable called ch
                if (ch.equalsIgnoreCase("1"))//if ch equals the word Deposit (With ignoring the case of the word)
                    operation = "Deposit";//assigning operation to Deposit String 
                else if (ch.equalsIgnoreCase("2"))//if ch equals the word Withdraw (With ignoring the case of the word)
                    operation = "Withdraw";//assigning operation to Withdraw String 
                else {//start else 
                    operation = "Invalid option";//inform the user that they entered invalid option 
                }//end else 
                System.out.println("Your ID Number:");
                accountNo = sc.nextLong();//assign accountNo variable to sc that been taken as long 
                System.out.println("Amount:");
                amount = sc.nextDouble();//assign variable amount to sc that been taken as double 
                pullingInfoFromTransactionClass.transaction(accountNo, operation, amount);//pushing info to the transaction class 
                break;//stop case

            case "3"://start case three
                System.out.println("Your ID Number:");
                accountNo = sc.nextLong();//assign accountNo to sc which has been take as long 
                operation = "showInfo";//assign variable called operation to "showinfo "
                pullingInfoFromTransactionClass.transaction(accountNo, operation, 0);//push info to the transaction class 
                break;//stop case three
                
            case "4"://start case four 
            	ExistingCustomers.PrintCustomers();//pullin the method from ExistingCustomers which it's exteded from AbstractFromExistingCustomers
            	ExistingCustomers.LogInMethod (); //pullin the method from ExistingCustomers which it's exteded from AbstractFromExistingCustomers
            	break;//stop the case 

            case "5"://start case 5 when customer wants to exit
                System.out.println("Thank you!");
                break;//stop the case 
            
            
            case "6"://start case 6 
            	ExistingCustomers.NamesSearch();//pullin the method from ExistingCustomers which it's exteded from AbstractFromExistingCustomers
                break;//stop the case here 
			
            default://in any other situation 
                System.out.println("Wrong choice!!"); 
                break;//stop the case here 
            }//end switch 
        }//end do 
         while (choice != "5");//when the choice does not equal 5 the loop it again 
        sc.close();//clase the source of Scanner here 
    }//end class 
}