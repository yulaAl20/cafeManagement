/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MForgotPassword {
 
      private int rowsInserted;
     
     public int checkUser2(int ID,String securityQuestion,String answer, String password){
         
       try{
            
          
        DBConnection ob = new DBConnection();
        Connection conn=ob.sqlDBConnection();
        
        PreparedStatement pst = null;
        String query =  "UPDATE Staff SET E_password = ? WHERE E_no = ? AND E_security_question = ? AND E_answer = ?";

        pst = conn.prepareStatement(query);
        
       
        pst.setString(1, password);
        pst.setInt(2, ID);
        pst.setString(3, securityQuestion);
        pst.setString(4, answer);
       
        rowsInserted = pst.executeUpdate();

        conn.close();
        pst.close();
       }   
        catch(Exception x)
        {
            JOptionPane.showMessageDialog(null, x.getMessage());
        }

        return rowsInserted;
    }
}

