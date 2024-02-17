/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class MRegister {
     private int rowsInserted;
     
     public int newRegistration(int ID, String name,int phone,String address,String email,String password,String securityQuestion,String answer){
         
       try{
            
          
        DBConnection ob = new DBConnection();
        Connection conn=ob.sqlDBConnection();
        
        PreparedStatement pst = null;
        String query = "insert into Staff values(?,?,?,?,?,?,?,?)";

        pst = conn.prepareStatement(query);
        
        pst.setInt(1, ID);
        pst.setString(2, name);
        pst.setInt(3, phone);
        pst.setString(4, address);
        pst.setString(5, email);
        pst.setString(6, password);
        pst.setString(7, securityQuestion);
         pst.setString(8, answer);
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
