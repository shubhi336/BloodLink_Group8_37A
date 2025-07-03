package Dao;

import java.sql.*;

public class LoginDao {

    public boolean isLoginValid(String email, String username, String password) {
        boolean isValid = false;

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodlink", "root", "IT$universe31");
            String sql = "SELECT * FROM users WHERE email = ? AND username = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, username);
            pst.setString(3, password);

            ResultSet rs = pst.executeQuery();
            isValid = rs.next(); // true if user found

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
