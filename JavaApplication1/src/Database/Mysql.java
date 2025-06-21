/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author ACER
 */
public class Mysql implements Database{

    @Override
    public Connection openConnection() {
        try{
            String username ="root";
            String password="IT$universe31";
            String database ="oop";
            Connection connection;
            connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/"+database, username, password);
            if (connection == null){
                System.out.println("Database connection fail");
                
            }else{
                System.out.println("Database connection success");
            }
            return connection;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
            
        }
    }

    @Override
    public void CloseConnection(Connection conn) {
        try{
            if (conn!= null && !conn.isClosed()){
                conn.close();
                System.out.println("Connection close");
            }
            }catch(Exception e){
            System.out.println(e);
        }
    }
    

    @Override
    public ResultSet runQuery(Connection conn, String Query) {
        try{
            Statement stmp = conn.createStatement();
            ResultSet result = stmp.executeQuery(Query);
            return result;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
        
    }

    @Override
    public int executeUpdate(Connection conn, String Query) {
        try{
            Statement stmp=conn.createStatement();
            int result =stmp.executeUpdate(Query);
            return result;
            
        }catch(Exception e){
            System.out.println(e);
            return -1 ;
        }
       
    }
    
}
