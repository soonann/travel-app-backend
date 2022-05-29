package com.travelapp.backend.controllers;

import java.util.List;

import com.travelapp.backend.models.TUser;
import com.travelapp.backend.services.TUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public List<TUser> getAllUsers(){
        return this.tUserService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public TUser getUserById(@PathVariable("id") Integer id){
        return this.tUserService.getUserById(id);
    }

  
    @PostMapping
	public void addNewUser(@RequestBody TUser tuser){
		this.tUserService.addNewUser(tuser);
	}

    @PutMapping(path = "{id}")
	public void updateUserById(
        @PathVariable("id") Integer id,
        @RequestBody TUser user
    ){
        user.setId(id);
        System.out.println("received id: " + id + "," + user.getEmail() + "," + user.getFirstName() + "," + user.getLastName() + "," + user.getMobile());
		this.tUserService.updateUser(user);
	}

    @DeleteMapping(path = "{id}")
	public void deleteUserById(@PathVariable("id") Integer id){

		this.tUserService.deleteUserById(id);
	}

}

