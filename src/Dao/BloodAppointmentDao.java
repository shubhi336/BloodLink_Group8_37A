/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Database.DatabaseConnection;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author ACER
 */
public class BloodAppointmentDao {
     public static Vector<Vector<Object>> getAllBloodAppointments() {
        Vector<Vector<Object>> data = new Vector<>();

        String sql = "SELECT id, name, email, phone, blood_group  FROM appointments"; // adjust table & columns

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id"));
                row.add(rs.getString("name"));
                row.add(rs.getString("email"));
                row.add(rs.getString("phone")); 
//               
                row.add(rs.getString("blood_group"));
                
                row.add("");
                row.add(0);
                
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }
    
}
