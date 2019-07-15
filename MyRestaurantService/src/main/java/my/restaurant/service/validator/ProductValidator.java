package my.restaurant.service.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ProductValidator implements Validator{

	public boolean supports(Class<?> clazz) {

		return false;
	}

	public void validate(Object obj, Errors err) {

		
	}

}
