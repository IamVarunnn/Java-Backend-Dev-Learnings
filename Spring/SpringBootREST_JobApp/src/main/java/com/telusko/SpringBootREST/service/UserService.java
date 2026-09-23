package com.telusko.SpringBootREST.service;

import com.telusko.SpringBootREST.model.User;
import com.telusko.SpringBootREST.repo.UserRepo;
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