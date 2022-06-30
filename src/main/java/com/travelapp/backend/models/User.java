package com.travelapp.backend.models;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity(name = "TUser")
@Table(
    name = "TUser",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "user_email_unique",
            columnNames = "user_email"
        )
    }

)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(
        name = "user_id"
    )
    private Integer userId;

    @Column(
        name = "user_email",
        nullable = false
    )
    private String userEmail;
    
    @Column(
        name = "user_first_name",
        nullable = false
    )
    private String userFirstName;

    @Column(
        name = "user_last_name",    
        nullable = false
    )
    private String userLastName;

    @Column(
        name = "user_dob",
        nullable = false
    )
    private LocalDate userDob;

    @Column(
        
        name = "user_mobile",
        nullable = false
    )
    private String userMobile;

    // Relations
    @OneToMany(mappedBy = "user")
    private List<CustomTrip> customTripList;

    public User() {
    }

    

    public User(Integer userId, String userEmail, String userFirstName, String userLastName, LocalDate userDob, String userMobile) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userDob = userDob;
        this.userMobile = userMobile;
    }

    
}
