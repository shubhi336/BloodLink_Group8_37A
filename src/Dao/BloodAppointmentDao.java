package Dao;

import Database.DatabaseConnection;
import java.sql.*;
import java.util.Vector;

public class BloodAppointmentDao {

    // Get data from appointments + donation_details using LEFT JOIN
    public static Vector<Vector<Object>> getAllBloodAppointments() {
        Vector<Vector<Object>> data = new Vector<>();

        String sql = "SELECT a.id, a.name, a.email, a.phone, a.blood_group, " +
                     "IFNULL(d.donation_status, 'Pending') AS donation_status, " +
                     "IFNULL(d.quantity, 0) AS quantity " +
                     "FROM appointments a LEFT JOIN donation_details d ON a.id = d.appointment_id";

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                row.add(rs.getInt("id"));
                row.add(rs.getString("name"));
                row.add(rs.getString("email"));
                row.add(rs.getString("phone"));
                row.add(rs.getString("blood_group"));
                row.add(rs.getString("donation_status"));
                row.add(rs.getInt("quantity"));
                data.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return data;
    }

    // Insert or update into donation_details table
    public static boolean saveOrUpdateDonationInfo(int appointmentId, String donationStatus, int quantity, String bloodGroup) {
        String checkSql = "SELECT id FROM donation_details WHERE appointment_id = ?";
        String insertSql = "INSERT INTO donation_details (appointment_id, donation_status, quantity, blood_group) VALUES (?, ?, ?, ?)";
        String updateSql = "UPDATE donation_details SET donation_status = ?, quantity = ?, blood_group = ? WHERE appointment_id = ?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = con.prepareStatement(checkSql)) {

            checkStmt.setInt(1, appointmentId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Update
                try (PreparedStatement updateStmt = con.prepareStatement(updateSql)) {
                    updateStmt.setString(1, donationStatus);
                    updateStmt.setInt(2, quantity);
                    updateStmt.setString(3, bloodGroup);
                    updateStmt.setInt(4, appointmentId);
                    return updateStmt.executeUpdate() > 0;
                }
            } else {
                // Insert
                try (PreparedStatement insertStmt = con.prepareStatement(insertSql)) {
                    insertStmt.setInt(1, appointmentId);
                    insertStmt.setString(2, donationStatus);
                    insertStmt.setInt(3, quantity);
                    insertStmt.setString(4, bloodGroup);
                    return insertStmt.executeUpdate() > 0;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // ✅ Get name from completed donations for a given email
    public static String getNameIfDonated(String email) {
        String name = null;
        
        String sql = "SELECT a.name FROM appointments a " +
                     "JOIN donation_details d ON a.id = d.appointment_id " +
                     "WHERE a.email = ? AND d.donation_status = 'Complete' LIMIT 1";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                name = rs.getString("name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return name;
    }
}
