package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;



public interface CourseDao extends JpaRepository<Product,Long> {

}
