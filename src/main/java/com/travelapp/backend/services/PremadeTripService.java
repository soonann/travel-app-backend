package com.travelapp.backend.services;

import java.util.List;

import javax.transaction.Transactional;

import com.travelapp.backend.models.PremadeTrip;
import com.travelapp.backend.models.PremadeTripItem;
import com.travelapp.backend.repositories.PremadeTripItemRepository;
import com.travelapp.backend.repositories.PremadeTripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PremadeTripService {
    
    private PremadeTripRepository premadeTripRepository;
    private PremadeTripItemRepository premadeTripItemRepository;

    @Autowired
    public PremadeTripService(PremadeTripRepository premadeTripRepository, PremadeTripItemRepository premadeTripItemRepository) {
        this.premadeTripRepository = premadeTripRepository;
        this.premadeTripItemRepository = premadeTripItemRepository;
    }

    public List<PremadeTrip> retrieveAllPremadeTrips(){
        return this.premadeTripRepository.findAll();
    }

    public PremadeTrip retrievePremadeTripByCode(String code){
        return this.premadeTripRepository.findById(code).orElseThrow(() -> new RuntimeException("PremadeTrip code doesn't exist"));
        
    }

    public PremadeTrip createNewPremadeTrip(PremadeTrip premadeTrip){

        if (this.premadeTripRepository.findById(premadeTrip.getTripCode()).isPresent()){
            throw new RuntimeException("PremadeTrip with Trip Code already exists");
        }
        
        // necessary?
        PremadeTrip savedPremadeTrip = this.premadeTripRepository.save(premadeTrip);

        for (PremadeTripItem items: premadeTrip.getPremadeTripItems()){
            items.setPremadeTrip(savedPremadeTrip);
        }
        this.premadeTripItemRepository.saveAll(premadeTrip.getPremadeTripItems());
        return premadeTrip;
    }

    @Transactional
    public PremadeTrip updatePremadeTripByCode(
        String paramsTripCode,
        PremadeTrip params
    ){
        PremadeTrip premadeTrip = this.premadeTripRepository.findById(paramsTripCode).orElseThrow( () -> new RuntimeException() );
        
        // TODO: Change TripCode

        // TODO: validation 
        if (params.getTripCountry() != null){
            premadeTrip.setTripCountry(params.getTripCountry());
        }
        
        if (params.getTripName() != null){
            premadeTrip.setTripName(params.getTripName());
        }

        if (params.getTripDuration() != null){
            premadeTrip.setTripDuration(params.getTripDuration());
        }


        if (params.getPremadeTripItems() != null && !params.getPremadeTripItems().isEmpty()){

            if (premadeTrip.getPremadeTripItems() != null && !premadeTrip.getPremadeTripItems().isEmpty()){
                premadeTrip.getPremadeTripItems().addAll(params.getPremadeTripItems());
            }
            else {
                premadeTrip.setPremadeTripItems(params.getPremadeTripItems());
            }
            
        }

        this.premadeTripRepository.save(premadeTrip);
        return premadeTrip;
    }
    
    public void deletePremadeTripByCode(String code){
        this.premadeTripRepository.deleteById(code);
    }

}
