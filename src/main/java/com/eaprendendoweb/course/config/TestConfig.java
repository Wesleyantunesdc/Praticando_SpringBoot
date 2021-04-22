package com.eaprendendoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eaprendendoweb.course.entities.User;
import com.eaprendendoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Wesley Antunes","wesley@gmail.com","988889998","123456");
		User u2 = new User(null, "Alex Green","alex@gmail.com","8889999","123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}
