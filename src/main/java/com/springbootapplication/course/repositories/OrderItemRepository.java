package com.springbootapplication.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootapplication.course.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
