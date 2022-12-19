package com.epam.ivanmaiseyenka.jwtusernamepasswordauthentication.repository;

import com.epam.ivanmaiseyenka.jwtusernamepasswordauthentication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
