package com.travelapp.backend.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "PremadeTripItem")
@Table(name = "PremadeTripItem")
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
    private Time time;

    @Column( 
        name = "description"
    )
    private String description;

    // Relations

    @OneToOne
    private PremadeTrip premadeTrip;

    public PremadeTripItem() {
    }

    public PremadeTripItem(Integer tripId, Integer day, Time time, String description) {
        this.tripId = tripId;
        this.day = day;
        this.time = time;
        this.description = description;
    }
    
    

}
