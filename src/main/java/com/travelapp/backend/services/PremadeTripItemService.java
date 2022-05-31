package com.travelapp.backend.services;

import java.util.List;

import com.travelapp.backend.models.PremadeTripItem;
import com.travelapp.backend.repositories.PremadeTripItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PremadeTripItemService {
    
    private PremadeTripItemRepository premadeTripItemRepository;

    @Autowired
    public PremadeTripItemService(PremadeTripItemRepository premadeTripItemRepository) {
        this.premadeTripItemRepository = premadeTripItemRepository;
    }

    public List<PremadeTripItem> retrieveAllPremadeTripItems(){
        return this.premadeTripItemRepository.findAll();
    }


    // public PremadeTripItem retrievePremadeTripItemByCodeAndID(String premadeTripCode, Integer premadeTripItemId){
    //     // PremadeTripItem premadeTripItem = new PremadeTripItem();
    //     // PremadeTrip premadeTrip = new PremadeTrip();
    //     // premadeTrip.setTripCode(premadeTripCode);
    //     // premadeTripItem.setPremadeTrip(premadeTrip);
    //     // premadeTripItem.setTripId(premadeTripItemId);
        
    //     PremadeTripItem premadeTripItem = this.premadeTripItemRepository.findByTripCodeAndTripItemId(premadeTripCode, premadeTripItemId).orElseThrow(()-> new RuntimeException("Premade Trip doesn't exist"));
    //     return premadeTripItem;
    // }

}
