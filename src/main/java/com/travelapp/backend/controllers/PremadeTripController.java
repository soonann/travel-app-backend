package com.travelapp.backend.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import com.travelapp.backend.models.API_PremadeTrip;
import com.travelapp.backend.models.PremadeTrip;
import com.travelapp.backend.services.PremadeTripService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping( path = "/api/v1/premadetrip")
public class PremadeTripController {
    
    
    private PremadeTripService premadeTripService;

    @Autowired
    public PremadeTripController(PremadeTripService premadeTripService) {
        this.premadeTripService = premadeTripService;
    }

    @PostMapping(path = "{code}")
    public void createNewPremadeTrip(
        @PathParam("code") String code ,
        @RequestBody PremadeTrip premadeTrip){
        premadeTrip.setTripCode(code);
        this.premadeTripService.createNewPremadeTrip(premadeTrip);
    }

    @GetMapping
    public List<PremadeTrip> getAllPremadeTrips(){
        return this.premadeTripService.getAllPremadeTrips();
    }


    @GetMapping(path = "{code}")
    public PremadeTrip getPremadeTripByCode(
        @PathParam("code") String code
    ){
        return this.premadeTripService.getPremadeTripByCode(code);
    }



    @PutMapping(path = "{code}")
    public void updatePremadeTripByCode(
        @PathParam("code") String code,
        @RequestBody API_PremadeTrip premadeTrip
    ){
        premadeTrip.setTripCode(code);
        this.premadeTripService.updatePremadeTripByCode(premadeTrip);
        
    }



    @DeleteMapping(path = "{code}")
    public void deletePremadeTripByCode(@PathParam("code") String code){
        this.premadeTripService.deletePremadeTripByCode(code);
        
    }

    

    
    
    
}
