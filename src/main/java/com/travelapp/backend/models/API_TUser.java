package com.travelapp.backend.models;

import java.time.LocalDate;

public class API_TUser {

    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String mobile;

    public API_TUser() {
    }


    

    public API_TUser(Integer id, String email, String firstName, String lastName, LocalDate dob, String mobile) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.mobile = mobile;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    public Integer getId() {
        return id;
    }




    public void setId(Integer id) {
        this.id = id;
    }




    public LocalDate getDob() {
        return dob;
    }




    public void setDob(LocalDate dob) {
        this.dob = dob;
    }




    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public TUser convertToEntity(TUser tUser){

        if(this.email != null){
            tUser.setEmail(this.email);
        }

        if (this.firstName != null){
            tUser.setFirstName(this.firstName);
        }

        if(this.lastName != null){
            tUser.setLastName(this.lastName);
        }

        if(this.dob != null){
            tUser.setDob(this.dob);
        }

        if(this.mobile != null){
            tUser.setMobile(this.mobile);
        }

        return tUser;
    }


}
