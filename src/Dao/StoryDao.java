package Dao;

import Database.DatabaseConnection;
import model.Story;
import java.sql.*;

public class StoryDao {
    public boolean saveStory(Story story) {
        boolean success = false;

        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "INSERT INTO stories (username, email, phone, story) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, story.getusername());
            pst.setString(2, story.getemail());
            pst.setString(3, story.getphone());
            pst.setString(4, story.getstory());

            int rows = pst.executeUpdate();
            success = rows > 0;

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return success;
    }
}
