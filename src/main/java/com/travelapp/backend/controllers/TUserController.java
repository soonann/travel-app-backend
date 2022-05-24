package com.travelapp.backend.controllers;

import java.util.List;

import com.travelapp.backend.models.TUser;
import com.travelapp.backend.services.TUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api/v1/user")
public class TUserController {
    
    private final TUserService tUserService;

    @Autowired
    public TUserController(TUserService tUserService) {
        this.tUserService = tUserService;
    }

    @GetMapping
    public List<TUser> retrieveUserByEmail(){
        return this.tUserService.getAllUsers();
    }


    // TODO: Figure out how to map this properly
    @PostMapping
	public void registerNewUser(@RequestBody TUser tuser){
		this.tUserService.addNewUser(tuser);
	}

    @PutMapping
	public void updateUser(
        @RequestBody String email,
        @RequestParam(required = false) String firstName,
        @RequestParam(required = false) String lastName,
        @RequestParam(required = false) String mobile
    ){
		this.tUserService.updateUser(email, firstName, lastName, mobile);
	}

    @DeleteMapping
	public void deleteUser(@RequestBody String email){

		this.tUserService.deleteUser(email);
	}

}

