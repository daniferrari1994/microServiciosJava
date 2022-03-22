package controller;

import org.springframework.web.bind.annotation.RestController;

import entity.User;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

import java.util.List;

@RestController

public class UserController {
	@GetMapping("/users")
	List<User> all(){
		return Arrays.asList(
				new User( "user1", 1),
				new User ("user2", 2)
				);
	}
}
