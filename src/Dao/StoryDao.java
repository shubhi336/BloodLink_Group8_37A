/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Database.DatabaseConnection;
import model.Story;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author ACER
 */
public class StoryDao {
    public boolean saveStroy(Story story){
        boolean success=false;
        
        try{
            Connection con=DatabaseConnection.getConnection();
            String sql="INSERT INTO stories (email,story) VALUES(?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, story.getEmail());
            pst.setString(2, story.getStroy());
            
            int rows=pst.executeUpdate();
            success=rows>0;
            
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return success;
    }
    
}
