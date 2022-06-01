package com.travelapp.backend.controllers;

import java.util.List;

import com.travelapp.backend.models.CustomTrip;
import com.travelapp.backend.services.CustomTripService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customtrip")
public class CustomTripController {
    
    private CustomTripService customTripService;

    @Autowired
    public CustomTripController(CustomTripService customTripService) {
        this.customTripService = customTripService;
    }


    @GetMapping
    public List<CustomTrip> retrieveAllCustomTrip(){
        return this.customTripService.retrieveAllCustomTrips();
    }

    @GetMapping( path = "{tripId}")
    public CustomTrip getCustomTripByTripId(
        @PathVariable( "tripId" ) Integer tripId
    ){
        return this.customTripService.retrieveCustomTripById(tripId);
    }


    @PostMapping
    public CustomTrip postNewCustomTrip(
        @RequestBody CustomTrip customTrip
    ){
        return this.customTripService.createNewCustomTrip(customTrip);
    }



}
