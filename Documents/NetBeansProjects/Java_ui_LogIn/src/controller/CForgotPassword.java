/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MForgotPassword;

/**
 *
 * @author User
 */
public class CForgotPassword {
    
     public int checkUser2(int ID,String securityQuestion,String answer, String password){
         
         MForgotPassword ob = new MForgotPassword();
         return ob.checkUser2(ID, securityQuestion, answer, password);
         
     }
}
