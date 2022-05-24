package com.travelapp.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "PremadeTrip")
@Table(name = "PremadeTrip")
public class PremadeTrip {

    @Id
    private String tripCode;

    @Column(
        nullable = false,
        name = "name"
    )
    private String name;

        
    @Column(
        nullable = false,
        name = "country"
    )
    private String country;
            
    @Column(
        nullable = false,
        name = "duration"
    )
    private Integer duration;

    public PremadeTrip() {
    }

    public PremadeTrip(String tripCode, String name, String country, Integer duration) {
        this.tripCode = tripCode;
        this.name = name;
        this.country = country;
        this.duration = duration;
    }

    public String getTripCode() {
        return tripCode;
    }

    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
    
    
    
}
