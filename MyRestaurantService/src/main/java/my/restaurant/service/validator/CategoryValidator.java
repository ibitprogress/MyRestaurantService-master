package my.restaurant.service.validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import my.restaurant.entity.Category;
import my.restaurant.service.CategoryService;

public class CategoryValidator implements Validator{
	
	@Autowired
	private CategoryService categoryService;	
	
	public CategoryValidator(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public boolean supports(Class<?> clazz) {
		return Category.class.equals(clazz);
	}

	public void validate(Object target, Errors error) {
		Category category = (Category)target;
		
		
		
	}

}
