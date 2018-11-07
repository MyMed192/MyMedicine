package com.example.nichi.mymed;

public class Medicine {
    String Name;
    String Date;

    public Medicine(String name, String date) {
        Name = name;
        Date = date;

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

}
