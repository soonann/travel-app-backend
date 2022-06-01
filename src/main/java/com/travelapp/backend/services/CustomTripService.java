package com.travelapp.backend.services;

import java.util.List;

import com.travelapp.backend.models.CustomTrip;
import com.travelapp.backend.repositories.CustomTripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomTripService {


    private CustomTripRepository customTripRepository;
    
    @Autowired
    public CustomTripService(CustomTripRepository customTripRepository) {
        this.customTripRepository = customTripRepository;
    }

    public CustomTrip retrieveCustomTripById(Integer tripId){
        return this.customTripRepository.findById(tripId).orElseThrow( () -> new RuntimeException("Could not find requested CustomTrip"));
    }
    

    public List<CustomTrip> retrieveAllCustomTrips(){
        return this.customTripRepository.findAll();
    }


    public CustomTrip createNewCustomTrip(CustomTrip customTrip){
        return this.customTripRepository.save(customTrip);
    }


}
