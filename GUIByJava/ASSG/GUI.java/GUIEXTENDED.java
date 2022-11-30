/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentonegui;
import static assignmentonegui.GUIAssignment.jComboBox1;
import static assignmentonegui.GUIAssignment.jLabel5;
import static assignmentonegui.GUIAssignment.jLabel6;
import static assignmentonegui.GUIAssignment.jLabel8;
import static assignmentonegui.GUIAssignment.jLabel9;
import static assignmentonegui.GUIAssignment.jTextArea1;
import static assignmentonegui.GUIAssignment.jTextField1;
import static assignmentonegui.GUIAssignment.jTextField10;
import static assignmentonegui.GUIAssignment.jTextField2;
import static assignmentonegui.GUIAssignment.jTextField3;
import static assignmentonegui.GUIAssignment.jTextField4;
import static assignmentonegui.GUIAssignment.jToggleButton1;
import static assignmentonegui.GUIAssignment.jToggleButton2;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import javax.swing.JOptionPane;
/**
 *
 * @author Eskandar's Laptop
 */
public class LinkedList {
    static int index;
    static boolean Found = false; 
    public static ArrayList<Integer> UserID = new ArrayList<>();
    public static ArrayList<String> UserFirstName = new ArrayList<>();
    public static ArrayList<Integer> UserPin = new ArrayList<>();
    public static ArrayList<String> UserLastName = new ArrayList<>();
    public static ArrayList<Double> UserCurrentBalance = new ArrayList<>();
    public static ArrayList<Integer> UserAge = new ArrayList<>();
    public static ArrayList<String> UserAccountType = new ArrayList<>();
    public static ArrayList<String> UserOferDraft = new ArrayList<>();
    public static ArrayList<String> UserGender = new ArrayList<>();
    
    public static void addrecords(){
        UserID.add(101);
        UserFirstName.add("Appul");
        UserPin.add(1111);
        UserLastName.add("Tupac");
        UserCurrentBalance.add(1000.0);
        UserAge.add(20);
        UserAccountType.add("Savings");
        UserOferDraft.add("YES");
        UserGender.add("OTHER");
        
        UserID.add(102);
        UserFirstName.add("Eskandar");
        UserPin.add(2222);
        UserLastName.add("Atrakchi");
        UserCurrentBalance.add(2000.0);
        UserAge.add(21);
        UserAccountType.add("Current");
        UserOferDraft.add("NO");
        UserGender.add("MALE");
        
        UserID.add(103);
        UserFirstName.add("Yonas");
        UserPin.add(3333);
        UserLastName.add("Hafton");
        UserCurrentBalance.add(3000.0);
        UserAge.add(22);
        UserAccountType.add("Savings");
        UserOferDraft.add("YES");
        UserGender.add("FEMALE");
    }
    
    public static void ViewUsers() {
        GUIAssignment.jTextArea1.setText("");
        GUIAssignment.jTextArea1.append("ID\tF-NAME\tPIN\tL-NAME\tBALANCE\tAGE\tACCOUNT\tOVER-DRAFT\tGENDER\n\n");
        for(int i = 0; i < UserID.size(); i ++) {
            GUIAssignment.jTextArea1.append
        (UserID.get(i).toString() + "\t" + UserFirstName.get(i)
        + "\t" + UserPin.get(i).toString() + "\t" + UserLastName.get(i)
        + "\t" + UserCurrentBalance.get(i).toString() + "$\t" + UserAge.get(i).toString()
        + "\t" + UserAccountType.get(i) + "\t" + UserOferDraft.get(i) + "\t" 
        + UserGender.get(i) + "\n");
            
        }
    }
    
