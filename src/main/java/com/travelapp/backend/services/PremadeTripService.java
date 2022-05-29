package com.travelapp.backend.services;

import java.util.List;

import com.travelapp.backend.models.PremadeTrip;
import com.travelapp.backend.repositories.PremadeTripRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PremadeTripService {
    
    private PremadeTripRepository premadeTripRepository;

    @Autowired
    public PremadeTripService(PremadeTripRepository premadeTripRepository) {
        this.premadeTripRepository = premadeTripRepository;
    }

    public List<PremadeTrip> getAllPremadeTrips(){
        return this.premadeTripRepository.findAll();
    }

    public PremadeTrip getPremadeTripByCode(String code){
        return this.premadeTripRepository.findById(code).orElseThrow(() -> new RuntimeException("PremadeTrip code doesn't exist"));
        
    }

    public void createNewPremadeTrip(PremadeTrip premadeTrip){
        this.premadeTripRepository.save(premadeTrip);
    }

    public void updatePremadeTripByCode(PremadeTrip premadeTrip){
        System.out.println("Service Layer");
        this.premadeTripRepository.save(premadeTrip);
    }
    
    public void deletePremadeTripByCode(String code){
        this.premadeTripRepository.deleteById(code);
    }

}
