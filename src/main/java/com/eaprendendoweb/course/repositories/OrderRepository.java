package com.eaprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eaprendendoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}