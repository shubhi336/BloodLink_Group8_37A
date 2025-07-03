package dao;

import Database.DatabaseConnection;
import model.BloodStoryModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BloodStoryDao {

    public static List<BloodStoryModel> getAllStories() {
        List<BloodStoryModel> stories = new ArrayList<>();

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement("SELECT username, story FROM stories");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                stories.add(new BloodStoryModel(
                    rs.getString("username"),
                    rs.getString("story")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return stories;
    }
}
