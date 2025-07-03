package Dao;

import Database.DatabaseConnection;
import model.UserModel;
import java.sql.*;

public class EditDao {

    public boolean userExists(String email) {
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE email = ?")) {

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUser(UserModel user) {
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("UPDATE users SET username = ?,  gender = ?, blood_group = ?, phone = ?, address = ? WHERE email = ?")) {

            pst.setString(1, user.getName());
            
            pst.setString(2, user.getGender());
            pst.setString(3, user.getBloodGroup());
            pst.setString(4, user.getphone());
            pst.setString(5, user.getAddress());
            pst.setString(6, user.getEmail());

            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public UserModel getUserByEmail(String email) {
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("SELECT * FROM users WHERE email = ?")) {

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return new UserModel(
                    rs.getString("username"),
                    
                    rs.getString("gender"),
                    rs.getString("blood_group"),
                    rs.getString("email"),
                    rs.getString("phone"),
                    rs.getString("address")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
