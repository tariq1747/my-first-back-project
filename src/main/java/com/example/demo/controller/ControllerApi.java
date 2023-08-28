package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repository.CourseDao;


@RestController
@RequestMapping("/products")
public class ControllerApi {
	
	 @Autowired
	    private CourseDao productRepository;

	    @GetMapping("/list")
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

//	    @GetMapping("/{id}")
//	    public Product getProductById(@PathVariable Long id) {
//	        return productRepository.findById(id).orElse(null);
//	    }

	    @PostMapping
	    public Product createProduct(@RequestBody Product product) {
	        return productRepository.save(product);
	    }

	    @PutMapping("/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
	        updatedProduct.setId(id);
	        return productRepository.save(updatedProduct);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productRepository.deleteById(id);
	    }
	
	
}
