package model;

public class UserModel {
    private String name;
    
    private String gender;
    private String bloodGroup;
    private String email;
    private String phone;
    private String address;

    // Constructor
    public UserModel(String name, String gender, String bloodGroup,
                     String email, String phone, String address) {
        this.name = name;
        
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters (only showing a few, generate the rest)
    public String getName() { return name; }
    
    public String getGender() { return gender; }
    public String getBloodGroup() { return bloodGroup; }
    public String getEmail() { return email; }
    public String getphone() { return phone; }
    public String getAddress() { return address; }

    public void setName(String name) { this.name = name; }
    
    public void setGender(String gender) { this.gender = gender; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }
    public void setEmail(String email) { this.email = email; }
    public void setphone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
}
