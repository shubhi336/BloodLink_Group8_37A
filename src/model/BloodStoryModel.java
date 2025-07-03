/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class BloodStoryModel {
    private String username;
   
    private String story;
    
    
            
            public BloodStoryModel(String username, String story ){
                
                this.username=username;
                
                this.story=story;
               
            }
            public String getUsername(){
                return username;
            }
            
            
            
            public String getStory(){
                return story;
            }
            
            
    
    
}
