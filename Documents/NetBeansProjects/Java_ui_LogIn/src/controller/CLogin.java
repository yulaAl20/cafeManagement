/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MLogin;

public class CLogin {
      public boolean checkUserC(String user,String pw)
    {
        MLogin ob = new MLogin();
        return ob.checkUserM(user,pw);
    }
}
