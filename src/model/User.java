/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author VICTUS
 */
public class User {
    private String username;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String gender;
    private String bloodGroup;
    private String medicalHistory;

    // Constructor(s)
    public User() {}

    public User(String username, String email, String password, String phone, String address, String gender, String bloodGroup, String medicalHistory) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.medicalHistory = medicalHistory;
    }

    // Getters
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getGender() { return gender; }
    public String getBloodGroup() { return bloodGroup; }
    public String getMedicalHistory() { return medicalHistory; }

    // Setters (optional, if you need them)
    public void setUsername(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setGender(String gender) { this.gender = gender; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }
}

