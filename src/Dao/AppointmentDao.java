/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Database.DatabaseConnection;
/**
 *
 * @author ACER
 */
public class AppointmentDao {
    

    public static boolean saveAppointment(String name, String email, String phone, String time, String conditions, String location, String BloodGroup) {
        String sql = "INSERT INTO appointments (name, email, phone, time, conditions, location,blood_group) VALUES (?, ?, ?, ?, ?, ?,?)";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, time);
            ps.setString(5, conditions);
            ps.setString(6, location);
            ps.setString(7, BloodGroup);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
