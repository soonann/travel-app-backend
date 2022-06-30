package com.travelapp.backend.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "PremadeTrip")
@Table(name = "PremadeTrip")
public class PremadeTrip {

    @Id
    @Column(
        name = "trip_code"
    )
    private String tripCode;

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
    
    
    
    
}
