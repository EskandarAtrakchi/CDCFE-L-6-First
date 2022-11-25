import java.io.IOException;
import java.util.Scanner;
import javax.security.auth.login.AccountException;
/**
 * @author Eskandar Atrakchi
 *
 */
public class StartAtmMain {
	static SavingsAccount SavingsObj = new SavingsAccount();
	static CurrentAccount CurrentObj = new CurrentAccount();
	private static int MainAttempts;
	public static void main(String[] args) throws IOException, AccountException {
		
		while(true) {
		System.out.println(
				"1.SavingsAccounts\n"
				+ "2.CurrentAccounts\n"
				+ "3.Exit the ATM");
		
		String LOOP;
		Scanner X = new Scanner(System.in);
		LOOP = X.next();//take user input as a String 
		switch(LOOP) {//start switch statement
		case "1" : 
			SavingsObj.SavingsLogIn ();
			X.close();
			break;
			
		case "2" : 
			CurrentObj.CurrentLogIn ();
			X.close();
			break;
			
		case "3" :
			System.out.println("Thank you, bye!");
			X.close();
			System.exit(0);
			
		default:
			System.out.println("Wrong choice!");
			MainAttempts--;//decrement the variable value 
			if ( MainAttempts == 1 ) {//start if 
				System.out.println("Attention too many wrong attempts! You have one last try!");
		}//end if 
			if ( MainAttempts == 0 ) {//start if 
				System.out.println("Attention too many wrong attempts! you been kickedout");
				X.close();
				System.exit( 0 );//shutdown the system 
		}//end if 
			break;
		}
	   }
	 }
		static {
			MainAttempts = 6;
			System.out.println("This is a test ATM");
		}
}
