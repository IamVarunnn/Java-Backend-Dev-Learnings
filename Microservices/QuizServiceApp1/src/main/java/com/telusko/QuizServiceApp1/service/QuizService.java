package com.telusko.QuizServiceApp1.service;




import com.telusko.QuizServiceApp1.feign.QuizInterface;
import com.telusko.QuizServiceApp1.model.QuestionWrapper;
import com.telusko.QuizServiceApp1.model.Quiz;
import com.telusko.QuizServiceApp1.model.Response;
import com.telusko.QuizServiceApp1.repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    QuizInterface quizInterface;

//    @Autowired
//    private QuestionRepo questionRepo;

    public ResponseEntity<String> createQuiz(String category, int noOfQuestions, String title) {


        List<Integer> questions = quizInterface.getQuestionsForQuiz(category, noOfQuestions).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizRepo.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Quiz quiz = quizRepo.findById(id).get();

        List<Integer> questionIds = quiz.getQuestionIds();

        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionIds);
        return questions;

    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {

        ResponseEntity<Integer> correct = quizInterface.getScore(responses);

        return correct;
    }
}
