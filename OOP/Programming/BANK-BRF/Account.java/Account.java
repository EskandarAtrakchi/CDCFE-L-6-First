
public class Account {//start class 
	 
    private static int Attempts;//declare int variable 
	protected int AccountID;//declare int variable 
    protected String AccountName;//declare String variable
    protected int AccountPin;//declare int variable 
    protected double AccountBalance;//declare int variable
    protected int ProtectedVarForPIN;//declare int variable 
    
	//generating setters and getters 

	public int getAccountID() {
		return AccountID;
	}
	public void setAccountID(int accountID) {
		AccountID = accountID;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public int getAccountPin() {
		return AccountPin;
	}
	public void setAccountPin(int accountPin) {
		AccountPin = accountPin;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}


	//starting a constructor 
	public Account(int accountID, String accountName, int accountPin, double accountBalance) {
		super();//The super keyword refers to superclass
		AccountID = accountID;
		AccountName = accountName;
		AccountPin = accountPin;
		AccountBalance = accountBalance;
	}//end constructor 

	public Account() {}//empty constructors 
	//start override toString method 

	@Override
	
	public String toString() {//start toString method 
		return "Account [AccountID=" + AccountID + ", AccountName=" + AccountName + ", AccountPin=" + AccountPin
				+ ", AccountBalance=" + AccountBalance + "$" + "]";//returning the values 
	}//end to String method 

	static { Attempts = 3; }//static block to assign attempts in static in the beginning of the run code 
	
	public static void AttemptMethod() {//start method 
		
		Attempts--;//decrement the variable value 
		System.out.println("\nYou have " 
		+ Attempts + 
		" attempts left\n");//output the decremented variable 
			if ( Attempts == 0 ) {//start if 
				System.out.println("Attention your card is blocked");
				System.exit( 0 );//shutdown the system 
		}//end if 
	}//end method 
}
