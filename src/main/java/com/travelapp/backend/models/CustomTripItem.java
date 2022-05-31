package com.travelapp.backend.models;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "CustomTripItem")
@Table(name = "CustomTripItem")
public class CustomTripItem {

    @Id
    @Column(
        name = "trip_id"
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tripId;

    @Column(
        name = "trip_description",
        nullable = false
    )
    private String tripDescription;

    @Column(
        name = "trip_days",
        nullable = false
    )
    private Integer tripDays;

    @Column(
        name = "trip_time",
        nullable = false
    )
    private LocalTime tripTime;
    
    // Relations
    @OneToOne
    private CustomTrip customTrip;


    public CustomTripItem() {
      
    }

    public CustomTripItem(Integer tripDays, LocalTime tripTime, String tripDescription) {
        this.tripDays = tripDays;
        this.tripTime = tripTime;
        this.tripDescription = tripDescription;
    }

    

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public String getTripDescription() {
        return tripDescription;
    }

    public void setTripDescription(String tripDescription) {
        this.tripDescription = tripDescription;
    }

    public Integer getTripDays() {
        return tripDays;
    }

    public void setTripDays(Integer tripDays) {
        this.tripDays = tripDays;
    }

    public LocalTime getTripTime() {
        return tripTime;
    }

    public void setTripTime(LocalTime tripTime) {
        this.tripTime = tripTime;
    }

    public CustomTrip getCustomTrip() {
        return customTrip;
    }

    public void setCustomTrip(CustomTrip customTrip) {
        this.customTrip = customTrip;
    }



    
    
    
}
