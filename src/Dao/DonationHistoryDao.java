package Dao;

import Database.DatabaseConnection;
import model.DonationHistoryModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DonationHistoryDao {

    public static List<DonationHistoryModel> fetchDonationHistory(String email) {
        List<DonationHistoryModel> historyList = new ArrayList<>();

        String sql = "SELECT a.time AS date, a.location, a.blood_group, d.quantity, a.conditions AS remarks, d.donation_status AS status " +
                     "FROM appointments a " +
                     "JOIN donation_details d ON a.id = d.appointment_id " +
                     "WHERE a.email = ? AND d.donation_status = 'Complete'";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                DonationHistoryModel history = new DonationHistoryModel(
                    rs.getString("date"),
                    rs.getString("location"),
                    rs.getString("blood_group"),
                    rs.getInt("quantity"),
                    rs.getString("remarks"),
                    rs.getString("status")
                );
                historyList.add(history);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return historyList;
    }
}
