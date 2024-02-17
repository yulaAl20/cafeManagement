/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.awt.HeadlessException;
import java.sql.*;
import static java.time.Instant.now;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import view.Menu;


public class MBill {
     private ResultSet rs;
     private ResultSet rs1;
    private Connection conn;
    
    int bill_no ;
    public int count(){
        
        try {
            DBConnection ob = new DBConnection();
            conn = ob.sqlDBConnection();
            Statement st = conn.createStatement();
            rs1 = st.executeQuery("SELECT Max(B_no) FROM Bill");
            rs1.next();
            bill_no = rs1.getInt(1)+1;
        
        } catch (SQLException ex) {
            Logger.getLogger(MMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
         return 0;
    }
    
     public ResultSet showProducts(){
      
        try {
           
            DBConnection ob = new DBConnection();
            conn = ob.sqlDBConnection();
            Statement st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM Bill");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     
  public int addBill(String seller, Double final_price) {
    int row = 0;

    try {
        count();
        DBConnection ob = new DBConnection();
        conn = ob.sqlDBConnection();

        PreparedStatement pst = conn.prepareStatement("INSERT INTO Bill (B_no, Seller, BDate, Amount) VALUES (?, ?, ?, ?)");
        pst.setInt(1, bill_no);
        pst.setString(2, seller);

        // Get the current date and format it as "yyyy/MM/dd"
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate = currentDate.format(dtf).substring(1, 10);

        pst.setString(3, formattedDate);
        pst.setDouble(4, final_price);

        row = pst.executeUpdate();
        
        conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    return row;
}

    public int addBill(String user, int final_total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
