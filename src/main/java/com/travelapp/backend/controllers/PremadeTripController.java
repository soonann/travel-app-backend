package com.travelapp.backend.controllers;

import java.util.List;

import com.travelapp.backend.models.PremadeTrip;
import com.travelapp.backend.services.PremadeTripService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping( path = "api/v1/premadetrip")
public class PremadeTripController {
    
    
    private PremadeTripService premadeTripService;

    @Autowired
    public PremadeTripController(PremadeTripService premadeTripService) {
        this.premadeTripService = premadeTripService;
    }

    @GetMapping
    public List<PremadeTrip> getAllPremadeTrips(){
        return this.premadeTripService.retrieveAllPremadeTrips();
    }


    @GetMapping(path = "{tripCode}")
    public PremadeTrip getPremadeTripByCode(
        @PathVariable("tripCode") String code
    ){
        
        return this.premadeTripService.retrievePremadeTripByCode(code);
    }
    
    @PostMapping
    public PremadeTrip postNewPremadeTrip(
        @RequestBody PremadeTrip premadeTrip){
        return this.premadeTripService.createNewPremadeTrip(premadeTrip);
    }


    @PutMapping(path = "{tripCode}")
    public PremadeTrip putPremadeTripByCode(
        @PathVariable("tripCode") String tripCode,
        @RequestBody PremadeTrip premadeTrip
    ){
       
        return this.premadeTripService.updatePremadeTripByCode(tripCode, premadeTrip);
    }



    @DeleteMapping(path = "{tripCode}")
    public void deletePremadeTripByCode(
        @PathVariable("tripCode") String code
    ){
        this.premadeTripService.deletePremadeTripByCode(code);
        
    }

    

    
    
    
}
