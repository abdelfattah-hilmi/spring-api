package com.example.tmp.service.implementation;

import com.example.tmp.domain.Category;
import com.example.tmp.domain.Product;
import com.example.tmp.service.facade.CategoryService;
import com.example.tmp.service.facade.ProductService;
import com.example.tmp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplem implements ProductService {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) throws Exception {
        var id =  product.getCategory().getId();
        Optional<Category> found_cat = categoryService.findById(id);
        if(found_cat.isEmpty()){
            throw new Exception("Category not found \n");
        }
        else{
            product.setCategory(found_cat.get());
        }
        return productRepository.save(product);
    }

    @Override
    public Product findByRef(String ref) {
        return productRepository.findByRef(ref);
    }
}
