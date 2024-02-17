/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Menu;

public class MMenu {
    private ResultSet rs;
     private ResultSet rs1;
    private Connection conn;
    private int row ;
    int prod_no ;
   
   
    public int addMenu(String Fname,String Fcat, String Fprice)
    {    
         int row = 0 ;
         Double priceValue = Double.parseDouble(Fprice);
    
        try
        {
            count();
            DBConnection ob = new DBConnection();
            conn=ob.sqlDBConnection();
            
            PreparedStatement pst = conn.prepareStatement("INSERT INTO Product (P_no, Pname, category, price) VALUES (?, ?, ?, ?)");
            pst.setInt(1, prod_no);
            pst.setString(2, Fname);
            pst.setString(3, Fcat);
            pst.setDouble(4, priceValue);
            
            row = pst.executeUpdate();
            showProducts();
     
            conn.close();
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
          
        }
        return row;
    }
    
    public ResultSet showProducts(){
      
        try {
           
            DBConnection ob = new DBConnection();
            conn = ob.sqlDBConnection();
            Statement st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM Product");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet filterProducts(String Fcat1){
      try {
        DBConnection ob = new DBConnection();
        conn = ob.sqlDBConnection();
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM Product WHERE category = ?");
        pst.setString(1, Fcat1);
        rs = pst.executeQuery();
    } catch (SQLException ex) {
        Logger.getLogger(MMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
}
    
    
    public int count(){
        
        try {
            DBConnection ob = new DBConnection();
            conn = ob.sqlDBConnection();
            Statement st = conn.createStatement();
            rs1 = st.executeQuery("SELECT Max(P_no) FROM Product");
            rs1.next();
            prod_no = rs1.getInt(1)+1;
        
        } catch (SQLException ex) {
            Logger.getLogger(MMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
    
    public int editMenu(String Fname,String Fcat, String Fprice,int key)
    {    
         int row = 0 ;
         Double priceValue = Double.parseDouble(Fprice);
    
        try
        {
            count();
            DBConnection ob = new DBConnection();
            conn=ob.sqlDBConnection();
            
            PreparedStatement pst = conn.prepareStatement("update Product set Pname=?, category=?, price=? where P_no=?");
           
            pst.setInt(4, key);
            pst.setString(1, Fname);
            pst.setString(2, Fcat);
            pst.setDouble(3, priceValue);
            
            row = pst.executeUpdate();
            showProducts();
     
            conn.close();
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
          
        }
        return row;
    }
    
    public int delMenu(String Fname,String Fcat, String Fprice,int key)
    {    
         int row = 0 ;
         double priceValue = Double.parseDouble(Fprice);
    
        try
        {
            count();
            DBConnection ob = new DBConnection();
            conn=ob.sqlDBConnection();
            
            PreparedStatement pst = conn.prepareStatement("delete from Product where P_no=?");
           
            pst.setInt(1, key);
           
            row = pst.executeUpdate();
            showProducts();
     
            conn.close();
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
          
        }
        return row;
    }
}

