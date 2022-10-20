package com.springbootapplication.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapplication.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
