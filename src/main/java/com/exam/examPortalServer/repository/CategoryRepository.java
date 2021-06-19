package com.exam.examPortalServer.repository;

import com.exam.examPortalServer.entities.exam.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
