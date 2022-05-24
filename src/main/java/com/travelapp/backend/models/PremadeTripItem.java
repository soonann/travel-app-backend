package com.travelapp.backend.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
        name = "description",
        nullable = false
    )
    private String description;
    
}
