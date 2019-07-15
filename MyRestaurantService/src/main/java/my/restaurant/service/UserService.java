package my.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import my.restaurant.entity.User;
import my.restaurant.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public User userSave(User user){	
		user.setPassword(encoder.encode(user.getPassword()));
		user.setUserRole("ROLE_USER");	
		return userRepository.save(user);
	}
	
	public User userUpdateInfo(User user){
		user.setUserRole("ROLE_USER");	
		return userRepository.save(user);
	}
	
	public User getUser(int id){
		return userRepository.findOne(id);
	}
	
	public User getUserStringId(String id){
		return userRepository.findByEmailOrName(id);
	}
	
	public Object findByEmailOrName(String username) {
		return userRepository.findByEmailOrName(username);
	}
	
}
