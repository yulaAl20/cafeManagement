/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnection {
    Connection conn;
    public Connection sqlDBConnection()
    {
        try
        {
            String sql="jdbc:mysql://localhost/Cafe";
            conn=DriverManager.getConnection(sql,"root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
    }
}
