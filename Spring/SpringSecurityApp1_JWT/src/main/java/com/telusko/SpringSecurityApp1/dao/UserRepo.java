package com.telusko.SpringSecurityApp1.dao;

import com.telusko.SpringSecurityApp1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
