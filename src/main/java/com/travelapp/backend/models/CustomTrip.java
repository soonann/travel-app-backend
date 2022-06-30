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

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
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
        name = "trip_duration"
    )
    private Integer tripDuration;

    @Column( 
        name = "trip_code"
    )
    private String customTripCode;

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
        this.customTripCode = tripCode;
    } 

    
    
    
}   
