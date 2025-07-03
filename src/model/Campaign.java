package model;

public class Campaign {
    private int id;
    private String name;
    private String day;
    private String date;
    private String location;

    public Campaign(int id,String name, String day, String date, String location) {
        this.id=id;
        this.date=date;
        this.name = name;
        this.day = day;
        this.date = date;
        this.location = location;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDay() { return day; }
    public String getDate() { return date; }
    public String getLocation() { return location; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDay(String day) { this.day = day; }
    public void setDate(String date) { this.date = date; }
    public void setLocation(String location) { this.location = location; }
}