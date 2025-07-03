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
    private String email;
    private String story;
    
    public Story(String email, String story){
        this.email=email;
        this.story=story;
    }
    public String getEmail(){
        return email;
    }
    
    public String getStroy(){
        return story;
    }
    
    
}
