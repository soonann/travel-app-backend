package com.travelapp.backend.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "PremadeTrip")
@Table(name = "PremadeTrip")
public class PremadeTrip {

    @Id
    private String tripCode;

    @Column(
        nullable = false,
        name = "trip_name"
    )
    private String tripName;

        
    @Column(
        nullable = false,
        name = "trip_country"
    )
    private String tripCountry;
            
    @Column(
        nullable = false,
        name = "trip_duration"
    )
    private Integer tripDuration;


    // Relations
    @OneToMany(mappedBy = "premadeTrip")
    private List<PremadeTripItem> tripItemsList;

    public PremadeTrip() {

    }


    public PremadeTrip(String tripCode, String tripName, String tripCountry, Integer tripDuration) {
        this.tripCode = tripCode;
        this.tripName = tripName;
        this.tripCountry = tripCountry;
        this.tripDuration = tripDuration;
    }



    public String getTripCode() {
        return tripCode;
    }



    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }



    public String getTripName() {
        return tripName;
    }



    public void setTripName(String tripName) {
        this.tripName = tripName;
    }



    public String getTripCountry() {
        return tripCountry;
    }



    public void setTripCountry(String tripCountry) {
        this.tripCountry = tripCountry;
    }



    public Integer getTripDuration() {
        return tripDuration;
    }



    public void setTripDuration(Integer tripDuration) {
        this.tripDuration = tripDuration;
    }



    public List<PremadeTripItem> getPremadeTripItems() {
        return tripItemsList;
    }



    public void setPremadeTripItems(List<PremadeTripItem> tripItemsList) {
        this.tripItemsList = tripItemsList;
    }
    
    
    
    
}
