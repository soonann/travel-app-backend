package com.travelapp.backend.models;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "premade_trip_item")
@Table(name = "premade_trip_item")
public class PremadeTripItem {
    
    @Id
    private Integer tripId;

    @Column( 
        name = "day",
        nullable = false
    )
    private Integer day;

    @Column( 
        name = "time",
        nullable = false
    )
    private LocalTime time;

    @Column( 
        name = "description"
    )
    private String description;

    // Relations

    @OneToOne
    private PremadeTrip premadeTrip;

    public PremadeTripItem() {
    }

    public PremadeTripItem(Integer tripId, Integer day, LocalTime time, String description) {
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

    public PremadeTrip getPremadeTrip() {
        return premadeTrip;
    }

    public void setPremadeTrip(PremadeTrip premadeTrip) {
        this.premadeTrip = premadeTrip;
    }
    
    

}
