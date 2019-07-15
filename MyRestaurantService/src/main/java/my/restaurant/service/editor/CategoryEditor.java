package my.restaurant.service.editor;

import java.beans.PropertyEditorSupport;

import my.restaurant.entity.Category;
import my.restaurant.service.CategoryService;

public class CategoryEditor extends PropertyEditorSupport{

	
	private final CategoryService categoryService;	
	
	public CategoryEditor(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Category category = categoryService.getCategory(Integer.parseInt(text));
		setValue(category);
	}
	
	

}
