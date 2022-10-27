/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxvalidation;

import javax.swing.JOptionPane;

/**
 *
 * @author gavin
 */
public class BoxValidation {

    public static void ButtonLogic(){
        Boolean isEmpty = false;
        if(MyFrame.IDField.getText().equals("") || MyFrame.NameField.getText().equals("")){
            isEmpty = true;
        }
        
        if(isEmpty == false){
            MyFrame.TextArea.setText(null); //reset the TextArea everytime
            MyFrame.TextArea.append("ID: "+MyFrame.IDField.getText());
            MyFrame.TextArea.append("\n"); //New line
            MyFrame.TextArea.append("Name: "+MyFrame.NameField.getText());
        }else{
            JOptionPane.showMessageDialog(null,"ID & Name can not be empty!");
        }
    }
    
    
}//end class
