package com.travelapp.backend.models;

import java.time.LocalTime;

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
    private LocalTime time;
    
    // Relations
    @OneToOne
    private CustomTrip customTrip;


    public CustomTripItem() {
      
    }

    public CustomTripItem(Integer tripId, Integer day, LocalTime time, String description) {
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

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomTrip getCustomTrip() {
        return customTrip;
    }

    public void setCustomTrip(CustomTrip customTrip) {
        this.customTrip = customTrip;
    }

    
    
    
}
