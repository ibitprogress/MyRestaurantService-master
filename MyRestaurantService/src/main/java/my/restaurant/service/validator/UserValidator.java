package my.restaurant.service.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import my.restaurant.entity.User;
import my.restaurant.service.UserService;

public class UserValidator implements Validator {

	@Autowired
	private final UserService userService;

	public UserValidator(UserService userService) {
		this.userService = userService;
	}

	public boolean supports(Class<?> clazz) {

		return User.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		User user = (User) target;

		if (userService.findByEmailOrName(user.getUsername()) != null) {
			errors.rejectValue("username", "user.username", "Already exist");
		}

		if (user.getUsername().isEmpty() || user.getEmail().isEmpty() || user.getFirstName().isEmpty()
				|| user.getLastName().isEmpty()|| user.getPassword().isEmpty() || user.getPassword().isEmpty()
				|| user.getPhoneNumber().isEmpty()) {
			errors.rejectValue("username","user.username", "Field can't be Empty");
			errors.rejectValue("password","user.password", "Field can't be Empty");
			errors.rejectValue("firstName","user.firstName", "Field can't be Empty");
			errors.rejectValue("lastName","user.lastName", "Field can't be Empty");
			errors.rejectValue("phoneNumber","user.phoneNumber", "Field can't be Empty");
			errors.rejectValue("email","user.email", "Field can't be Empty");		
		}
		
		if (userService.findByEmailOrName(user.getPhoneNumber()) != null) {
			errors.rejectValue("phoneNumber", "user.phoneNumber", "Already exist");
		}
		
		if (userService.findByEmailOrName(user.getEmail()) != null) {
			errors.rejectValue("email", "user.email", "Already exist");
		}

	}

}
