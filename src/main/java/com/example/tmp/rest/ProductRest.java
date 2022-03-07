package com.example.tmp.rest;

import com.example.tmp.domain.Product;
import com.example.tmp.service.facade.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductRest {
    private ProductService productService;

    @Autowired
    public ProductRest(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product) throws Exception {
        return productService.save(product);
    }

    @GetMapping("/ref/{ref}")
    public Product findByRef(@PathVariable String ref) {
        return productService.findByRef(ref);
    }
}
