/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import Dao.LoginDao;

/**
 *
 * @author ACER
 */
public class LoginController {
private LoginDao loginDao;

    public LoginController() {
    loginDao = new LoginDao();
    }

    // New method signature with username too
    public boolean authenticateUser(String email, String username, String password) {
        return loginDao.isLoginValid(email, username, password);
    }
    
}