    public static void AddAccount () {
       
        JOptionPane.showMessageDialog(null,"ACCOUNT ADDED!");
        UserPin.add(Integer.parseInt(jTextField10.getText()));
        UserID.add(Integer.parseInt(jTextField1.getText()));
        UserFirstName.add(jTextField3.getText());
        UserLastName.add(jTextField2.getText());
        UserCurrentBalance.add(Double.parseDouble(jTextField4.getText()));
        UserAge.add(GUIAssignment.jSlider2.getValue());
        if(GUIAssignment.jToggleButton2.isSelected() == true){
            UserAccountType.add("Current");
        }
        
        else {
            
            UserAccountType.add("Saving");
        }
        
        if(GUIAssignment.jToggleButton1.isSelected() == true) {
            
            UserOferDraft.add("OVER-DRAFT");
            
        }
        
        else  {
            
            UserOferDraft.add("NOT-OVERDRAFT");
            
        }
        
        UserGender.add(jComboBox1.getSelectedItem().toString());
        
       
    }
    
    public static void search(){
        boolean UserAccount = false;
        for (int i=0;i < UserID.size();i++){
                if (GUIAssignment.jTextField1.getText().matches(Integer.toString(UserID.get(i))) || 
                       GUIAssignment.jTextField10.getText().matches(Integer.toString(UserPin.get(i)))){
                    UserAccount = true;
                    
                    index = i;
                } //end if
            //end if
            }//end for 
            if (UserAccount == true){
                Found = true;
                GUIAssignment.jButton4.setEnabled(true);
                JOptionPane.showMessageDialog(null,"Staff Found!");
                GUIAssignment.jTextField1.setText(Integer.toString(UserID.get(index)));
                GUIAssignment.jTextField10.setText(Integer.toString(UserPin.get(index)));
                GUIAssignment.jLabel5.setText(Integer.toString(UserAge.get(index)));
                GUIAssignment.jTextField4.setText(Double.toString(UserCurrentBalance.get(index)));
                GUIAssignment.jLabel8.setText(UserAccountType.get(index));
                GUIAssignment.jLabel6.setText(UserOferDraft.get(index));
                GUIAssignment.jLabel9.setText(UserGender.get(index));
                GUIAssignment.jTextField3.setText(UserFirstName.get(index));
                GUIAssignment.jTextField2.setText(UserLastName.get(index));
            }//end if
            
            else if (UserAccount == false){
                JOptionPane.showMessageDialog(null,"ATTENTION, YOU CAN SEARCH ONLY BY ((ID)) OR ((PIN)), SO, PLEASE TRY AGAIN");
            }//end if
            
            else{
            JOptionPane.showMessageDialog(null,"ID & Name can not be empty!");
            }//needs some attention here 
    }//end search
    
    public static void EditBTN () {
        for (int i=0;i < UserID.size();i++){
                if (GUIAssignment.jTextField1.getText().matches(Integer.toString(UserID.get(i)))){
                    Found = true;
                    index = i;
                }
            }
        if (Found == true){
                UserID.set(index, Integer.valueOf(GUIAssignment.jTextField1.getText()));
                //UserLastName.set(GUIAssignment.jTextField3.getText());
                UserLastName.set(index, jTextField2.getText());
                UserPin.set(index, Integer.valueOf(GUIAssignment.jTextField10.getText()));
                JOptionPane.showMessageDialog(null,"ACCOUNT HAS BEEN UPDATED");
            }
        if (Found == false){
                JOptionPane.showMessageDialog(null,"ACCOUNT NOT UPDATED!");
                GUIAssignment.jTextField1.setText(null);
                GUIAssignment.jTextField3.setText(null);
                GUIAssignment.jTextField10.setText("");
            }//end if
    }

    public static void ToggleBTNForAccountType () {
        
        if (jToggleButton2.isSelected() == true){
            jLabel8.setText("SAVINGS");
        }
        else if (jToggleButton2.isSelected() == false) {
            jLabel8.setText("CURRENT");
        }
    }
    
    public static void ToggleBTNForOverDraft () {
        
        if (jToggleButton1.isSelected() == true){
            jLabel6.setText("YES");
        }
        else if (jToggleButton1.isSelected() == false) {
            jLabel6.setText("NO");
        }
    }
    
