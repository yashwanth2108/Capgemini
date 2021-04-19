package com.example.question_4.Repository;

import com.example.question_4.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MyUserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
}
