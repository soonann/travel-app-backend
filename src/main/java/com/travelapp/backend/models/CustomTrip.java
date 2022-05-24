package com.travelapp.backend.models;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "CustomTrip") 
@Table(name = "CustomTrip")
public class CustomTrip {
    @Id
    @SequenceGenerator(
        name = "customtrip_sequence",
        sequenceName = "customtrip_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        generator = "customtrip_sequence",
        strategy = GenerationType.SEQUENCE
    )
    @Column( 
        name = "id",
        nullable = false
    )
    private Integer id;

    @Column( 
        name = "name",
        nullable = false
    )
    private String name;

    @Column( 
        name = "country",
        nullable = false
    )
    private String country;

    @Column( 
        name = "duration",
        nullable = false
    )
    private Integer duration;

    @Column( 
        name = "isCustom",
        nullable = false
    )
    private Boolean isCustom;

    @Column( 
        name = "tripCode"
    )
    private String tripCode;



    // private Map<Integer, List<CustomTripItem>> CustomTripItemsMap;
    
    public CustomTrip() {
    }

    public CustomTrip(Integer id, String name, String country, Integer duration, Boolean isCustom, String tripCode) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.duration = duration;
        this.isCustom = isCustom;
        this.tripCode = tripCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    public String getTripCode() {
        return tripCode;
    }

    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }

    
    
    
}   
