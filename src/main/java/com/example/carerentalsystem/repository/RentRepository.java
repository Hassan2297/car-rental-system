package com.example.carerentalsystem.repository;

import com.example.carerentalsystem.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hassan Wael
 */
@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
}
