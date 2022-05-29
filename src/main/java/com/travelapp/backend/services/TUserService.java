package com.travelapp.backend.services;

import java.util.List;
import java.util.Optional;


import com.travelapp.backend.models.API_TUser;
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

    public TUser getUserById(Integer id){
        Optional<TUser> tUser = this.tUserRepository.findById(id);
        if (tUser.isEmpty()){
            throw new RuntimeException("Unable to find user with ID " + id);
        }
        
        return tUser.get();
    }

    public void addNewUser(TUser tuser){

        // check user validity 
        // TODO: add more validations
        if(this.tUserRepository.findTUserByEmail(tuser.getEmail()).isPresent() ){
            throw new RuntimeException("Email is already present");
        }
        
        if(tuser.getFirstName() == null || tuser.getFirstName().length() == 0 ||tuser.getLastName() == null || tuser.getLastName().length() == 0){
            throw new RuntimeException("Invalid First/Last Names");
        }
        

        this.tUserRepository.save(tuser);
    }

    
    public void updateUser(API_TUser params){
        TUser tUser = this.tUserRepository.findById(params.getId()).orElseThrow(() -> new RuntimeException("User with id does not exist"));
        params.convertToEntity(tUser);

        this.tUserRepository.save(tUser);

    }


    public void updateUserById(Integer id, String email, String firstName, String lastName, String mobile){
        //TODO: add more validations
        //TODO: test
        TUser tuser = this.tUserRepository.findById(id).orElseThrow(() -> new RuntimeException("User with id does not exist"));
        
        // email checks
        if(email != null && this.tUserRepository.findTUserByEmail(email).isPresent()){
            throw new RuntimeException("The email address is already used");
        }
        else if (email != null){
            tuser.setEmail(email);
        }


        if (firstName != null){
            tuser.setFirstName(firstName);
        }

        if (lastName != null){
            tuser.setLastName(lastName);
        }

        if (mobile != null){
            tuser.setMobile(mobile);
        }

        this.tUserRepository.save(tuser);

    }

    
    public void deleteUserById(Integer id){

        // TODO: add more validations
        if (this.tUserRepository.findById(id).isEmpty()){
            
            throw new RuntimeException("User with id of " + id + " does not exist");
        }

        this.tUserRepository.deleteById(id);
    }

}
