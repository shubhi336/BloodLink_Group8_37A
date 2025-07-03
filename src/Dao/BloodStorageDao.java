package Dao;

import Database.DatabaseConnection;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class BloodStorageDao {

    // Get total quantities of each blood group from completed donations
    public static Map<String, Integer> getBloodStorageTotals() {
        Map<String, Integer> storageMap = new HashMap<>();
        
        // Initialize all blood groups with 0 quantity
        String[] bloodGroups = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        for (String bg : bloodGroups) {
            storageMap.put(bg, 0);
        }

        String sql = "SELECT blood_group, SUM(quantity) as total_quantity " +
                     "FROM donation_details " +
                     "WHERE donation_status = 'Completed' " +
                     "GROUP BY blood_group";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String bloodGroup = rs.getString("blood_group");
                int totalQty = rs.getInt("total_quantity");
                storageMap.put(bloodGroup, totalQty);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return storageMap;
    }
}
