package com.eaprendendoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eaprendendoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
