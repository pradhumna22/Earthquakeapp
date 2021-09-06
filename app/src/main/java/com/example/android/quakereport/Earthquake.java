package com.example.android.quakereport;

public class Earthquake {
    private  String mangnitude;
    private  String mLocation;
    private  String mDate;

    public Earthquake(String angnitude, String Location, String Date) {
        this.mangnitude = angnitude;
        this.mLocation = Location;
        this.mDate = Date;
    }

    public String getMangnitude() {
        return mangnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
