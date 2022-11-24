import java.util.Scanner;
/**
 * @author Eskandar Atrakchi
 *
 */
public class StartAtmMain {
	private static int Attempts = 6;
	static {
		System.out.println("This is a test ATM");
	}
	public static void main(String[] args) {
		while(true) {
		System.out.println(
				"1.SavingsAccounts\n"
				+ "2.CurrentAccounts\n"
				+ "3.Exit the ATM");
		SavingsAccount SavingsObj = new SavingsAccount();
		CurrentAccount CurrentObj = new CurrentAccount();
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
			Attempts--;//decrement the variable value 
			if ( Attempts == 1 ) {//start if 
				System.out.println("Attention too many wrong attempts! You have one last try!");
		}//end if 
			if ( Attempts == 0 ) {//start if 
				System.out.println("Attention too many wrong attempts! you been kickedout");
				X.close();
				System.exit( 0 );//shutdown the system 
		}//end if 
			break;
		}
	   }
	}
}
