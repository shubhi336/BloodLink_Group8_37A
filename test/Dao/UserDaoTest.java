/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Dao;

import model.User;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER
 */
public class UserDaoTest {
    
    public UserDaoTest() {
    }
    
  @Test
  public void testing(){
      assertEquals(1+1,2);
  }

    /**
     * Test of signin method, of class UserDao.
     */
    @Test
    public void testSignin() {
        System.out.println("signin");
        User user = null;
        UserDao instance = new UserDao();
        instance.signin(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUser method, of class UserDao.
     */
    @Test
    public void testCheckUser() {
        System.out.println("checkUser");
        User user = null;
        UserDao instance = new UserDao();
        boolean expResult = false;
        boolean result = instance.checkUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class UserDao.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        User user = null;
        UserDao instance = new UserDao();
        boolean expResult = false;
        boolean result = instance.registerUser(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
