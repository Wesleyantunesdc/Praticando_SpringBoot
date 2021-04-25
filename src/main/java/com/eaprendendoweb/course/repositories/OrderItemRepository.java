package com.eaprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eaprendendoweb.course.entities.OrderItem;
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
