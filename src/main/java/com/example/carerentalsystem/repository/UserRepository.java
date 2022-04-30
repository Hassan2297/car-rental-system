package com.example.carerentalsystem.repository;

import com.example.carerentalsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hassan Wael
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailAndLoggedInEquals(String email, boolean loggedIn);

    User findByEmailAndPassword(String email, String password);

    User findByEmail(String email);
}

