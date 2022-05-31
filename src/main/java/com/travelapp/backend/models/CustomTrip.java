package com.travelapp.backend.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "CustomTrip") 
@Table(name = "CustomTrip")
public class CustomTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( 
        name = "trip_id",
        nullable = false
    )
    private Integer tripId;

    @Column( 
        name = "trip_name",
        nullable = false
    )
    private String tripName;

    @Column( 
        name = "trip_country",
        nullable = false
    )
    private String tripCountry;

    @Column( 
        name = "trip_duration",
        nullable = false
    )
    private Integer tripDuration;

    @Column( 
        name = "trip_code"
    )
    private String tripCode;

    // Relations

    @OneToOne
    private User user;
    
    @OneToMany(mappedBy = "customTrip")
    private List<CustomTripItem> customTripItems;
    


    public CustomTrip() {
    }



    public CustomTrip(Integer tripId, String tripName, String tripCountry, Integer tripDuration, String tripCode) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.tripCountry = tripCountry;
        this.tripDuration = tripDuration;
        this.tripCode = tripCode;
    }



    public Integer getTripId() {
        return tripId;
    }



    public void setTripId(Integer tripId) {
        this.tripId = tripId;
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



    public String getTripCode() {
        return tripCode;
    }



    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }



    public User getTuser() {
        return user;
    }



    public void setTuser(User user) {
        this.user = user;
    }



    public List<CustomTripItem> getCustomTripItems() {
        return customTripItems;
    }



    public void setCustomTripItems(List<CustomTripItem> customTripItems) {
        this.customTripItems = customTripItems;
    }


    
    

    
    
    
}   