    public static void ComboBoxGender () {
       
        jLabel9.setText(jComboBox1.getSelectedItem().toString());
        
    }
    
    public static void ClearBTN () {
        
        jTextField1.setText("");     
        jTextField2.setText("");     
        jTextField3.setText(""); 
        jTextField4.setText(""); 
        jLabel5.setText("?");
        jLabel6.setText("");
        jLabel8.setText("");
        jTextField10.setText("");
        jLabel9.setText("");
        
    }
    
    public static void DeleteAccounts () {
        boolean UserAccount = false;
        for (int i = 0; i < UserID.size(); i ++) {
            
            if (GUIAssignment.jTextField1.getText().matches(Integer.toString(UserID.get(i)))) {
                
                UserAccount = true; 
                index = i;
                
            }
        }
        
        if(UserAccount == true) {
            
            jTextField1.setText("");     
            jTextField2.setText("");     
            jTextField3.setText(""); 
            jTextField4.setText(""); 
            jLabel5.setText("?");
            jLabel6.setText("");
            jLabel8.setText("");
            jTextField10.setText("");
            jLabel9.setText("");
            UserID.remove(index);
            UserFirstName.remove(index);
            UserPin.remove(index);
            UserLastName.remove(index);
            UserCurrentBalance.remove(index);
            UserAge.remove(index);
            UserAccountType.remove(index);
            UserOferDraft.remove(index);
            UserGender.remove(index);
            JOptionPane.showMessageDialog(null,"Account Deleted!");
            
        }
        
        if (UserAccount == false) {
            
            JOptionPane.showMessageDialog(null,"ATTENTION! YOU CAN DELETE USERS BY THERE ((ID)) ONLY, PLEASE TRY AGAIN BECAUSE THE ID NOT FOUND.");
            
        }
    }
    
    public static void TextAreaInViewAll () {
        
        jTextArea1.setText("");
        
    }
    
        public static void HelpBTN () {
            
            if (GUIAssignment.jTextArea2.getText().equals("")) { 
            
                JOptionPane.showMessageDialog(null,"PLEASE, WRITE THE ISSUE BEFORE YOU SEND US..");
                
            }
            
            else {
                
                JOptionPane.showMessageDialog(null,"THANK YOU FOR CONTACTING US, WE WILL BE IN TOUCH WITH YOU SOON!.");
                
            }
            
            GUIAssignment.jTextArea2.setText("");
            
        }
        
        public static void Statistics () {
            
            //HOW MANY ACCOUNTS ARE IN THE BANK
            GUIAssignment.jTextField5.setText("There are " + UserID.size() + " accounts in this bank");
            
            //HOW MUCH MONEY IS IN THE BANK 
            double AmountOfMoney = 0;
            
            for(int i = 0; i < UserCurrentBalance.size(); i ++ ) {
                
                AmountOfMoney += UserCurrentBalance.get(i);
                
            }
            
            GUIAssignment.jTextField6.setText("There are " + AmountOfMoney + "$ in this bank");
            
            //HIGHEST AMOUNT OF MONEY IN THE BANK 
            double HighestAmount = Collections.max(UserCurrentBalance);
            
            GUIAssignment.jTextField7.setText("The highest amount of money is  " + HighestAmount + "$");
            
            //AVERAGE AMOUNT OF MONEY PER PERSON 
            double AvgAmountOfMoney = 0;
            
            for(int i = 0; i < UserCurrentBalance.size(); i ++ ) {
                
                AvgAmountOfMoney += UserCurrentBalance.get(i);
                
            }
            
            GUIAssignment.jTextField8.setText("The Avg $ per account is " + AvgAmountOfMoney / UserCurrentBalance.size()  + "$");
            
            //HIGHEST AMOUNT OF MONEY IN THE BANK 
            double LowestAmount = Collections.min(UserCurrentBalance);
            
            GUIAssignment.jTextField9.setText("The lowest amount of money is  " + LowestAmount + "$");
                
        }
}

    

