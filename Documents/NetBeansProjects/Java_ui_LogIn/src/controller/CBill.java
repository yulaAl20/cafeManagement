/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MBill;

/**
 *
 * @author User
 */
public class CBill {
    
       public int addBill(String user, int final_total) {
        MBill ob = new MBill();
        return ob.addBill(user,final_total);
        
    }

    public ResultSet showProducts(){
       
          MBill ob = new MBill();
          return ob.showProducts();
      }
}
