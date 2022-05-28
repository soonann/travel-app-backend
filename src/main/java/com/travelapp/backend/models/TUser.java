package com.travelapp.backend.models;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity(name = "TUser")
@Table(name = "TUser")
public class TUser {

    @Id
    @SequenceGenerator(
        allocationSize = 1,
        sequenceName = "tuser_sequence",
        name = "tuser_sequence"
    )
    @GeneratedValue(
        generator = "tuser_sequence",
        strategy = GenerationType.SEQUENCE    
    )
    private Integer id;
    
    @Column(
        nullable = false,
        unique = true
    )
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

    
    private LocalDate dob;

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


    

    public TUser(Integer id, String email, String firstName, String lastName, LocalDate dob, String mobile) {
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


    public List<CustomTrip> getCustomTripList() {
        return customTripList;
    }


    public void setCustomTripList(List<CustomTrip> customTripList) {
        this.customTripList = customTripList;
    }

    
}
