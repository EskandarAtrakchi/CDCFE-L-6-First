package ATM;//Declaring a packing location 

public class DB extends AbstractFromExistingCustomers {//start extended class 

	public DB (int AccountID, String AccountName, long AccountPin, double AccountBalance)
	{//start constructor with parameters to identify the values in the arrays in AbstractFromExistingCustomers class 
		//The super keyword is used to call the constructor of its parent class to access the parent's properties and methods
        super(AccountID,AccountName, AccountPin, AccountBalance);
    }//end constructor 
}//end class 
