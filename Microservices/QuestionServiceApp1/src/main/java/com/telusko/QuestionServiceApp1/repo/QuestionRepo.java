package com.telusko.QuestionServiceApp1.repo;



import com.telusko.QuestionServiceApp1.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM question q where q.category=:category ORDER BY RAND() LIMIT :noOfQuestions", nativeQuery = true)

    List<Integer> findRandomQuestionCategory(String category, int noOfQuestions);
}
