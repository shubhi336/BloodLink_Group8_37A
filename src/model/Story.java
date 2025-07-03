/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import Dao.StoryDao;

/**
 *
 * @author ACER
 */
public class Story {
    private String username;
    private String email;
    private String phone;
    private String story;
    
    
    public Story(String username,String email,String phone, String story){
        this.username=username;
        this.email=email;
        this.phone=phone;
        this.story=story;
    }
    public String getusername(){
        return username ;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getphone(){
        return phone;
    }
    
    public String getstory(){
        return story;
    }
    
    
}
