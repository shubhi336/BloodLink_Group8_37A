/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */
public class java {
    
    public class User {
    private int id;
    private String username;
    private String email;
    private String  password;
    
    public User (String username, String email, String password){
        this.username=username;
        this.email=email;
        this.password=password;
    }
    
    public int getid(){
        return id;
    }
    public String getusername(){
        return username;
    }
    public String getemail(){
        return email;
    }
    public String getpassword(){
        return password;
    }
    public static void main (String[]args){
        User u=new User("Pudki", "pudki31@gmail.com", "Pudki123");
            System.out.println(u.getusername());
            System.out.println(u.getemail());
            System.out.println(u.getpassword());     
    }
    
    
}
    
}
