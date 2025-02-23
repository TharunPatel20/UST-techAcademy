package jwt.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jwt.security.mongoModel.User;
import jwt.security.mongoRepository.UserRepository;



@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	UserRepository userRepo;
	
	
	@GetMapping("users")
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
}
