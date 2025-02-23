package jwt.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import jwt.security.mongoModel.User;
import jwt.security.mongoRepository.UserRepository;

@Service
public class UserService {

	@Autowired
	private  BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private UserRepository userRepository;

	public String register(User user) {
		User foundUser = userRepository.findByUsername(user.getUsername());
		
		if (foundUser != null && foundUser.getUsername().equals(user.getUsername())) return "user exixts";
		else {
			user.setPassword(passwordEncoder.encode(user.getPassword())); // Hash password
			userRepository.save(user);
			return user.toString();
		}
	}

	public String verify(User user) {
		User foundUser = userRepository.findByUsername(user.getUsername());
		if(foundUser == null) return "user not found";
		boolean found = passwordEncoder.matches(user.getPassword(), foundUser.getPassword());
		return (foundUser != null) ? (found ? "login success!" : "wrong password!") : "user not found!";
	}
}