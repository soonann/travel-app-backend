package com.travelapp.backend.models;

import java.util.ArrayList;
import java.util.List;

public class API_PremadeTrip {
    

    private String tripCode;
    private String name;
    private String country;
    private Integer duration;
    private List<API_PremadeTripItem> premadeTripItems;
    
    public API_PremadeTrip() {
    }

    public API_PremadeTrip(String tripCode, String name, String country, Integer duration,
            List<API_PremadeTripItem> premadeTripItems) {
        this.tripCode = tripCode;
        this.name = name;
        this.country = country;
        this.duration = duration;
        this.premadeTripItems = premadeTripItems;
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

    public List<API_PremadeTripItem> getPremadeTripItems() {
        return premadeTripItems;
    }

    public void setPremadeTripItems(List<API_PremadeTripItem> premadeTripItems) {
        this.premadeTripItems = premadeTripItems;
    }

    public PremadeTrip convertToEntity(PremadeTrip premadeTrip){
        if (this.country != null){
            premadeTrip.setCountry(country);
        }

        if(this.duration != null){
            premadeTrip.setDuration(duration);
        }

        if(this.name != null){
            premadeTrip.setName(name);
        }

        if(this.premadeTripItems != null){
            
            List<PremadeTripItem> list = new ArrayList<>();
            for (API_PremadeTripItem item: this.premadeTripItems){
                PremadeTripItem newItem = new PremadeTripItem();
                list.add(item.convertToEntity(newItem));
            }
        }

        return premadeTrip;
    }
}
