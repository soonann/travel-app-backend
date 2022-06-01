package com.travelapp.backend.controllers;

import java.util.List;

import com.travelapp.backend.models.PremadeTrip;
import com.travelapp.backend.models.PremadeTripItem;
import com.travelapp.backend.services.PremadeTripItemService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/premadetripitem")
public class PremadeTripItemController {
    
    private PremadeTripItemService premadeTripItemService;

    @Autowired
    public PremadeTripItemController(PremadeTripItemService premadeTripItemService) {
        this.premadeTripItemService= premadeTripItemService;
    }

    @GetMapping
    public List<PremadeTripItem> getAllPremadeTripItems(){
        return this.premadeTripItemService.retrieveAllPremadeTripItems();
    }

    @GetMapping(path="/{tripCode}/{tripItemId}")
    public PremadeTripItem getPremadeTripItemByTripCodeAndTripItemId(
        @PathVariable("tripCode") String tripCode,
        @PathVariable("tripItemId") Integer tripItemId
    ){
        return this.premadeTripItemService.retrievePremadeTripItemByTripCodeAndTripItemId(tripCode, tripItemId);
    }

    @GetMapping(path="/{tripCode}")
    public List<PremadeTripItem> getAllPremadeTripItemsByTripCode(
        @PathVariable("tripCode") String tripCode
    ){
        return this.premadeTripItemService.retrieveAllPremadeTripItemByTripCode(tripCode);
    }

    
    @PostMapping(path="{tripCode}")
    public PremadeTripItem postPremadeTripItem (
        @PathVariable("tripCode") String tripCode,
        @RequestBody PremadeTripItem premadeTripItem
    ){
        return this.premadeTripItemService.createPremadeTripItem(tripCode, premadeTripItem);
    }

}
