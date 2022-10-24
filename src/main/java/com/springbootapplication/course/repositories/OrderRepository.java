package com.springbootapplication.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapplication.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
