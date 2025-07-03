/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class DonationHistoryModel {
    private String date;
    private String location;
    private String bloodGroup;
    private int quantity;
    private String remarks;
    private String status;

    public DonationHistoryModel(String date, String location, String bloodGroup, int quantity, String remarks, String status) {
        this.date = date;
        this.location = location;
        this.bloodGroup = bloodGroup;
        this.quantity = quantity;
        this.remarks = remarks;
        this.status = status;
    }

    public String getDate() { return date; }
    public String getLocation() { return location; }
    public String getBloodGroup() { return bloodGroup; }
    public int getQuantity() { return quantity; }
    public String getRemarks() { return remarks; }
    public String getStatus() { return status; }
}
