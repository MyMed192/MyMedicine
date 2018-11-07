package com.example.nichi.mymed;

public class Treatment {
    String Name;
    String Date;
    String State;
    String Description;

    public Treatment(String name, String date, String state, String description) {
        Name = name;
        Date = date;
        State = state;
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
