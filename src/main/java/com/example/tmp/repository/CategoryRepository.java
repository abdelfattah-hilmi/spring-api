package com.example.tmp.repository;

import com.example.tmp.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {
}
