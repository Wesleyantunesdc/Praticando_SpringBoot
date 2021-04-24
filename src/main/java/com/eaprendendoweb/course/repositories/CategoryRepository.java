package com.eaprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eaprendendoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
