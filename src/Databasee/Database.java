/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Databasee;
import java.sql.*;
/**
 *
 * @author VICTUS
 */
public interface Database {
    Connection openConnection();
    void CloseConnection(Connection conn);
    ResultSet runQuery(Connection conn, String query); //reference type
    int executeUpdate(Connection conn,String query);
}
