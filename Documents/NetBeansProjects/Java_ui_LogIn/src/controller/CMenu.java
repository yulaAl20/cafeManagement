/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.MMenu;
import view.LogIn2;
import view.Menu;
public class CMenu {
    
    public int addMenu(String Fname,String Fcat, String Fprice){
        MMenu ob = new MMenu();
        return ob.addMenu(Fname, Fcat, Fprice);
        
    }

    public ResultSet showProducts(){
       
          MMenu ob = new MMenu();
          return ob.showProducts();
      }
    
     public ResultSet filterProducts(String Fcat1){
       
          MMenu ob = new MMenu();
          return ob.filterProducts(Fcat1);
      }
    
    public int editMenu(String Fname,String Fcat, String Fprice, int key){
        MMenu ob = new MMenu();
        return ob.editMenu(Fname, Fcat, Fprice,key);
    }
    
      public int delMenu(String Fname,String Fcat, String Fprice, int key){
        MMenu ob = new MMenu();
        return ob.delMenu(Fname, Fcat, Fprice,key);
    }
      
      
}
