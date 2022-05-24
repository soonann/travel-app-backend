package com.travelapp.backend.repositories;

import java.util.Optional;

import com.travelapp.backend.models.TUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserRepository extends JpaRepository<TUser, String>{

    Optional<TUser> findTUserByEmail(String email);

    
}
