package com.example.tmp.service.facade;

import com.example.tmp.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> findAll();
    public Optional<Category> findById(Long id );
    public Category save(Category category);

}
