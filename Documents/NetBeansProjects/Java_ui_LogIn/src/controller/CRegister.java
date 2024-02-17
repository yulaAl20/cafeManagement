/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MRegister;


public class CRegister {
    public int newRegistration(int ID, String name,int phone,String address,String email,String password,String securityQuestion,String answer){
     
        MRegister ob = new MRegister();
        return ob.newRegistration(ID, name, phone, address, email, password, securityQuestion, answer);
    }
}
