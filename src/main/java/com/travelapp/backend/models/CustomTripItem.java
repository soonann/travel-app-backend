package com.travelapp.backend.models;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "CustomTripItem")
@Table(name = "CustomTripItem")
public class CustomTripItem {

    @Id
    private Integer tripId;
    private String description;
    private Integer day;
    private Time time;
    
    // Relations
    @OneToOne
    private CustomTrip customTrip;


    public CustomTripItem() {
      
    }

    public CustomTripItem(Integer tripId, Integer day, Time time, String description) {
        this.tripId = tripId;
        this.day = day;
        this.time = time;
        this.description = description;
    }

    

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    
}
