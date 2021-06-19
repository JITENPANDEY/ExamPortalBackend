package com.exam.examPortalServer.repository;

import com.exam.examPortalServer.entities.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
