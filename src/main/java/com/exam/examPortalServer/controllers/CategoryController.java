package com.exam.examPortalServer.controllers;

import com.exam.examPortalServer.entities.exam.Category;
import com.exam.examPortalServer.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    //add category
    @PostMapping("/add")
    public ResponseEntity<?> addCategory(@RequestBody Category category){
        return ResponseEntity.ok(this.categoryService.addCategory(category));
    }

    //update category
    @PutMapping("/update")
    public ResponseEntity<?> updateCategory(@RequestBody Category category){
        return ResponseEntity.ok(this.categoryService.updateCategory(category));
    }

    //get category by id
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getCategory(@PathVariable Long id){
        return ResponseEntity.ok(this.categoryService.getCategory(id));
    }

    //get all category
    @GetMapping("/getAll")
    public ResponseEntity<?> getCategory(){
        return ResponseEntity.ok(this.categoryService.getCategories());
    }

    //delete a category
    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id){
       this.categoryService.deleteCategory(id);
    }
}
