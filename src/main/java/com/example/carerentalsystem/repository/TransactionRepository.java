package com.example.carerentalsystem.repository;

import com.example.carerentalsystem.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hassan Wael
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
