package com.telusko.QuizServiceApp1.service;



import com.telusko.QuizServiceApp1.model.Question;
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

//    @Autowired
//    private QuestionRepo questionRepo;

    public ResponseEntity<String> createQuiz(String category, int noOfQuestions, String title) {

        List<Question> questionList = questionRepo.findRandomQuestionCategory(category, noOfQuestions);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionList(questionList);
        quizRepo.save(quiz);

        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        List<Question> questionFromDB = quiz.get().getQuestionList();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();

        for(Question q : questionFromDB){
            QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            questionsForUser.add(questionWrapper);
        }

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);

    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizRepo.findById(id).get();

        List<Question> questionList = quiz.getQuestionList();

        int correct = 0;
        int i = 0;
        for(Response response : responses){

            if(response.getResponse().equals(questionList.get(i).getRightAnswer())){
                correct++;
            }
            i++;
        }
        return new ResponseEntity<>(correct, HttpStatus.OK);
    }
}
