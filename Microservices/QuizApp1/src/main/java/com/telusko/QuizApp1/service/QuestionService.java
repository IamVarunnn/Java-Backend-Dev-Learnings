package com.telusko.QuizApp1.service;

import com.telusko.QuizApp1.model.Question;
import com.telusko.QuizApp1.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            return new ResponseEntity<>(questionRepo.findAll(), HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {

        try {
            return new ResponseEntity<>(questionRepo.findByCategory(category), HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
            try {
                question.setId(null);
                questionRepo.save(question);
                return new ResponseEntity<>("Success", HttpStatus.CREATED);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        return new ResponseEntity<>("Error Cannot Add Question", HttpStatus.BAD_REQUEST);
    }
}
