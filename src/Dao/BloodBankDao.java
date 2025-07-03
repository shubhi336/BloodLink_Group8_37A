package Dao;

import Database.DatabaseConnection;
import model.BloodBank;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BloodBankDao {

    public static List<BloodBank> getAll() {
        List<BloodBank> list = new ArrayList<>();
        String sql = "SELECT * FROM bloodbanks";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                BloodBank b = new BloodBank();
                b.setId(rs.getInt("id"));
                b.setName(rs.getString("name"));
                b.setContact(rs.getString("contact"));
                b.setLocation(rs.getString("location"));
                b.setRegion(rs.getString("region"));
                list.add(b);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public static boolean insert(String name, String contact, String location, String region) {
        String sql = "INSERT INTO bloodbanks (name, contact, location, region) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.setString(3, location);
            stmt.setString(4, region);

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteById(int id) {
        String sql = "DELETE FROM bloodbanks WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
