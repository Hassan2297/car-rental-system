package com.example.carerentalsystem.repository;

import com.example.carerentalsystem.entity.BookAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hassan Wael
 */
@Repository
public interface BookAppoimentRepository extends JpaRepository<BookAppointment, Long> {
}
