package com.example.android.earthquake;

public class Word {

    private String mLocation;
    private Double mMagnitude;
    private long mTimeInMilliseconds;
    private String mSite;
    public Word(Double Magnitude, String Location, long Date, String site){
        mMagnitude = Magnitude;
        mLocation = Location;
        mTimeInMilliseconds = Date;
        mSite = site;
    }

    public String getLocation() {
        return mLocation;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mSite;
    }

}
