package com.travelapp.backend.services;

import java.util.List;

import javax.management.RuntimeErrorException;

import com.travelapp.backend.models.PremadeTrip;
import com.travelapp.backend.models.PremadeTripItem;
import com.travelapp.backend.repositories.PremadeTripItemRepository;
import com.travelapp.backend.repositories.PremadeTripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PremadeTripItemService {
    
    private PremadeTripItemRepository premadeTripItemRepository;
    private PremadeTripRepository premadeTripRepository;

    @Autowired
    public PremadeTripItemService(PremadeTripItemRepository premadeTripItemRepository, PremadeTripRepository premadeTripRepository) {
        this.premadeTripItemRepository = premadeTripItemRepository;
        this.premadeTripRepository = premadeTripRepository;
    }

    public List<PremadeTripItem> retrieveAllPremadeTripItems(){
        return this.premadeTripItemRepository.findAll();
    }


    public List<PremadeTripItem> retrieveAllPremadeTripItemByTripCode(String premadeTripCode){
       return this.premadeTripItemRepository.findAllByPremadeTripTripCode(premadeTripCode);
    }

    
    public PremadeTripItem retrievePremadeTripItemByTripCodeAndTripItemId(String premadeTripCode, Integer premadeTripItemId) {
        PremadeTripItem premadeTripItem = new PremadeTripItem();
        PremadeTrip premadeTrip = new PremadeTrip();
        premadeTrip.setTripCode(premadeTripCode);
        premadeTripItem.setPremadeTrip(premadeTrip);
        premadeTripItem.setTripItemId(premadeTripItemId);
        
        PremadeTripItem premadeTripItemList = this.premadeTripItemRepository.findByTripItemIdAndPremadeTripTripCode(premadeTripItemId, premadeTripCode)
        .orElseThrow(() -> new RuntimeException("Could not find PremadeTripItem with TripCode"));
        return premadeTripItemList;
    }


    public PremadeTripItem createPremadeTripItem(String tripCode, PremadeTripItem premadeTripItem){
        PremadeTrip premadeTrip = this.premadeTripRepository.findById(tripCode)
        .orElseThrow( ()-> new RuntimeException("TripCode does not exist"));

        premadeTripItem.setPremadeTrip(premadeTrip);
        return this.premadeTripItemRepository.save(premadeTripItem);

    }

}
