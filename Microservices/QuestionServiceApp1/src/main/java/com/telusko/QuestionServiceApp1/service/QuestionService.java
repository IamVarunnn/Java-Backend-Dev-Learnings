package com.telusko.QuestionServiceApp1.service;


import com.telusko.QuestionServiceApp1.model.Question;
import com.telusko.QuestionServiceApp1.model.QuestionWrapper;
import com.telusko.QuestionServiceApp1.model.Response;
import com.telusko.QuestionServiceApp1.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
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

    public ResponseEntity<String> addOrUpdateQuestion(Question question) {
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

    public ResponseEntity<String> deleteQuestion(Question question) {

        try {
            questionRepo.delete(question);
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<>("Error Cannot Delete Question", HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer noOfQuestions) {

        List<Integer> questionList = questionRepo.findRandomQuestionCategory(categoryName, noOfQuestions);

        return new ResponseEntity<>(questionList, HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionsById(List<Integer> ids) {

        List<QuestionWrapper> wrappers = new ArrayList<>();
        List<Question> questions = new ArrayList<>();

        for(Integer id : ids){
            questions.add(questionRepo.findById(id).get());
        }

        for(Question question : questions){
            QuestionWrapper wrapper = new QuestionWrapper();
            wrapper.setId(question.getId());
            wrapper.setQuestionTitle(question.getQuestionTitle());
            wrapper.setOption1(question.getOption1());
            wrapper.setOption1(question.getOption2());
            wrapper.setOption1(question.getOption3());
            wrapper.setOption1(question.getOption4());

            wrappers.add(wrapper);
        }

        return new ResponseEntity<>(wrappers, HttpStatus.OK);
    }


    public ResponseEntity<Integer> getScore(List<Response> responses) {

        int correct = 0;
        for(Response response : responses){
            Question question = questionRepo.findById(response.getId()).get();
            if(response.getResponse().equals(question.getRightAnswer())) {
                correct++;
            }
        }
        return new ResponseEntity<>(correct, HttpStatus.OK);
    }
}
