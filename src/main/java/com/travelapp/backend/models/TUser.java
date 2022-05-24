package com.travelapp.backend.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name = "TUser")
@Table(name = "TUser")
public class TUser {
    
    @Id
    private String email;
    
    @Column(
        nullable = false,
        name = "firstName"
    )
    private String firstName;

    @Column(
        nullable = false,
        name = "lastName"
    )
    private String lastName;

    @Column(
        nullable = false,
        name = "dob"
    )
    private LocalDate DoB;

    @Column(
        nullable = false,
        name = "mobile"
    )
    private String mobile;

    // Relations
    
    @OneToMany(mappedBy = "tuser")
    private List<CustomTrip> customTripList;

    public TUser() {
    }


    public TUser(String email, String firstName, String lastName, LocalDate DoB, String mobile) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DoB = DoB;
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

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
}
