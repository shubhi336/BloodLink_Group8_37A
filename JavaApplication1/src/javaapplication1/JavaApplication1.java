/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import Database.*;
/**
 *
 * @author ACER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database db=new Mysql();
        if(db.openConnection()!=null){
            System.out.println("Database connected successfully!");
            
        }else{
            System.out.println("Failed to connect to database");
        }
        
        // TODO code application logic here
    }

}