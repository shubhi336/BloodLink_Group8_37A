package model;

public class RequestModel {
    private int id;
    private String patientName;
    private String contactNumber;
    private String bloodGroup;
    private String urgencyLevel;
    private String note;

    // Constructors
    public RequestModel() {}

    public RequestModel(String patientName, String contactNumber, String bloodGroup, String urgencyLevel, String note) {
        this.patientName = patientName;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.urgencyLevel = urgencyLevel;
        this.note = note;
    }

    // Getters and setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getBloodGroup() { return bloodGroup; }
    public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup; }

    public String getUrgencyLevel() { return urgencyLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }

    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}
