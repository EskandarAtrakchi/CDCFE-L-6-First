import java.util.ArrayList;//importing the arraylist from the utility 
import java.util.Iterator;//importing the Iterator from the utility 
//import java.util.Scanner;

public class Bank {//start class 

    private ArrayList < Balance > List;//declaring private array list to store new customers 
    Iterator < Balance > itr;//declare an iterator to go through and sreach fro specific ID when requested 
    
    public Bank() {//start constructor 
        List = new ArrayList < Balance > ();//assign List variable to the ArrayList 
    }//end 

    public void newAccount ( Balance e ) {//start a method from the class Balance with parameter (e) to pass information to the method 
       List.add(e);//add every (e) to the variable that is holding the ArrayList 
    }//end the method 

   public Balance searchAccount( long accountNum ) {//start method that calling Balance class instead of static 
        itr = List.iterator();//get the iterator method to the variable that holding the ArrayList 
        while ( itr.hasNext () ) {//start loop
            Balance b = new Balance( itr.next() );//connecting the Balance class and hold it in variable b, itr.next() is a method to keep checking in the ArrayList 
            if ( b.getAccountNum() == accountNum )//if the iterator assigned to the same value in the ArrayList
                return b;//then return b
        }
        return null;//otherwise return nothing 
    }//end method 
    
    /*
    public void searchAccountAll(long accountNum) {
        itr = List.iterator();
        while (itr.hasNext()) {
            Balance b = new Balance(itr.next());
            if (b.getAccountNum() == accountNum)
            	List.forEach( (n) -> { System.out.println(b); } );
        }
      
    }
*/
    
    /*
    
    public ArrayList<Balance> findAllMatches(String name) {
    	System.out.println("Enter a name");
    	Scanner X = new Scanner(System.in);
    	
    	   ArrayList<Balance> X = new ArrayList<Balance>();
    	   return List; 
    	} 
    	*/
    public long ReturningMethodForTheArrayList() {//start method without void 
        return List.size();//reurning the size of the ArrayList 
    }//end method 
}//end class 