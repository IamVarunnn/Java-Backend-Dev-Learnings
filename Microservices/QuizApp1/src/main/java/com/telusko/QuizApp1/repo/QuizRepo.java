package com.telusko.QuizApp1.repo;

import com.telusko.QuizApp1.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
}
