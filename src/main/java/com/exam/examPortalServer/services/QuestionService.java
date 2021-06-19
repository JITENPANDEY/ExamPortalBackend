package com.exam.examPortalServer.services;

import com.exam.examPortalServer.entities.exam.Question;
import com.exam.examPortalServer.entities.exam.Quiz;
import com.exam.examPortalServer.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question addQuestion(Question question){
        return this.questionRepository.save(question);
    }

    public Question updateQuestion(Question question){
        return this.questionRepository.save(question);
    }
    public Question getQuestion(Long quesId){
        return this.questionRepository.findById(quesId).get();
    }
    public Set<Question> getQuestions(){
        return new LinkedHashSet<>(this.questionRepository.findAll());
    }

    public Set<Question> getQuestionsOfQuiz(Quiz quiz){
        return  this.questionRepository.findByQuiz(quiz);
    }
    public void deleteQuestion(Long quesId){
        this.questionRepository.deleteById(quesId);
    }
}
