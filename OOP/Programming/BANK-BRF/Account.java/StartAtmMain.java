import java.io.IOException;//importing exception 
import java.util.Scanner;//importing the Scanner
import javax.security.auth.login.AccountException;//importing exception 
/**
 * @author Eskandar Atrakchi
 *
 */
public class StartAtmMain {//start class 

	//create two objects 
	static SavingsAccount SavingsObj = new SavingsAccount();
	static CurrentAccount CurrentObj = new CurrentAccount();

	private static int MainAttempts;//create static variable 

	//create main method with throw of the two imported exceptions 
	public static void main(String[] args) throws IOException, AccountException {
		
		while(true) {//start while loop 
		System.out.println(
				"1.SavingsAccounts\n"
				+ "2.CurrentAccounts\n"
				+ "3.Exit the ATM");//display the options 
		
		String LOOP;//declare variable 
		Scanner X = new Scanner(System.in);
		LOOP = X.next();//take user input as a String 
		switch(LOOP) {//start switch statement
		case "1" : //start case one 
			SavingsObj.SavingsLogIn ();//calling method from the other class 
			X.close();//close the Scanner source 
			break;//break the case 
			
		case "2" : //start second case 
			CurrentObj.CurrentLogIn ();//call method from the other class 
			X.close();//close the Scanner source 
			break;//break the case 
			
		case "3" ://start the third case 
			System.out.println("Thank you, bye!");
			X.close();//close the source 
			System.exit(0);//end the program 
			
		default://start default 
			System.out.println("Wrong choice!");
			MainAttempts--;//decrement the variable value 
			if ( MainAttempts == 1 ) {//start if 
				System.out.println("Attention too many wrong attempts! You have one last try!");
		}//end if 
			if ( MainAttempts == 0 ) {//start if 
				System.out.println("Attention too many wrong attempts! you been kickedout");
				X.close();//close the Scanner source 
				System.exit( 0 );//shutdown the system 
		}//end if 
			break;
		}//end switch 
	   }//end while 
	 }//end main
		static {//start static block 
			MainAttempts = 6;//assign static variable
			System.out.println("This is a test ATM");
		}////end block 
}//end class 
