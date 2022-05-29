package com.travelapp.backend.models;

import java.time.LocalTime;

public class API_PremadeTripItem {
 
    private Integer tripId;
    private Integer day;
    private LocalTime time;
    private String description;

    public API_PremadeTripItem(Integer tripId, Integer day, LocalTime time, String description) {
        this.tripId = tripId;
        this.day = day;
        this.time = time;
        this.description = description;
    }

    public Integer getTripId() {
        return tripId;
    }
    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }
    public Integer getDay() {
        return day;
    }
    public void setDay(Integer day) {
        this.day = day;
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
    
    public PremadeTripItem convertToEntity(PremadeTripItem premadeTrip){
        
        premadeTrip.setDay(this.day);
        premadeTrip.setDescription(this.description);
        premadeTrip.setTime(this.time);
        premadeTrip.setTripId(this.tripId);

        if (this.day == null || this.description == null || this.time == null || this.tripId == null ){
            throw new RuntimeException("All items need Day, Description, Time and TripID");
        }
        
        return premadeTrip;
    }
}
