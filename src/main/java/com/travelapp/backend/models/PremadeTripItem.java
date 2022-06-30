package com.travelapp.backend.models;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "premade_trip_item")
@Table(name = "premade_trip_item")
public class PremadeTripItem {
    
    @Id
    @Column(
        name = "trip_item_id"
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tripItemId;

    @Column( 
        name = "trip_item_days",
        nullable = false
    )
    private Integer tripItemDays;

    @Column( 
        name = "trip_item_time",
        nullable = false
    )
    private LocalTime tripItemTime;

    @Column( 
        name = "trip_item_description"
    )
    private String tripItemDescription;

    // Relations
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name="trip_code", referencedColumnName = "trip_code")
    private PremadeTrip premadeTrip;

 

    public PremadeTripItem() {
    }

    public PremadeTripItem(Integer tripItemDays, LocalTime tripItemTime, String tripItemDescription) {
        this.tripItemDays = tripItemDays;
        this.tripItemTime = tripItemTime;
        this.tripItemDescription = tripItemDescription;
    }
    
    
    

}
