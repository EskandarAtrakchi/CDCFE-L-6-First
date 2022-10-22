package ATM;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Scanner;

public class Bank {

    private ArrayList <Balance> List;
    Iterator<Balance> itr;

    public Bank() {
        List = new ArrayList<Balance>();
    }

    public void newAccount(Balance e) {
       List.add(e);
    }

    public Balance searchAccount(long accountNum) {
        itr = List.iterator();
        while (itr.hasNext()) {
            Balance b = new Balance(itr.next());
            if (b.getAccountNum() == accountNum)
                return b;
            System.out.println(b);
        }
        return null;
    }
    
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
    public long getBalanceListSize() {
        return List.size();
    }
}