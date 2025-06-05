package Dao;

import Databasee.MySql;
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
    MySql mysql = new MySql();

    // Insert new user into the database
    public void signin(User user) {
        Connection conn = mysql.openConnection();
        String sql = "INSERT INTO users (email, username, password, phone, address, gender, blood_group, medical_history) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getPhone());
            pstmt.setString(5, user.getAddress());
            pstmt.setString(6, user.getGender());
            pstmt.setString(7, user.getBloodGroup());
            pstmt.setString(8, user.getMedicalHistory());
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mysql.CloseConnection(conn);
        }
    }

    // Check if user already exists
    public boolean checkUser(User user) {
        Connection conn = mysql.openConnection();
        String sql = "SELECT * FROM users WHERE email=? OR username=?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getUsername());
            ResultSet result = pstmt.executeQuery();
            return result.next();

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mysql.CloseConnection(conn);
        }
        return false;
    }

    public boolean registerUser(User user) {
    Connection con = null;
    PreparedStatement pst = null;

    try {
        con = mysql.openConnection();
        if (con == null) {
            System.err.println("Connection failed. Cannot proceed with registration.");
            return false;
        }

        String sql = "INSERT INTO users (email, username, password, phone, address, gender, blood_group, medical_history) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        pst = con.prepareStatement(sql);
        pst.setString(1, user.getEmail());
        pst.setString(2, user.getUsername());
        pst.setString(3, user.getPassword());
        pst.setString(4, user.getPhone());
        pst.setString(5, user.getAddress());
        pst.setString(6, user.getGender());
        pst.setString(7, user.getBloodGroup());
        pst.setString(8, user.getMedicalHistory());

        int rowsInserted = pst.executeUpdate();
        return rowsInserted > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}