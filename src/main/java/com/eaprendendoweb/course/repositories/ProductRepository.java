package com.eaprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eaprendendoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
