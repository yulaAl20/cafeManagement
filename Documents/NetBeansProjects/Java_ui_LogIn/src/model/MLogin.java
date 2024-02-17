/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class MLogin {
    private ResultSet rs;
    private Connection conn;
    private boolean x;
    public boolean checkUserM(String user,String pw)
    {
        try
        {
            DBConnection ob = new DBConnection();
            conn=ob.sqlDBConnection();
            
            Statement stm = conn.createStatement();
            rs = stm.executeQuery("Select ID,password from Staff where ID = '"+user+"' and password = '"+pw+"'");
            
            x = rs.next();
            
            conn.close();
            rs.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return x;
    }
}

