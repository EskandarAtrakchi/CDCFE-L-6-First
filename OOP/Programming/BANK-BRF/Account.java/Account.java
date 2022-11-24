
public class Account {
	 
    private static int Attempts = 3;//declare int variable 
	protected int AccountID;//declare int variable 
    protected String AccountName;//declare String variable
    protected int AccountPin;//declare int variable 
    protected double AccountBalance;//declare int variable
    protected int ProtectedVarForPIN;//declare int variable 
    
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
	public Account(int accountID, String accountName, int accountPin, double accountBalance) {
		super();
		AccountID = accountID;
		AccountName = accountName;
		AccountPin = accountPin;
		AccountBalance = accountBalance;
	}
	public Account() {
	}
	@Override
	public String toString() {
		return "Account [AccountID=" + AccountID + ", AccountName=" + AccountName + ", AccountPin=" + AccountPin
				+ ", AccountBalance=" + AccountBalance + "$" + "]";
	}//end toString

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
}//end class
