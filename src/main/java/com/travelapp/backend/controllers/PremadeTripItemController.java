package com.travelapp.backend.controllers;

import java.util.List;

import com.travelapp.backend.models.PremadeTripItem;
import com.travelapp.backend.services.PremadeTripItemService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping()
    public List<PremadeTripItem> getAllPremadeTripItems(){
        return this.premadeTripItemService.retrieveAllPremadeTripItems();
    }

    // @GetMapping(path="/{tripCode}/{tripItemId}")
    // public PremadeTripItem getPremadeTripItem(
    //     @PathVariable("{tripCode}") String tripCode,
    //     @PathVariable("{tripItemId}") Integer tripItemId
    // ){
    //     return this.premadeTripItemService.retrievePremadeTripItemByCodeAndID(tripCode, tripItemId);
    // }

}
