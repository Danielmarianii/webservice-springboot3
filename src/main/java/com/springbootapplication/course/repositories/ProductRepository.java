package com.springbootapplication.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapplication.course.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
