package com.travelapp.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.travelapp.backend.services.CustomTripService;
import com.travelapp.backend.services.PremadeTripService;
import com.travelapp.backend.services.UserService;


@Configuration
public class MockDataConfig {
    
    
    private UserService userService;
    private PremadeTripService premadeTripService;
    private CustomTripService customTripService;

    @Autowired
    public MockDataConfig(UserService userService, PremadeTripService premadeTripService, CustomTripService customTripService ){
        this.userService = userService;
        this.premadeTripService = premadeTripService;
        this.customTripService = customTripService;
    }

    


}
