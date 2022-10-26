package com.springbootapplication.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapplication.course.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
