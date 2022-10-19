package com.springbootapplication.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapplication.course.entity.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findall() {
		User user = new User(1L, "maria", "mari@hot.com", "798798798798", "123456789");
		return ResponseEntity.ok().body(user);
	}

	
}
