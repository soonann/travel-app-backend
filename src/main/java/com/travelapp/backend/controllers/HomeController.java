package com.travelapp.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
@CrossOrigin(origins = "*")
public class HomeController {
    @GetMapping
    public String homePage(){
        return "HEAP Backend API Server";
    }

}
