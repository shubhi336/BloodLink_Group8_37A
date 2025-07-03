package Dao;

import Database.MySql;
import model.Campaign;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CampaignDao {

    // Insert a new campaign
    public static boolean insertCampaign(String name, String day, String date, String location) {
        try (Connection con = MySql.getConnection();
             PreparedStatement ps = con.prepareStatement("INSERT INTO campaigns(name, day, date, location) VALUES (?, ?, ?, ?)")) {

            ps.setString(1, name);
            ps.setString(2, day);
            ps.setString(3, date);
            ps.setString(4, location);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insert Error: " + e.getMessage());
            return false;
        }
    }

    // Delete campaign by ID (used in dynamic panel)
    public static boolean deleteCampaignById(int id) {
        try (Connection con = MySql.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM campaigns WHERE id = ?")) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            return rows > 0;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Delete Error: " + e.getMessage());
            return false;
        }
    }

    // Fetch all campaigns as List<Campaign>
    public static List<Campaign> getAllCampaigns() {
        List<Campaign> campaigns = new ArrayList<>();
        try (Connection con = MySql.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM campaigns")) {

            while (rs.next()) {
                Campaign c = new Campaign(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("day"),
                    rs.getString("date"),
                    rs.getString("location")
                );
                campaigns.add(c);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fetch Error: " + e.getMessage());
        }

        return campaigns;
    }
}
