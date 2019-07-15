package my.restaurant.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import my.restaurant.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	@Query("select u from User u where u.username = :login")
	User findByEmailOrName(@Param(value = "login") String login);
	
}
