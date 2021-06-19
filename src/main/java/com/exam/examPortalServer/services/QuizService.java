package com.exam.examPortalServer.services;

import com.exam.examPortalServer.entities.exam.Quiz;
import com.exam.examPortalServer.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public Quiz addQuiz(Quiz quiz){
        return this.quizRepository.save(quiz);
    }

    public Quiz updateQuiz(Quiz quiz){
        return this.quizRepository.save(quiz);
    }
    public Quiz getQuiz(Long qid){
        return this.quizRepository.findById(qid).get();
    }
    public Set<Quiz> getQuizzes(){
        return new LinkedHashSet<>(this.quizRepository.findAll());
    }
    public void deleteQuiz(Long qid){
        this.quizRepository.deleteById(qid);
    }
}
