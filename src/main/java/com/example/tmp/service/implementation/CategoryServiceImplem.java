package com.example.tmp.service.implementation;

import com.example.tmp.domain.Category;
import com.example.tmp.repository.CategoryRepository;
import com.example.tmp.service.facade.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImplem implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id){ return categoryRepository.findById(id);}

    @Override
    public Category save(Category category){

        return categoryRepository.save(category);
    }
}
