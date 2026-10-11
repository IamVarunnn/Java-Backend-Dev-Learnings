package com.telusko.QuizServiceApp1.model;


import lombok.Data;

@Data
public class QuizDto {
    String categoryName;
    Integer noOfQuestions;
    String title;
}
