package my.restaurant.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import my.restaurant.repository.UserRepository;

@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		my.restaurant.entity.User user = userRepository.findByEmailOrName(username);
		if (user == null) {
			return null;
		}
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(user.getUserRole()));
		return new User(String.valueOf(user.getId()), user.getPassword(), authorities);
		
	}

}
