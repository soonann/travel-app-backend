package com.travelapp.backend.repositories;

import com.travelapp.backend.models.PremadeTripItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremadeTripItemRepository extends JpaRepository<PremadeTripItem, Integer> {
    
}
