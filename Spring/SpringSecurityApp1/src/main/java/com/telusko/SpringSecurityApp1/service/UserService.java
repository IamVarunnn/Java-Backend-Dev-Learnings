package com.telusko.SpringSecurityApp1.service;

import com.telusko.SpringSecurityApp1.dao.UserRepo;
import com.telusko.SpringSecurityApp1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user){
        return userRepo.save(user);
    }
}
