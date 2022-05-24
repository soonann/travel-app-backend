package com.travelapp.backend.services;

import java.security.InvalidParameterException;
import java.util.List;

import com.travelapp.backend.models.TUser;
import com.travelapp.backend.repositories.TUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TUserService {
    
    private final TUserRepository tUserRepository;

    @Autowired
    public TUserService(TUserRepository tUserRepository) {
        this.tUserRepository = tUserRepository;
    }

    public List<TUser> getAllUsers(){
        return this.tUserRepository.findAll();
    }


}
