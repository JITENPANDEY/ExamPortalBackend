package com.exam.examPortalServer.services;

import com.exam.examPortalServer.entities.exam.Category;
import com.exam.examPortalServer.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category addCategory(Category category){
        return this.categoryRepository.save(category);
    }

    public Category updateCategory(Category category){
        return this.categoryRepository.save(category);
    }
    public Category getCategory(Long cid){
        return this.categoryRepository.findById(cid).get();
    }
    public Set<Category> getCategories(){
        return new LinkedHashSet<>(this.categoryRepository.findAll());
    }
    public void deleteCategory(Long cid){
       this.categoryRepository.deleteById(cid);
    }
}
