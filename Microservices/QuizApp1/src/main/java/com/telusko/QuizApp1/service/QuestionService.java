package com.telusko.QuizApp1.service;

import com.telusko.QuizApp1.model.Question;
import com.telusko.QuizApp1.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public List<Question> findAll() {
        return questionRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepo.findByCategory(category);
    }

    public String addQuestion(Question question) {
            question.setId(null);
             questionRepo.save(question);
             return "Success";
    }
}
