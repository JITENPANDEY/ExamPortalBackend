package com.exam.examPortalServer.repository;

import com.exam.examPortalServer.entities.exam.Question;
import com.exam.examPortalServer.entities.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Set<Question> findByQuiz(Quiz quiz);
}
