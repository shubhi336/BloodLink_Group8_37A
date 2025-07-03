package dao;

import Database.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.RequestModel;

public class RequestDao {

    private static final String INSERT_REQUEST_SQL = 
        "INSERT INTO blood_requests (patient_name, contact_number, blood_group, urgency_level, note) VALUES (?, ?, ?, ?, ?)";

    public boolean saveRequest(RequestModel request) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_REQUEST_SQL)) {

            preparedStatement.setString(1, request.getPatientName());
            preparedStatement.setString(2, request.getContactNumber());
            preparedStatement.setString(3, request.getBloodGroup());
            preparedStatement.setString(4, request.getUrgencyLevel());
            preparedStatement.setString(5, request.getNote());

            int affectedRows = preparedStatement.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ New method to fetch all requests
    public List<RequestModel> getAllRequests() {
        List<RequestModel> requests = new ArrayList<>();
        String sql = "SELECT * FROM blood_requests";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                RequestModel req = new RequestModel();
                req.setId(rs.getInt("id"));
                req.setPatientName(rs.getString("patient_name"));
                req.setContactNumber(rs.getString("contact_number"));
                req.setBloodGroup(rs.getString("blood_group"));
                req.setUrgencyLevel(rs.getString("urgency_level"));
                req.setNote(rs.getString("note"));
                requests.add(req);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return requests;
    }
}
