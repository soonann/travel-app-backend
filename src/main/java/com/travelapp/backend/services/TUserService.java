package com.travelapp.backend.services;

import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public void updateUser(String email, String firstName, String lastName, String mobile){
        //TODO: add more validations
        //TODO: test
        Optional<TUser> optionalUser = this.tUserRepository.findById(email);

        if (optionalUser.isEmpty()){
            throw new RuntimeException("User with email does not exist");
        }
        
        TUser tuser = optionalUser.get();
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

    
    public void deleteUser(String email){

        // TODO: add more validations
        if (this.tUserRepository.findById(email).isEmpty()){
            
            System.out.println(email+ " is the email");
            throw new RuntimeException("User does not exist");
        }

        this.tUserRepository.deleteById(email);
    }

}
