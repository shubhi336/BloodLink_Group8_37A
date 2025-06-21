package Dao;
import Database.Mysql;
import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class UserDao {
    Mysql mysql= new Mysql();
    

public void signin(User user){
    Connection conn = mysql.openConnection();
String sql= "INSERT INTO user (username, email,password)VALUE (?,?,?)";
try(PreparedStatement pstmt= conn.prepareStatement(sql)){

    pstmt.setString(1,user.getusername());
    pstmt.setString(2,user.getemail());
    pstmt.setString(3,user.getpassword());
    pstmt.executeUpdate();

} catch (SQLException ex){
    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE,null,ex);

} finally{
    mysql.CloseConnection(conn);
}
    }


public boolean checkUser(User user){
    Connection conn= mysql.openConnection();
    String sql= "SELECT * FROM users WHERE email=? or username=?";
    try (PreparedStatement pstmt= conn.prepareStatement(sql)){
        pstmt.setString(1,user.getemail());
        pstmt.setString(2,user.getusername());
        ResultSet result= pstmt.executeQuery();
        return result.next(); 
    }catch (SQLException ex){
        Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null,ex);
        
    }finally{
        mysql.CloseConnection(conn);
    }
    return false;
}
}