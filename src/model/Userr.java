/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Userr {
    private int Id;
    private String Name;
    private String email;
    private String password;

    // Default constructor
    public Userr() {
    }

    // Parameterized constructor
    public Userr(int id, String name, String email, String password) {
        this.Id = id;
        this.Name = name;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }   

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

