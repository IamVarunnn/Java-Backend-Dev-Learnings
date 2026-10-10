package com.telusko.QuizServiceApp1.repo;


import com.telusko.QuizServiceApp1.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
}
