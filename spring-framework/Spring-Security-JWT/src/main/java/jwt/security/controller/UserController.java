package jwt.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jwt.security.mongoModel.User;
import jwt.security.mongoRepository.UserRepository;

@RestController
public class UserController {
	
	
	@Autowired
	UserRepository userRepository;
	
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	

	@PostMapping("/login")
	public String verifyUser(@RequestBody User user) {
		Object obj = userRepository.findByUsername(user.getUsername());
		if(obj != null) {
			return "success";
		}
		return "login failed";
	}

	
}
