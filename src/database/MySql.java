/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


/**
 *
 * @author VICTUS
 */
public class MySql implements Database{

    @Override
    public Connection openConnection() {
        try{
            String username="root";
            String password="Sos@20620426";
            String database="testdatabase";           
            Connection connection;
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/"+ database, username, password);
                
            if(connection==null){
                System.out.println("Database connection fail");
            }else{
                System.out.println("Database connection success");
            }
            return connection;
    }
        catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void CloseConnection(Connection conn) {
        try{
            if (conn != null && !conn.isClosed()){
            conn.close();
            System.out.println("Connection close");
            }
    }
        catch(SQLException e){
            System.out.println(e);
            
        }}

    @Override
    public ResultSet runQuery(Connection conn, String query) {
        try{
            Statement stmp = conn.createStatement();
            ResultSet result = stmp.executeQuery(query);
            return result;
        } catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }

    @Override
    public int executeUpdate(Connection conn, String query) {
        try{
            Statement stmp= conn.createStatement();
            int result = stmp.executeUpdate(query);
            return result;
        } catch(SQLException e){
            System.out.println(e);
            return -1;
        }
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */

