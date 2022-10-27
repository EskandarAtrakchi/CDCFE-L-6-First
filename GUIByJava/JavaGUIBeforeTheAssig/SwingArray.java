/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package swingarray;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SwingArray {

    public static ArrayList<Integer> StaffID = new ArrayList<>();
    public static ArrayList<String> StaffName = new ArrayList<>();
    public static ArrayList<Integer> StaffPin = new ArrayList<>();
    static int index;
    
    public static void addrecords(){
        StaffID.add(0);
        StaffName.add("John");
        StaffPin.add(999);
        
        StaffID.add(1);
        StaffName.add("Paul");
        StaffPin.add(666);
        
        StaffID.add(2);
        StaffName.add("Ringo");
        StaffPin.add(111);
    }//end addrecords
    
    public static void viewstaff(){
        FirstJFrame.ViewPanel.setText(""); //clear the box
        FirstJFrame.ViewPanel.append("Index\t"+"ID\t"+"Name\t\t"+"Pin\n"); //set header
        for (int i=0; i<StaffID.size(); i++){
            FirstJFrame.ViewPanel.append(i+"\t"+StaffID.get(i).toString()+"\t"+
                    StaffName.get(i)+"\t\t"+StaffPin.get(i).toString()+"\n");
        }//end for     
    }//end viewstaff
    
    
    public static void search(){
        boolean stafffound = false;
        for (int i=0;i < StaffID.size();i++){
                if (FirstJFrame.IDField.getText().matches(Integer.toString(StaffID.get(i)))){
                    stafffound = true;
                    index = i;
                }//end if
            }//end for 
            if (stafffound == true){
                FirstJFrame.IDField.setText(Integer.toString(StaffID.get(index)));
                FirstJFrame.NameField.setText(StaffName.get(index));
                FirstJFrame.PinSlider.setValue(StaffPin.get(index));
                JOptionPane.showMessageDialog(null,"Staff Found!");
            }//end if
            
            if (stafffound == false){
                JOptionPane.showMessageDialog(null,"Staff Not Found!");
                FirstJFrame.IDField.setText(null);
                FirstJFrame.NameField.setText(null);
                FirstJFrame.PinSlider.setValue(0);

            }//end if
    }//end search
    
    public static void delete(){
        boolean stafffound = false;
        for (int i=0;i < StaffID.size();i++){
                if (FirstJFrame.IDField.getText().matches(Integer.toString(StaffID.get(i)))){
                    stafffound = true;
                    index = i;
                }//end if
            }//end for 
            if (stafffound == true){
                FirstJFrame.IDField.setText(null);
                StaffID.remove(index);
                FirstJFrame.NameField.setText(null);
                StaffName.remove(index);
                FirstJFrame.PinSlider.setValue(0);
                StaffPin.remove(index);
                JOptionPane.showMessageDialog(null,"Staff Deleted!");
            }//end if
            
            if (stafffound == false){
                JOptionPane.showMessageDialog(null,"Staff Not Found!");
                FirstJFrame.IDField.setText(null);
                FirstJFrame.NameField.setText(null);
                FirstJFrame.PinSlider.setValue(0);

            }//end if
    } //end delete

    
    
    public static void newstaff(String id, String name, int pin){
        boolean stafffound = false;
        for (int i=0;i < StaffID.size();i++){
                if (FirstJFrame.IDField.getText().matches(Integer.toString(StaffID.get(i)))){
                    stafffound = true;
                    index = i;
                }//end if
            }//end for
        
        if (stafffound == false){
            
                StaffID.add(Integer.valueOf(id));
                StaffName.add(name);
                StaffPin.add(pin);
                JOptionPane.showMessageDialog(null,"Information Added!");
            }//end if
            
            if (stafffound == true){
                JOptionPane.showMessageDialog(null,"ID in use!");
            }//end if
    }// end newstaff

    
    public static void editstaff(){
        boolean stafffound = false;
        for (int i=0;i < StaffID.size();i++){
                if (FirstJFrame.IDField.getText().matches(Integer.toString(StaffID.get(i)))){
                    stafffound = true;
                    index = i;
                }//end if
            }//end for
        if (stafffound == true){
          
                method();
                StaffName.set(index, FirstJFrame.NameField.getText());
                StaffPin.set(index, FirstJFrame.PinSlider.getValue());
                JOptionPane.showMessageDialog(null,"Staff Updated!");
            }//end if
        if (stafffound == false){
                JOptionPane.showMessageDialog(null,"Staff Not Found!");
                FirstJFrame.IDField.setText(null);
                FirstJFrame.NameField.setText(null);
                FirstJFrame.PinSlider.setValue(0);
            }//end if
    }//end editstaff
    public static void method(){
          try {
                StaffID.set(index, Integer.valueOf(FirstJFrame.IDField.getText()));
            }catch (Exception e) {
                System.out.println("NOT ALLOWED" + e);
            }
    }
    	
    /**
     *
     */
    public static void SubmitBTN(){
       
                //TextArea.show(null,"Thank you for contacting us!");
                FirstJFrame.TextArea.append("Thank you!");
               
            }//end 
}